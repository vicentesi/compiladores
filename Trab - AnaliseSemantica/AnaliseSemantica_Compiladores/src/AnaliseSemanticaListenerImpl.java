import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;

public class AnaliseSemanticaListenerImpl extends AnaliseSemanticaBaseListener {

	final String GLOBAL = "global";
	final String INT = "int";
	final String STRING = "string";

	// TODO: ver questão de escopo, professor perguntou a todos os grupos e
	// creio que ninguém chegou a implementar.

	AnaliseSemanticaSymbolTable symbolTable = new AnaliseSemanticaSymbolTable();

	@Override
	public void enterVardecl(AnaliseSemanticaParser.VardeclContext ctx) {
		// verificar se o tipo declarado existe
		if (ctx.type() == null
				|| (!symbolTable.types.contains(ctx.type().getText()) && !symbolTable.classes.contains(ctx
						.type().getText()))) {
			System.err.println("Tipo " + ctx.type().getText() + " inexistente.");
			System.exit(0);
		}

		// verificar existencia de variavel com mesmo nome
		if (ctx.ident() == null) {
			System.err.println("Variável " + ctx.ident().toString() + " incompatível.");
			System.exit(0);
		}
		Var var = new Var(ctx.ident(0).getText(), ctx.type().getText());
		if (ctx.getParent().getClass().equals(AnaliseSemanticaParser.ClassbodyContext.class)) {
			String escopo = ((AnaliseSemanticaParser.ClassdeclContext) ctx.getParent().getParent()).ident(0)
					.getText();
			System.out.println("Escopo: " + escopo); // DEBUG
			System.out.println("Body: " + ctx.ident(0).getText()); // DEBUG
			if (symbolTable.variables.get(escopo).contains(var)) {
				System.err.println("Variável " + ctx.ident(0).toString() + " já declarada.");
				System.exit(0);
			}
		} else {
			AnaliseSemanticaParser.MethoddeclContext metDecl = ((AnaliseSemanticaParser.MethoddeclContext) ctx
					.getParent().getParent().getParent().getParent().getParent());
			String funName = metDecl.ident().getText();
			System.out.println("Função: " + funName);
			if (!symbolTable.variables.containsKey(funName)) {
				System.err.println("Função " + funName + " inexistente");
				System.exit(0);
				System.exit(0);
			}
			if (symbolTable.variables.get(funName).contains(var)) {
				System.err.println("Variável " + ctx.ident(0).toString() + " já declarada.");
				System.exit(0);
			}
			if (symbolTable.variables.get(GLOBAL).contains(ctx.ident().toString())) {
				System.err.println("Variável " + ctx.ident().toString() + " já declarada.");
				System.exit(0);
			}
		}

		// adiciona nova variavel
		String varName = ctx.ident(0).getText();
		String type = ctx.type().getText();
		Var varA;
		if (INT.equals(type))
			varA = new Var(varName, INT);
		else if (STRING.equals(type))
			varA = new Var(varName, STRING);
		else
			varA = new Var(varName, type);

		if (symbolTable.variables.containsKey(ctx.getParent().getText())) {
			symbolTable.variables.get(ctx.getParent().getText()).add(varA);
		} else {
			HashSet<Var> hashSetAux = new HashSet<Var>();
			hashSetAux.add(varA);
			symbolTable.variables.put(ctx.getParent().getText(), hashSetAux);
		}
	}

	@Override
	public void enterClassdecl(AnaliseSemanticaParser.ClassdeclContext ctx) {
		// não trata escopo de classe, melhor não!
		String type = ctx.getChild(1).getText();
		if (symbolTable.classes.contains(type)) {
			System.err.println("Classe " + type + " já existente.");
			System.exit(0);
		} else if (ctx.getChild(2).equals("extends")) {
			String typeExtends = ctx.getChild(3).getText();
			if (!symbolTable.classes.contains(typeExtends)) {
				System.err.println("Classe " + typeExtends + " não pode ser estendida");
				System.exit(0);
			}
		}
		symbolTable.classes.add(type);
		symbolTable.functions.put(type, new HashSet<Function>());
		symbolTable.variables.put(type, new HashSet<Var>());
	}

	@Override
	public void enterMethoddecl(AnaliseSemanticaParser.MethoddeclContext ctx) {
		String type = ctx.type().getText();
		String funName = ctx.ident().getText();
		// verifica tipo de retorno da função declarada
		if (ctx.type() == null || (!symbolTable.types.contains(type) && !symbolTable.classes.contains(type))) {
			System.err.println("Declaração de função " + funName + " inválida. " + "Tipo de retorno " + type
					+ " inexistente. ");
			System.exit(0);
		}

		// verifica funcao já existente
		ArrayList<String> parameters = new ArrayList<>();
		Function f = new Function(funName, parameters);
		String className = ((AnaliseSemanticaParser.ClassdeclContext) ctx.getParent().getParent()).ident(0)
				.getText();

		for (Iterator<Function> i = symbolTable.functions.get(className).iterator(); i.hasNext();) {
			if (f.equals(i.next())) {
				System.err.println("Declaração de função " + funName + " já existente. ");
				System.exit(0);
			}
		}
		symbolTable.functions.get(className).add(f);
		symbolTable.variables.put(funName, new HashSet<Var>());
	}

	@Override
	public void enterParamlist(AnaliseSemanticaParser.ParamlistContext ctx) {
		String functionName = ctx.getParent().getParent().getText();
		ArrayList<String> parameters = new ArrayList<>();
		for (AnaliseSemanticaParser.TypeContext type : ctx.type()) {
			parameters.add(type.getText());
			if (!symbolTable.types.contains(type.getText()) && !symbolTable.classes.contains(type.getText())) {
				System.err.println("Tipo " + type.getText() + " inexistente");
			}
		}
		Function function = new Function(functionName, parameters);
		if (symbolTable.functions.containsKey(functionName)
				&& symbolTable.functions.get(functionName).contains(function)) {
			System.err.println("Função " + functionName + "(" + parameters.toString() + ") já declarada.");
		}
	}

	@Override
	public void exitPrintstat(AnaliseSemanticaParser.PrintstatContext ctx) {
		System.out.println(ctx.expr().getText());

	}

}

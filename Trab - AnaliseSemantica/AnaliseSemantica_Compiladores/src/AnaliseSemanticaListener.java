// Generated from AnaliseSemantica.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AnaliseSemanticaParser}.
 */
public interface AnaliseSemanticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AnaliseSemanticaParser#arglist}.
	 * @param ctx the parse tree
	 */
	void enterArglist(@NotNull AnaliseSemanticaParser.ArglistContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseSemanticaParser#arglist}.
	 * @param ctx the parse tree
	 */
	void exitArglist(@NotNull AnaliseSemanticaParser.ArglistContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnaliseSemanticaParser#classbody}.
	 * @param ctx the parse tree
	 */
	void enterClassbody(@NotNull AnaliseSemanticaParser.ClassbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseSemanticaParser#classbody}.
	 * @param ctx the parse tree
	 */
	void exitClassbody(@NotNull AnaliseSemanticaParser.ClassbodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnaliseSemanticaParser#switchcasestat}.
	 * @param ctx the parse tree
	 */
	void enterSwitchcasestat(@NotNull AnaliseSemanticaParser.SwitchcasestatContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseSemanticaParser#switchcasestat}.
	 * @param ctx the parse tree
	 */
	void exitSwitchcasestat(@NotNull AnaliseSemanticaParser.SwitchcasestatContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnaliseSemanticaParser#returnstat}.
	 * @param ctx the parse tree
	 */
	void enterReturnstat(@NotNull AnaliseSemanticaParser.ReturnstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseSemanticaParser#returnstat}.
	 * @param ctx the parse tree
	 */
	void exitReturnstat(@NotNull AnaliseSemanticaParser.ReturnstatContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnaliseSemanticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull AnaliseSemanticaParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseSemanticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull AnaliseSemanticaParser.ExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnaliseSemanticaParser#dowhilestat}.
	 * @param ctx the parse tree
	 */
	void enterDowhilestat(@NotNull AnaliseSemanticaParser.DowhilestatContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseSemanticaParser#dowhilestat}.
	 * @param ctx the parse tree
	 */
	void exitDowhilestat(@NotNull AnaliseSemanticaParser.DowhilestatContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnaliseSemanticaParser#paramlist}.
	 * @param ctx the parse tree
	 */
	void enterParamlist(@NotNull AnaliseSemanticaParser.ParamlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseSemanticaParser#paramlist}.
	 * @param ctx the parse tree
	 */
	void exitParamlist(@NotNull AnaliseSemanticaParser.ParamlistContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnaliseSemanticaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull AnaliseSemanticaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseSemanticaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull AnaliseSemanticaParser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnaliseSemanticaParser#printstat}.
	 * @param ctx the parse tree
	 */
	void enterPrintstat(@NotNull AnaliseSemanticaParser.PrintstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseSemanticaParser#printstat}.
	 * @param ctx the parse tree
	 */
	void exitPrintstat(@NotNull AnaliseSemanticaParser.PrintstatContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnaliseSemanticaParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdent(@NotNull AnaliseSemanticaParser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseSemanticaParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdent(@NotNull AnaliseSemanticaParser.IdentContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnaliseSemanticaParser#ifstat}.
	 * @param ctx the parse tree
	 */
	void enterIfstat(@NotNull AnaliseSemanticaParser.IfstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseSemanticaParser#ifstat}.
	 * @param ctx the parse tree
	 */
	void exitIfstat(@NotNull AnaliseSemanticaParser.IfstatContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnaliseSemanticaParser#statlist}.
	 * @param ctx the parse tree
	 */
	void enterStatlist(@NotNull AnaliseSemanticaParser.StatlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseSemanticaParser#statlist}.
	 * @param ctx the parse tree
	 */
	void exitStatlist(@NotNull AnaliseSemanticaParser.StatlistContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnaliseSemanticaParser#methodbody}.
	 * @param ctx the parse tree
	 */
	void enterMethodbody(@NotNull AnaliseSemanticaParser.MethodbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseSemanticaParser#methodbody}.
	 * @param ctx the parse tree
	 */
	void exitMethodbody(@NotNull AnaliseSemanticaParser.MethodbodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnaliseSemanticaParser#constructdecl}.
	 * @param ctx the parse tree
	 */
	void enterConstructdecl(@NotNull AnaliseSemanticaParser.ConstructdeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseSemanticaParser#constructdecl}.
	 * @param ctx the parse tree
	 */
	void exitConstructdecl(@NotNull AnaliseSemanticaParser.ConstructdeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnaliseSemanticaParser#atribstat}.
	 * @param ctx the parse tree
	 */
	void enterAtribstat(@NotNull AnaliseSemanticaParser.AtribstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseSemanticaParser#atribstat}.
	 * @param ctx the parse tree
	 */
	void exitAtribstat(@NotNull AnaliseSemanticaParser.AtribstatContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnaliseSemanticaParser#unaryexpr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryexpr(@NotNull AnaliseSemanticaParser.UnaryexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseSemanticaParser#unaryexpr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryexpr(@NotNull AnaliseSemanticaParser.UnaryexprContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnaliseSemanticaParser#readstat}.
	 * @param ctx the parse tree
	 */
	void enterReadstat(@NotNull AnaliseSemanticaParser.ReadstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseSemanticaParser#readstat}.
	 * @param ctx the parse tree
	 */
	void exitReadstat(@NotNull AnaliseSemanticaParser.ReadstatContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnaliseSemanticaParser#alocexpr}.
	 * @param ctx the parse tree
	 */
	void enterAlocexpr(@NotNull AnaliseSemanticaParser.AlocexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseSemanticaParser#alocexpr}.
	 * @param ctx the parse tree
	 */
	void exitAlocexpr(@NotNull AnaliseSemanticaParser.AlocexprContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnaliseSemanticaParser#classlist}.
	 * @param ctx the parse tree
	 */
	void enterClasslist(@NotNull AnaliseSemanticaParser.ClasslistContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseSemanticaParser#classlist}.
	 * @param ctx the parse tree
	 */
	void exitClasslist(@NotNull AnaliseSemanticaParser.ClasslistContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnaliseSemanticaParser#whilestat}.
	 * @param ctx the parse tree
	 */
	void enterWhilestat(@NotNull AnaliseSemanticaParser.WhilestatContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseSemanticaParser#whilestat}.
	 * @param ctx the parse tree
	 */
	void exitWhilestat(@NotNull AnaliseSemanticaParser.WhilestatContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnaliseSemanticaParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(@NotNull AnaliseSemanticaParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseSemanticaParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(@NotNull AnaliseSemanticaParser.FactorContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnaliseSemanticaParser#classdecl}.
	 * @param ctx the parse tree
	 */
	void enterClassdecl(@NotNull AnaliseSemanticaParser.ClassdeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseSemanticaParser#classdecl}.
	 * @param ctx the parse tree
	 */
	void exitClassdecl(@NotNull AnaliseSemanticaParser.ClassdeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnaliseSemanticaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull AnaliseSemanticaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseSemanticaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull AnaliseSemanticaParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnaliseSemanticaParser#numexpr}.
	 * @param ctx the parse tree
	 */
	void enterNumexpr(@NotNull AnaliseSemanticaParser.NumexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseSemanticaParser#numexpr}.
	 * @param ctx the parse tree
	 */
	void exitNumexpr(@NotNull AnaliseSemanticaParser.NumexprContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnaliseSemanticaParser#methoddecl}.
	 * @param ctx the parse tree
	 */
	void enterMethoddecl(@NotNull AnaliseSemanticaParser.MethoddeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseSemanticaParser#methoddecl}.
	 * @param ctx the parse tree
	 */
	void exitMethoddecl(@NotNull AnaliseSemanticaParser.MethoddeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnaliseSemanticaParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterLvalue(@NotNull AnaliseSemanticaParser.LvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseSemanticaParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitLvalue(@NotNull AnaliseSemanticaParser.LvalueContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnaliseSemanticaParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull AnaliseSemanticaParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseSemanticaParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull AnaliseSemanticaParser.TermContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnaliseSemanticaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull AnaliseSemanticaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseSemanticaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull AnaliseSemanticaParser.ProgramContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnaliseSemanticaParser#forstat}.
	 * @param ctx the parse tree
	 */
	void enterForstat(@NotNull AnaliseSemanticaParser.ForstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseSemanticaParser#forstat}.
	 * @param ctx the parse tree
	 */
	void exitForstat(@NotNull AnaliseSemanticaParser.ForstatContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnaliseSemanticaParser#superstat}.
	 * @param ctx the parse tree
	 */
	void enterSuperstat(@NotNull AnaliseSemanticaParser.SuperstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseSemanticaParser#superstat}.
	 * @param ctx the parse tree
	 */
	void exitSuperstat(@NotNull AnaliseSemanticaParser.SuperstatContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnaliseSemanticaParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void enterVardecl(@NotNull AnaliseSemanticaParser.VardeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseSemanticaParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void exitVardecl(@NotNull AnaliseSemanticaParser.VardeclContext ctx);
}
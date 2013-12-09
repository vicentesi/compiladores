// Generated from AnaliseLexica.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AnaliseLexicaParser}.
 */
public interface AnaliseLexicaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AnaliseLexicaParser#arglist}.
	 * @param ctx the parse tree
	 */
	void enterArglist(@NotNull AnaliseLexicaParser.ArglistContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseLexicaParser#arglist}.
	 * @param ctx the parse tree
	 */
	void exitArglist(@NotNull AnaliseLexicaParser.ArglistContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnaliseLexicaParser#classbody}.
	 * @param ctx the parse tree
	 */
	void enterClassbody(@NotNull AnaliseLexicaParser.ClassbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseLexicaParser#classbody}.
	 * @param ctx the parse tree
	 */
	void exitClassbody(@NotNull AnaliseLexicaParser.ClassbodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnaliseLexicaParser#switchcasestat}.
	 * @param ctx the parse tree
	 */
	void enterSwitchcasestat(@NotNull AnaliseLexicaParser.SwitchcasestatContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseLexicaParser#switchcasestat}.
	 * @param ctx the parse tree
	 */
	void exitSwitchcasestat(@NotNull AnaliseLexicaParser.SwitchcasestatContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnaliseLexicaParser#returnstat}.
	 * @param ctx the parse tree
	 */
	void enterReturnstat(@NotNull AnaliseLexicaParser.ReturnstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseLexicaParser#returnstat}.
	 * @param ctx the parse tree
	 */
	void exitReturnstat(@NotNull AnaliseLexicaParser.ReturnstatContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnaliseLexicaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull AnaliseLexicaParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseLexicaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull AnaliseLexicaParser.ExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnaliseLexicaParser#dowhilestat}.
	 * @param ctx the parse tree
	 */
	void enterDowhilestat(@NotNull AnaliseLexicaParser.DowhilestatContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseLexicaParser#dowhilestat}.
	 * @param ctx the parse tree
	 */
	void exitDowhilestat(@NotNull AnaliseLexicaParser.DowhilestatContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnaliseLexicaParser#paramlist}.
	 * @param ctx the parse tree
	 */
	void enterParamlist(@NotNull AnaliseLexicaParser.ParamlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseLexicaParser#paramlist}.
	 * @param ctx the parse tree
	 */
	void exitParamlist(@NotNull AnaliseLexicaParser.ParamlistContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnaliseLexicaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull AnaliseLexicaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseLexicaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull AnaliseLexicaParser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnaliseLexicaParser#printstat}.
	 * @param ctx the parse tree
	 */
	void enterPrintstat(@NotNull AnaliseLexicaParser.PrintstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseLexicaParser#printstat}.
	 * @param ctx the parse tree
	 */
	void exitPrintstat(@NotNull AnaliseLexicaParser.PrintstatContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnaliseLexicaParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdent(@NotNull AnaliseLexicaParser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseLexicaParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdent(@NotNull AnaliseLexicaParser.IdentContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnaliseLexicaParser#ifstat}.
	 * @param ctx the parse tree
	 */
	void enterIfstat(@NotNull AnaliseLexicaParser.IfstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseLexicaParser#ifstat}.
	 * @param ctx the parse tree
	 */
	void exitIfstat(@NotNull AnaliseLexicaParser.IfstatContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnaliseLexicaParser#statlist}.
	 * @param ctx the parse tree
	 */
	void enterStatlist(@NotNull AnaliseLexicaParser.StatlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseLexicaParser#statlist}.
	 * @param ctx the parse tree
	 */
	void exitStatlist(@NotNull AnaliseLexicaParser.StatlistContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnaliseLexicaParser#methodbody}.
	 * @param ctx the parse tree
	 */
	void enterMethodbody(@NotNull AnaliseLexicaParser.MethodbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseLexicaParser#methodbody}.
	 * @param ctx the parse tree
	 */
	void exitMethodbody(@NotNull AnaliseLexicaParser.MethodbodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnaliseLexicaParser#atribstat}.
	 * @param ctx the parse tree
	 */
	void enterAtribstat(@NotNull AnaliseLexicaParser.AtribstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseLexicaParser#atribstat}.
	 * @param ctx the parse tree
	 */
	void exitAtribstat(@NotNull AnaliseLexicaParser.AtribstatContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnaliseLexicaParser#constructdecl}.
	 * @param ctx the parse tree
	 */
	void enterConstructdecl(@NotNull AnaliseLexicaParser.ConstructdeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseLexicaParser#constructdecl}.
	 * @param ctx the parse tree
	 */
	void exitConstructdecl(@NotNull AnaliseLexicaParser.ConstructdeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnaliseLexicaParser#unaryexpr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryexpr(@NotNull AnaliseLexicaParser.UnaryexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseLexicaParser#unaryexpr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryexpr(@NotNull AnaliseLexicaParser.UnaryexprContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnaliseLexicaParser#readstat}.
	 * @param ctx the parse tree
	 */
	void enterReadstat(@NotNull AnaliseLexicaParser.ReadstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseLexicaParser#readstat}.
	 * @param ctx the parse tree
	 */
	void exitReadstat(@NotNull AnaliseLexicaParser.ReadstatContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnaliseLexicaParser#alocexpr}.
	 * @param ctx the parse tree
	 */
	void enterAlocexpr(@NotNull AnaliseLexicaParser.AlocexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseLexicaParser#alocexpr}.
	 * @param ctx the parse tree
	 */
	void exitAlocexpr(@NotNull AnaliseLexicaParser.AlocexprContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnaliseLexicaParser#classlist}.
	 * @param ctx the parse tree
	 */
	void enterClasslist(@NotNull AnaliseLexicaParser.ClasslistContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseLexicaParser#classlist}.
	 * @param ctx the parse tree
	 */
	void exitClasslist(@NotNull AnaliseLexicaParser.ClasslistContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnaliseLexicaParser#whilestat}.
	 * @param ctx the parse tree
	 */
	void enterWhilestat(@NotNull AnaliseLexicaParser.WhilestatContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseLexicaParser#whilestat}.
	 * @param ctx the parse tree
	 */
	void exitWhilestat(@NotNull AnaliseLexicaParser.WhilestatContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnaliseLexicaParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(@NotNull AnaliseLexicaParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseLexicaParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(@NotNull AnaliseLexicaParser.FactorContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnaliseLexicaParser#classdecl}.
	 * @param ctx the parse tree
	 */
	void enterClassdecl(@NotNull AnaliseLexicaParser.ClassdeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseLexicaParser#classdecl}.
	 * @param ctx the parse tree
	 */
	void exitClassdecl(@NotNull AnaliseLexicaParser.ClassdeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnaliseLexicaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull AnaliseLexicaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseLexicaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull AnaliseLexicaParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnaliseLexicaParser#numexpr}.
	 * @param ctx the parse tree
	 */
	void enterNumexpr(@NotNull AnaliseLexicaParser.NumexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseLexicaParser#numexpr}.
	 * @param ctx the parse tree
	 */
	void exitNumexpr(@NotNull AnaliseLexicaParser.NumexprContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnaliseLexicaParser#methoddecl}.
	 * @param ctx the parse tree
	 */
	void enterMethoddecl(@NotNull AnaliseLexicaParser.MethoddeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseLexicaParser#methoddecl}.
	 * @param ctx the parse tree
	 */
	void exitMethoddecl(@NotNull AnaliseLexicaParser.MethoddeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnaliseLexicaParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterLvalue(@NotNull AnaliseLexicaParser.LvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseLexicaParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitLvalue(@NotNull AnaliseLexicaParser.LvalueContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnaliseLexicaParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull AnaliseLexicaParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseLexicaParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull AnaliseLexicaParser.TermContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnaliseLexicaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull AnaliseLexicaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseLexicaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull AnaliseLexicaParser.ProgramContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnaliseLexicaParser#forstat}.
	 * @param ctx the parse tree
	 */
	void enterForstat(@NotNull AnaliseLexicaParser.ForstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseLexicaParser#forstat}.
	 * @param ctx the parse tree
	 */
	void exitForstat(@NotNull AnaliseLexicaParser.ForstatContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnaliseLexicaParser#superstat}.
	 * @param ctx the parse tree
	 */
	void enterSuperstat(@NotNull AnaliseLexicaParser.SuperstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseLexicaParser#superstat}.
	 * @param ctx the parse tree
	 */
	void exitSuperstat(@NotNull AnaliseLexicaParser.SuperstatContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnaliseLexicaParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void enterVardecl(@NotNull AnaliseLexicaParser.VardeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnaliseLexicaParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void exitVardecl(@NotNull AnaliseLexicaParser.VardeclContext ctx);
}
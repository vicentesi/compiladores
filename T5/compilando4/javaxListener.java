// Generated from javax.g by ANTLR 4.1

package Compilador;
import Compilador.Semanticator;
import java.util.HashMap;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link javaxParser}.
 */
public interface javaxListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link javaxParser#arglist}.
	 * @param ctx the parse tree
	 */
	void enterArglist(@NotNull javaxParser.ArglistContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaxParser#arglist}.
	 * @param ctx the parse tree
	 */
	void exitArglist(@NotNull javaxParser.ArglistContext ctx);

	/**
	 * Enter a parse tree produced by {@link javaxParser#def_chest}.
	 * @param ctx the parse tree
	 */
	void enterDef_chest(@NotNull javaxParser.Def_chestContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaxParser#def_chest}.
	 * @param ctx the parse tree
	 */
	void exitDef_chest(@NotNull javaxParser.Def_chestContext ctx);

	/**
	 * Enter a parse tree produced by {@link javaxParser#varatrib}.
	 * @param ctx the parse tree
	 */
	void enterVaratrib(@NotNull javaxParser.VaratribContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaxParser#varatrib}.
	 * @param ctx the parse tree
	 */
	void exitVaratrib(@NotNull javaxParser.VaratribContext ctx);

	/**
	 * Enter a parse tree produced by {@link javaxParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull javaxParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaxParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull javaxParser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link javaxParser#relational_op_expr}.
	 * @param ctx the parse tree
	 */
	void enterRelational_op_expr(@NotNull javaxParser.Relational_op_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaxParser#relational_op_expr}.
	 * @param ctx the parse tree
	 */
	void exitRelational_op_expr(@NotNull javaxParser.Relational_op_exprContext ctx);

	/**
	 * Enter a parse tree produced by {@link javaxParser#def_repeat}.
	 * @param ctx the parse tree
	 */
	void enterDef_repeat(@NotNull javaxParser.Def_repeatContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaxParser#def_repeat}.
	 * @param ctx the parse tree
	 */
	void exitDef_repeat(@NotNull javaxParser.Def_repeatContext ctx);

	/**
	 * Enter a parse tree produced by {@link javaxParser#javax}.
	 * @param ctx the parse tree
	 */
	void enterJavax(@NotNull javaxParser.JavaxContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaxParser#javax}.
	 * @param ctx the parse tree
	 */
	void exitJavax(@NotNull javaxParser.JavaxContext ctx);

	/**
	 * Enter a parse tree produced by {@link javaxParser#def_while}.
	 * @param ctx the parse tree
	 */
	void enterDef_while(@NotNull javaxParser.Def_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaxParser#def_while}.
	 * @param ctx the parse tree
	 */
	void exitDef_while(@NotNull javaxParser.Def_whileContext ctx);

	/**
	 * Enter a parse tree produced by {@link javaxParser#weak_op_expr}.
	 * @param ctx the parse tree
	 */
	void enterWeak_op_expr(@NotNull javaxParser.Weak_op_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaxParser#weak_op_expr}.
	 * @param ctx the parse tree
	 */
	void exitWeak_op_expr(@NotNull javaxParser.Weak_op_exprContext ctx);

	/**
	 * Enter a parse tree produced by {@link javaxParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(@NotNull javaxParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaxParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(@NotNull javaxParser.NumberContext ctx);

	/**
	 * Enter a parse tree produced by {@link javaxParser#funccall}.
	 * @param ctx the parse tree
	 */
	void enterFunccall(@NotNull javaxParser.FunccallContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaxParser#funccall}.
	 * @param ctx the parse tree
	 */
	void exitFunccall(@NotNull javaxParser.FunccallContext ctx);

	/**
	 * Enter a parse tree produced by {@link javaxParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(@NotNull javaxParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaxParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(@NotNull javaxParser.StatContext ctx);

	/**
	 * Enter a parse tree produced by {@link javaxParser#chestaccess}.
	 * @param ctx the parse tree
	 */
	void enterChestaccess(@NotNull javaxParser.ChestaccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaxParser#chestaccess}.
	 * @param ctx the parse tree
	 */
	void exitChestaccess(@NotNull javaxParser.ChestaccessContext ctx);

	/**
	 * Enter a parse tree produced by {@link javaxParser#unary_op_expr}.
	 * @param ctx the parse tree
	 */
	void enterUnary_op_expr(@NotNull javaxParser.Unary_op_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaxParser#unary_op_expr}.
	 * @param ctx the parse tree
	 */
	void exitUnary_op_expr(@NotNull javaxParser.Unary_op_exprContext ctx);

	/**
	 * Enter a parse tree produced by {@link javaxParser#def_return}.
	 * @param ctx the parse tree
	 */
	void enterDef_return(@NotNull javaxParser.Def_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaxParser#def_return}.
	 * @param ctx the parse tree
	 */
	void exitDef_return(@NotNull javaxParser.Def_returnContext ctx);

	/**
	 * Enter a parse tree produced by {@link javaxParser#strong_op_expr}.
	 * @param ctx the parse tree
	 */
	void enterStrong_op_expr(@NotNull javaxParser.Strong_op_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaxParser#strong_op_expr}.
	 * @param ctx the parse tree
	 */
	void exitStrong_op_expr(@NotNull javaxParser.Strong_op_exprContext ctx);

	/**
	 * Enter a parse tree produced by {@link javaxParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull javaxParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaxParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull javaxParser.TermContext ctx);

	/**
	 * Enter a parse tree produced by {@link javaxParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(@NotNull javaxParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaxParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(@NotNull javaxParser.StringContext ctx);

	/**
	 * Enter a parse tree produced by {@link javaxParser#weakstat}.
	 * @param ctx the parse tree
	 */
	void enterWeakstat(@NotNull javaxParser.WeakstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaxParser#weakstat}.
	 * @param ctx the parse tree
	 */
	void exitWeakstat(@NotNull javaxParser.WeakstatContext ctx);

	/**
	 * Enter a parse tree produced by {@link javaxParser#def_func}.
	 * @param ctx the parse tree
	 */
	void enterDef_func(@NotNull javaxParser.Def_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaxParser#def_func}.
	 * @param ctx the parse tree
	 */
	void exitDef_func(@NotNull javaxParser.Def_funcContext ctx);

	/**
	 * Enter a parse tree produced by {@link javaxParser#typedarglist}.
	 * @param ctx the parse tree
	 */
	void enterTypedarglist(@NotNull javaxParser.TypedarglistContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaxParser#typedarglist}.
	 * @param ctx the parse tree
	 */
	void exitTypedarglist(@NotNull javaxParser.TypedarglistContext ctx);

	/**
	 * Enter a parse tree produced by {@link javaxParser#def_if}.
	 * @param ctx the parse tree
	 */
	void enterDef_if(@NotNull javaxParser.Def_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaxParser#def_if}.
	 * @param ctx the parse tree
	 */
	void exitDef_if(@NotNull javaxParser.Def_ifContext ctx);

	/**
	 * Enter a parse tree produced by {@link javaxParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull javaxParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaxParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull javaxParser.VariableContext ctx);

	/**
	 * Enter a parse tree produced by {@link javaxParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void enterVardecl(@NotNull javaxParser.VardeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaxParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void exitVardecl(@NotNull javaxParser.VardeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link javaxParser#logic_op_expr}.
	 * @param ctx the parse tree
	 */
	void enterLogic_op_expr(@NotNull javaxParser.Logic_op_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaxParser#logic_op_expr}.
	 * @param ctx the parse tree
	 */
	void exitLogic_op_expr(@NotNull javaxParser.Logic_op_exprContext ctx);
}
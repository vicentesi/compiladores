// Generated from analisesemantica.g by ANTLR 4.1

package Compilador;
import Compilador.Semantica;
import java.util.HashMap;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link analisesemanticaParser}.
 */
public interface analisesemanticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link analisesemanticaParser#arglist}.
	 * @param ctx the parse tree
	 */
	void enterArglist(@NotNull analisesemanticaParser.ArglistContext ctx);
	/**
	 * Exit a parse tree produced by {@link analisesemanticaParser#arglist}.
	 * @param ctx the parse tree
	 */
	void exitArglist(@NotNull analisesemanticaParser.ArglistContext ctx);

	/**
	 * Enter a parse tree produced by {@link analisesemanticaParser#unaryexpr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryexpr(@NotNull analisesemanticaParser.UnaryexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link analisesemanticaParser#unaryexpr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryexpr(@NotNull analisesemanticaParser.UnaryexprContext ctx);

	/**
	 * Enter a parse tree produced by {@link analisesemanticaParser#analisesemantica}.
	 * @param ctx the parse tree
	 */
	void enterAnalisesemantica(@NotNull analisesemanticaParser.AnalisesemanticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link analisesemanticaParser#analisesemantica}.
	 * @param ctx the parse tree
	 */
	void exitAnalisesemantica(@NotNull analisesemanticaParser.AnalisesemanticaContext ctx);

	/**
	 * Enter a parse tree produced by {@link analisesemanticaParser#returnstat}.
	 * @param ctx the parse tree
	 */
	void enterReturnstat(@NotNull analisesemanticaParser.ReturnstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link analisesemanticaParser#returnstat}.
	 * @param ctx the parse tree
	 */
	void exitReturnstat(@NotNull analisesemanticaParser.ReturnstatContext ctx);

	/**
	 * Enter a parse tree produced by {@link analisesemanticaParser#whilestat}.
	 * @param ctx the parse tree
	 */
	void enterWhilestat(@NotNull analisesemanticaParser.WhilestatContext ctx);
	/**
	 * Exit a parse tree produced by {@link analisesemanticaParser#whilestat}.
	 * @param ctx the parse tree
	 */
	void exitWhilestat(@NotNull analisesemanticaParser.WhilestatContext ctx);

	/**
	 * Enter a parse tree produced by {@link analisesemanticaParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(@NotNull analisesemanticaParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link analisesemanticaParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(@NotNull analisesemanticaParser.NumberContext ctx);

	/**
	 * Enter a parse tree produced by {@link analisesemanticaParser#weak_op_expr}.
	 * @param ctx the parse tree
	 */
	void enterWeak_op_expr(@NotNull analisesemanticaParser.Weak_op_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link analisesemanticaParser#weak_op_expr}.
	 * @param ctx the parse tree
	 */
	void exitWeak_op_expr(@NotNull analisesemanticaParser.Weak_op_exprContext ctx);

	/**
	 * Enter a parse tree produced by {@link analisesemanticaParser#varatrib}.
	 * @param ctx the parse tree
	 */
	void enterVaratrib(@NotNull analisesemanticaParser.VaratribContext ctx);
	/**
	 * Exit a parse tree produced by {@link analisesemanticaParser#varatrib}.
	 * @param ctx the parse tree
	 */
	void exitVaratrib(@NotNull analisesemanticaParser.VaratribContext ctx);

	/**
	 * Enter a parse tree produced by {@link analisesemanticaParser#funccall}.
	 * @param ctx the parse tree
	 */
	void enterFunccall(@NotNull analisesemanticaParser.FunccallContext ctx);
	/**
	 * Exit a parse tree produced by {@link analisesemanticaParser#funccall}.
	 * @param ctx the parse tree
	 */
	void exitFunccall(@NotNull analisesemanticaParser.FunccallContext ctx);

	/**
	 * Enter a parse tree produced by {@link analisesemanticaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull analisesemanticaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link analisesemanticaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull analisesemanticaParser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link analisesemanticaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(@NotNull analisesemanticaParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link analisesemanticaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(@NotNull analisesemanticaParser.StatContext ctx);

	/**
	 * Enter a parse tree produced by {@link analisesemanticaParser#chestaccess}.
	 * @param ctx the parse tree
	 */
	void enterChestaccess(@NotNull analisesemanticaParser.ChestaccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link analisesemanticaParser#chestaccess}.
	 * @param ctx the parse tree
	 */
	void exitChestaccess(@NotNull analisesemanticaParser.ChestaccessContext ctx);

	/**
	 * Enter a parse tree produced by {@link analisesemanticaParser#relational_op_expr}.
	 * @param ctx the parse tree
	 */
	void enterRelational_op_expr(@NotNull analisesemanticaParser.Relational_op_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link analisesemanticaParser#relational_op_expr}.
	 * @param ctx the parse tree
	 */
	void exitRelational_op_expr(@NotNull analisesemanticaParser.Relational_op_exprContext ctx);

	/**
	 * Enter a parse tree produced by {@link analisesemanticaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull analisesemanticaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link analisesemanticaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull analisesemanticaParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link analisesemanticaParser#strong_op_expr}.
	 * @param ctx the parse tree
	 */
	void enterStrong_op_expr(@NotNull analisesemanticaParser.Strong_op_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link analisesemanticaParser#strong_op_expr}.
	 * @param ctx the parse tree
	 */
	void exitStrong_op_expr(@NotNull analisesemanticaParser.Strong_op_exprContext ctx);

	/**
	 * Enter a parse tree produced by {@link analisesemanticaParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull analisesemanticaParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link analisesemanticaParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull analisesemanticaParser.TermContext ctx);

	/**
	 * Enter a parse tree produced by {@link analisesemanticaParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(@NotNull analisesemanticaParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link analisesemanticaParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(@NotNull analisesemanticaParser.StringContext ctx);

	/**
	 * Enter a parse tree produced by {@link analisesemanticaParser#typedarglist}.
	 * @param ctx the parse tree
	 */
	void enterTypedarglist(@NotNull analisesemanticaParser.TypedarglistContext ctx);
	/**
	 * Exit a parse tree produced by {@link analisesemanticaParser#typedarglist}.
	 * @param ctx the parse tree
	 */
	void exitTypedarglist(@NotNull analisesemanticaParser.TypedarglistContext ctx);

	/**
	 * Enter a parse tree produced by {@link analisesemanticaParser#def_func}.
	 * @param ctx the parse tree
	 */
	void enterDef_func(@NotNull analisesemanticaParser.Def_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link analisesemanticaParser#def_func}.
	 * @param ctx the parse tree
	 */
	void exitDef_func(@NotNull analisesemanticaParser.Def_funcContext ctx);

	/**
	 * Enter a parse tree produced by {@link analisesemanticaParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull analisesemanticaParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link analisesemanticaParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull analisesemanticaParser.VariableContext ctx);

	/**
	 * Enter a parse tree produced by {@link analisesemanticaParser#def_if}.
	 * @param ctx the parse tree
	 */
	void enterDef_if(@NotNull analisesemanticaParser.Def_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link analisesemanticaParser#def_if}.
	 * @param ctx the parse tree
	 */
	void exitDef_if(@NotNull analisesemanticaParser.Def_ifContext ctx);

	/**
	 * Enter a parse tree produced by {@link analisesemanticaParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void enterVardecl(@NotNull analisesemanticaParser.VardeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link analisesemanticaParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void exitVardecl(@NotNull analisesemanticaParser.VardeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link analisesemanticaParser#logic_op_expr}.
	 * @param ctx the parse tree
	 */
	void enterLogic_op_expr(@NotNull analisesemanticaParser.Logic_op_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link analisesemanticaParser#logic_op_expr}.
	 * @param ctx the parse tree
	 */
	void exitLogic_op_expr(@NotNull analisesemanticaParser.Logic_op_exprContext ctx);
}
// Generated from ../Juisyque.g4 by ANTLR 4.7.1
package org.jsq.antlr.generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JuisyqueParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JuisyqueVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JuisyqueParser#stmts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmts(JuisyqueParser.StmtsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuisyqueParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(JuisyqueParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuisyqueParser#small_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmall_stmt(JuisyqueParser.Small_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuisyqueParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(JuisyqueParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuisyqueParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(JuisyqueParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuisyqueParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(JuisyqueParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuisyqueParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(JuisyqueParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuisyqueParser#index_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_expr(JuisyqueParser.Index_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuisyqueParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(JuisyqueParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuisyqueParser#note}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNote(JuisyqueParser.NoteContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuisyqueParser#chord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChord(JuisyqueParser.ChordContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuisyqueParser#chord_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChord_element(JuisyqueParser.Chord_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuisyqueParser#vector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVector(JuisyqueParser.VectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuisyqueParser#bar_delim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBar_delim(JuisyqueParser.Bar_delimContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuisyqueParser#matrix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatrix(JuisyqueParser.MatrixContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuisyqueParser#dict}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDict(JuisyqueParser.DictContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuisyqueParser#dict_pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDict_pair(JuisyqueParser.Dict_pairContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuisyqueParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(JuisyqueParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuisyqueParser#func_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_name(JuisyqueParser.Func_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuisyqueParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(JuisyqueParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuisyqueParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(JuisyqueParser.ArgContext ctx);
}
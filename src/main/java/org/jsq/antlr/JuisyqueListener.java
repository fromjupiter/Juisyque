// Generated from Juisyque.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JuisyqueParser}.
 */
public interface JuisyqueListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JuisyqueParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(JuisyqueParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuisyqueParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(JuisyqueParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuisyqueParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimple_stmt(JuisyqueParser.Simple_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuisyqueParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimple_stmt(JuisyqueParser.Simple_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuisyqueParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSmall_stmt(JuisyqueParser.Small_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuisyqueParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSmall_stmt(JuisyqueParser.Small_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuisyqueParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(JuisyqueParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuisyqueParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(JuisyqueParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuisyqueParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(JuisyqueParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuisyqueParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(JuisyqueParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuisyqueParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(JuisyqueParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuisyqueParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(JuisyqueParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuisyqueParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(JuisyqueParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuisyqueParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(JuisyqueParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuisyqueParser#note}.
	 * @param ctx the parse tree
	 */
	void enterNote(JuisyqueParser.NoteContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuisyqueParser#note}.
	 * @param ctx the parse tree
	 */
	void exitNote(JuisyqueParser.NoteContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuisyqueParser#chord}.
	 * @param ctx the parse tree
	 */
	void enterChord(JuisyqueParser.ChordContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuisyqueParser#chord}.
	 * @param ctx the parse tree
	 */
	void exitChord(JuisyqueParser.ChordContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuisyqueParser#chord_element}.
	 * @param ctx the parse tree
	 */
	void enterChord_element(JuisyqueParser.Chord_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuisyqueParser#chord_element}.
	 * @param ctx the parse tree
	 */
	void exitChord_element(JuisyqueParser.Chord_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuisyqueParser#vector}.
	 * @param ctx the parse tree
	 */
	void enterVector(JuisyqueParser.VectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuisyqueParser#vector}.
	 * @param ctx the parse tree
	 */
	void exitVector(JuisyqueParser.VectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuisyqueParser#vector_element}.
	 * @param ctx the parse tree
	 */
	void enterVector_element(JuisyqueParser.Vector_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuisyqueParser#vector_element}.
	 * @param ctx the parse tree
	 */
	void exitVector_element(JuisyqueParser.Vector_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuisyqueParser#matrix}.
	 * @param ctx the parse tree
	 */
	void enterMatrix(JuisyqueParser.MatrixContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuisyqueParser#matrix}.
	 * @param ctx the parse tree
	 */
	void exitMatrix(JuisyqueParser.MatrixContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuisyqueParser#matrix_row}.
	 * @param ctx the parse tree
	 */
	void enterMatrix_row(JuisyqueParser.Matrix_rowContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuisyqueParser#matrix_row}.
	 * @param ctx the parse tree
	 */
	void exitMatrix_row(JuisyqueParser.Matrix_rowContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuisyqueParser#dict}.
	 * @param ctx the parse tree
	 */
	void enterDict(JuisyqueParser.DictContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuisyqueParser#dict}.
	 * @param ctx the parse tree
	 */
	void exitDict(JuisyqueParser.DictContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuisyqueParser#dict_pair}.
	 * @param ctx the parse tree
	 */
	void enterDict_pair(JuisyqueParser.Dict_pairContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuisyqueParser#dict_pair}.
	 * @param ctx the parse tree
	 */
	void exitDict_pair(JuisyqueParser.Dict_pairContext ctx);
}
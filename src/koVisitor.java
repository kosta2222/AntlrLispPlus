// Generated from ko.g4 by ANTLR 4.2.2
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link koParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface koVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link koParser#oper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOper(@NotNull koParser.OperContext ctx);

	/**
	 * Visit a parse tree produced by {@link koParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(@NotNull koParser.ProgContext ctx);

	/**
	 * Visit a parse tree produced by {@link koParser#int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(@NotNull koParser.IntContext ctx);

	/**
	 * Visit a parse tree produced by {@link koParser#braces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBraces(@NotNull koParser.BracesContext ctx);
}
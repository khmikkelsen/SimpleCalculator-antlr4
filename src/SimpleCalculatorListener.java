// Generated from SimpleCalculator.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleCalculatorParser}.
 */
public interface SimpleCalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleCalculatorParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SimpleCalculatorParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCalculatorParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SimpleCalculatorParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SimpleCalculatorParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SimpleCalculatorParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCalculatorParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(SimpleCalculatorParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCalculatorParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(SimpleCalculatorParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCalculatorParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(SimpleCalculatorParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCalculatorParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(SimpleCalculatorParser.PrimaryContext ctx);
}
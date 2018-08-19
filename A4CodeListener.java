// Generated from A4Code.g4 by ANTLR 4.5.3


import x86.*;
import java.io.*;


import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link A4CodeParser}.
 */
public interface A4CodeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link A4CodeParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(A4CodeParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link A4CodeParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(A4CodeParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link A4CodeParser#field_decls}.
	 * @param ctx the parse tree
	 */
	void enterField_decls(A4CodeParser.Field_declsContext ctx);
	/**
	 * Exit a parse tree produced by {@link A4CodeParser#field_decls}.
	 * @param ctx the parse tree
	 */
	void exitField_decls(A4CodeParser.Field_declsContext ctx);
	/**
	 * Enter a parse tree produced by {@link A4CodeParser#field_decl}.
	 * @param ctx the parse tree
	 */
	void enterField_decl(A4CodeParser.Field_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link A4CodeParser#field_decl}.
	 * @param ctx the parse tree
	 */
	void exitField_decl(A4CodeParser.Field_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link A4CodeParser#inited_field_decl}.
	 * @param ctx the parse tree
	 */
	void enterInited_field_decl(A4CodeParser.Inited_field_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link A4CodeParser#inited_field_decl}.
	 * @param ctx the parse tree
	 */
	void exitInited_field_decl(A4CodeParser.Inited_field_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link A4CodeParser#method_decls}.
	 * @param ctx the parse tree
	 */
	void enterMethod_decls(A4CodeParser.Method_declsContext ctx);
	/**
	 * Exit a parse tree produced by {@link A4CodeParser#method_decls}.
	 * @param ctx the parse tree
	 */
	void exitMethod_decls(A4CodeParser.Method_declsContext ctx);
	/**
	 * Enter a parse tree produced by {@link A4CodeParser#method_decl}.
	 * @param ctx the parse tree
	 */
	void enterMethod_decl(A4CodeParser.Method_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link A4CodeParser#method_decl}.
	 * @param ctx the parse tree
	 */
	void exitMethod_decl(A4CodeParser.Method_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link A4CodeParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(A4CodeParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link A4CodeParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(A4CodeParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link A4CodeParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(A4CodeParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link A4CodeParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(A4CodeParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link A4CodeParser#var_decls}.
	 * @param ctx the parse tree
	 */
	void enterVar_decls(A4CodeParser.Var_declsContext ctx);
	/**
	 * Exit a parse tree produced by {@link A4CodeParser#var_decls}.
	 * @param ctx the parse tree
	 */
	void exitVar_decls(A4CodeParser.Var_declsContext ctx);
	/**
	 * Enter a parse tree produced by {@link A4CodeParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(A4CodeParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link A4CodeParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(A4CodeParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link A4CodeParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(A4CodeParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link A4CodeParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(A4CodeParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link A4CodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(A4CodeParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link A4CodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(A4CodeParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link A4CodeParser#cases}.
	 * @param ctx the parse tree
	 */
	void enterCases(A4CodeParser.CasesContext ctx);
	/**
	 * Exit a parse tree produced by {@link A4CodeParser#cases}.
	 * @param ctx the parse tree
	 */
	void exitCases(A4CodeParser.CasesContext ctx);
	/**
	 * Enter a parse tree produced by {@link A4CodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(A4CodeParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link A4CodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(A4CodeParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link A4CodeParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(A4CodeParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link A4CodeParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(A4CodeParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link A4CodeParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(A4CodeParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link A4CodeParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(A4CodeParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link A4CodeParser#someArgs}.
	 * @param ctx the parse tree
	 */
	void enterSomeArgs(A4CodeParser.SomeArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link A4CodeParser#someArgs}.
	 * @param ctx the parse tree
	 */
	void exitSomeArgs(A4CodeParser.SomeArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link A4CodeParser#calloutArgs}.
	 * @param ctx the parse tree
	 */
	void enterCalloutArgs(A4CodeParser.CalloutArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link A4CodeParser#calloutArgs}.
	 * @param ctx the parse tree
	 */
	void exitCalloutArgs(A4CodeParser.CalloutArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link A4CodeParser#marker}.
	 * @param ctx the parse tree
	 */
	void enterMarker(A4CodeParser.MarkerContext ctx);
	/**
	 * Exit a parse tree produced by {@link A4CodeParser#marker}.
	 * @param ctx the parse tree
	 */
	void exitMarker(A4CodeParser.MarkerContext ctx);
	/**
	 * Enter a parse tree produced by {@link A4CodeParser#next}.
	 * @param ctx the parse tree
	 */
	void enterNext(A4CodeParser.NextContext ctx);
	/**
	 * Exit a parse tree produced by {@link A4CodeParser#next}.
	 * @param ctx the parse tree
	 */
	void exitNext(A4CodeParser.NextContext ctx);
	/**
	 * Enter a parse tree produced by {@link A4CodeParser#location}.
	 * @param ctx the parse tree
	 */
	void enterLocation(A4CodeParser.LocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link A4CodeParser#location}.
	 * @param ctx the parse tree
	 */
	void exitLocation(A4CodeParser.LocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link A4CodeParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(A4CodeParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link A4CodeParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(A4CodeParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by {@link A4CodeParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(A4CodeParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link A4CodeParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(A4CodeParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link A4CodeParser#eqOp}.
	 * @param ctx the parse tree
	 */
	void enterEqOp(A4CodeParser.EqOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link A4CodeParser#eqOp}.
	 * @param ctx the parse tree
	 */
	void exitEqOp(A4CodeParser.EqOpContext ctx);
}
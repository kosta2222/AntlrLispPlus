/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import org.antlr.v4.runtime.misc.NotNull;

/**
 *
 * @author papa
 */
public class koVistorImpl extends koBaseVisitor<Integer>{
//    @Override
//    public Object visitPlus(koParser.PlusContext ctx) {
//        visit(ctx.expr(0));
//        visit(ctx.expr(1));//To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public Object visitInt(koParser.IntContext ctx) {
//        return super.visitInt(ctx); //To change body of generated methods, choose Tools | Templates.
//    }
     @Override
    public Integer visitOper(koParser.OperContext ctx) {
        System.out.print("( ");
        int left=(int)visit(ctx.expr(0));
        int right=(int)visit(ctx.expr(1));
        System.out.print("+)=");
      //. return left+right;
      //   System.out.println(""+ctx.expr(0));<--[2]
return left+right;
    }

    @Override
    public Integer visitInt(koParser.IntContext ctx) {
        System.out.print(ctx.INT().getText() + " ");
        return Integer.parseInt(ctx.INT().getText());
    }

    @Override
    public Integer visitBraces(koParser.BracesContext ctx) {
        return visit(ctx.expr()); //To change body of generated methods, choose Tools | Templates.
    }
    
}
package org.jsq.antlr.visitor;

import org.jsq.antlr.Variables;
import org.jsq.antlr.generated.JuisyqueParser;
import org.jsq.antlr.visitor.generic.StatelessVisitor;
import org.jsq.syntax.type.operator.Ops;

import java.util.List;
import java.util.stream.Collectors;

public class ExprVisitor implements StatelessVisitor<JuisyqueParser.ExprContext, Variables, Object> {

    @Override
    public Object visit(JuisyqueParser.ExprContext ctx, Variables world) {
        if(ctx == null) return null;

        if(ctx.atom() != null) {
            return new AtomVisitor().visit(ctx.atom(), world);
        } else if (ctx.COMP_OP() != null) {
            throw new UnsupportedOperationException("Don't plan to implement this in near future..");
        } else if (ctx.index_expr() != null) {
            throw new UnsupportedOperationException("Don't plan to implement this in near future..");
        } else if (ctx.OP() != null) {
            return visitOp(ctx, world);
        }

        throw new UnsupportedOperationException("LATER");
    }

    public List<Object> visitIndex(JuisyqueParser.Index_exprContext ctx, Variables world) {
        return ctx.expr().stream().map(x->visit(x,world)).collect(Collectors.toList());
    }

    private Object visitOp(JuisyqueParser.ExprContext ctx, Variables world) {
        Ops op = Ops.fromSymbol(ctx.OP().getText());


        throw new UnsupportedOperationException("LATER");
    }
}

package org.jsq.antlr.visitor;

import org.jsq.antlr.Variables;
import org.jsq.antlr.generated.JuisyqueParser;
import org.jsq.antlr.visitor.generic.StatelessVisitor;
import org.jsq.syntax.Op;

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

    private Object visitOp(JuisyqueParser.ExprContext ctx, Variables world) {
        Op op = Op.fromSymbol(ctx.OP().getText());


        throw new UnsupportedOperationException("LATER");
    }
}

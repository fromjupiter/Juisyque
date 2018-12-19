package org.jsq.antlr.visitor;

import org.jsq.antlr.Variable;
import org.jsq.antlr.Variables;
import org.jsq.antlr.generated.JuisyqueParser;
import org.jsq.antlr.visitor.generic.DefaultStatelessVisitor;

public class AssignmentVisitor implements DefaultStatelessVisitor<JuisyqueParser.AssignmentContext, Variables> {

    @Override
    public Variables visit(JuisyqueParser.AssignmentContext ctx, Variables world) {
        if (ctx==null) return world;

        if(ctx.index_expr() != null) {
            throw new UnsupportedOperationException("LATER");
        } else {
            Object rvalue = new ExprVisitor().visit(ctx.expr(), world);

            String varName;
            if (ctx.variable().name().ID() != null)
                varName = ctx.variable().name().ID().getText();
            else
                varName = ctx.variable().name().NOTE().getText();

            world.update(varName, new Variable(varName, rvalue));
        }

        return world;
    }
}

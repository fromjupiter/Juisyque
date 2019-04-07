package org.jsq.antlr.visitor;

import org.jsq.antlr.Variable;
import org.jsq.antlr.Variables;
import org.jsq.antlr.generated.JuisyqueParser;
import org.jsq.antlr.visitor.generic.DefaultStatelessVisitor;
import org.jsq.exception.JsqInvalidLogicException;

public class AssignmentVisitor implements DefaultStatelessVisitor<JuisyqueParser.AssignmentContext, Variables> {

    @Override
    public Variables visit(JuisyqueParser.AssignmentContext ctx, Variables world) {
        if (ctx == null) return world;

        String variableName;
        String keyName;

        if (ctx.index_expr() != null) throw new UnsupportedOperationException("LATER");
        //parser trick
        variableName = ctx.variable().name().ID() != null ? ctx.variable().name().ID().getText() : ctx.variable().name().NOTE().getText();

        Object rvalue = new ExprVisitor().visit(ctx.expr(), world);
        if(!world.containsKey(variableName) || world.get(variableName).getClass().equals(rvalue)) {
            world.update(variableName, new Variable(variableName, rvalue));
            return world;
        }

        throw new JsqInvalidLogicException(String.format("Trying to assign variable [%s] with inconsistent type data",variableName));
    }
}

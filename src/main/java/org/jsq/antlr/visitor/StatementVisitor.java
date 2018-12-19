package org.jsq.antlr.visitor;

import org.jsq.antlr.Variables;
import org.jsq.antlr.generated.JuisyqueParser;
import org.jsq.antlr.visitor.generic.DefaultStatelessVisitor;

public class StatementVisitor implements DefaultStatelessVisitor<JuisyqueParser.StmtContext,Variables> {

    public Variables visit(JuisyqueParser.StmtContext ctx, Variables world) {
        if (ctx==null) return world;
        if (ctx.small_stmt() == null) return world;

        JuisyqueParser.Small_stmtContext stmt = ctx.small_stmt();
        if(stmt.expr() != null) {
            //handle expr statements
            Object res = new ExprVisitor().visit(stmt.expr(), world);
            if (res instanceof Variables)
                return (Variables) res;
            else
                //skip if it's not assignment or function call
                return world;
        } else if (stmt.assignment() != null) {
            return new AssignmentVisitor().visit(stmt.assignment(), world);
        }

        return world;
    }

}

package org.jsq.antlr.visitor;

import org.jsq.antlr.Variables;
import org.jsq.antlr.generated.JuisyqueParser;
import org.jsq.antlr.visitor.generic.DefaultStatelessVisitor;

public class StatementsVisitor implements DefaultStatelessVisitor<JuisyqueParser.StmtsContext,Variables> {

    @Override
    public Variables visit(JuisyqueParser.StmtsContext ctx, Variables world) {
        if(ctx==null) return world;

        for(JuisyqueParser.StmtContext stmt : ctx.stmt()) {
            StatementVisitor visitor = new StatementVisitor();
            world = visitor.visit(stmt, world);
        }
        return world;
    }
}

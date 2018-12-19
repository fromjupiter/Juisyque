package org.jsq.antlr;

import org.jsq.antlr.generated.JuisyqueBaseVisitor;
import org.jsq.antlr.generated.JuisyqueParser;
import org.jsq.antlr.visitor.StatementsVisitor;

public class JuisyqueAnalyzer extends JuisyqueBaseVisitor<Object> {

    private Variables world = new Variables();

    @Override
    public Object visitStmts(JuisyqueParser.StmtsContext ctx) {
        StatementsVisitor root = new StatementsVisitor();
        world = root.visit(ctx, world);

        return world;
    }
}

package org.jsq.antlr.visitor;

import org.jsq.antlr.Variables;
import org.jsq.antlr.generated.JuisyqueParser;
import org.jsq.antlr.visitor.generic.StatelessVisitor;

public class DictVisitor implements StatelessVisitor<JuisyqueParser.DictContext, Variables, Object> {
    @Override
    public Object visit(JuisyqueParser.DictContext ctx, Variables world) {
        throw new UnsupportedOperationException("LATER");
    }
}

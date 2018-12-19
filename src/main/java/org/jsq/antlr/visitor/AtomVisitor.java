package org.jsq.antlr.visitor;

import org.jsq.antlr.Variables;
import org.jsq.antlr.generated.JuisyqueParser;
import org.jsq.antlr.visitor.generic.StatelessVisitor;

public class AtomVisitor implements StatelessVisitor<JuisyqueParser.AtomContext, Variables, Object> {

    @Override
    public Object visit(JuisyqueParser.AtomContext ctx, Variables world) {
        if(ctx.note()!=null) {
            return new NoteVisitor().visit(ctx.note(),world);
        } else if(ctx.chord()!=null) {
            return new NoteVisitor().visit(ctx.note(),world);
        } else if(ctx.expr()!=null) {
            return new ExprVisitor().visit(ctx.expr(),world);
        } else if(ctx.dict()!=null) {
            return new DictVisitor().visit(ctx.dict(),world);
        } else {
            throw new UnsupportedOperationException("LATER");
        }
    }
}

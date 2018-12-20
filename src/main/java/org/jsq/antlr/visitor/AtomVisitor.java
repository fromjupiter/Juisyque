package org.jsq.antlr.visitor;

import org.jsq.antlr.Variables;
import org.jsq.antlr.generated.JuisyqueParser;
import org.jsq.antlr.visitor.generic.StatelessVisitor;
import org.jsq.exception.JsqInvalidLogicException;

public class AtomVisitor implements StatelessVisitor<JuisyqueParser.AtomContext, Variables, Object> {

    @Override
    public Object visit(JuisyqueParser.AtomContext ctx, Variables world) {
        if(ctx.note()!=null) {
            return new NoteVisitor().visit(ctx.note(),world);
        } else if(ctx.chord()!=null) {
            return new ChordVisitor().visit(ctx.chord(),world);
        } else if(ctx.expr()!=null) {
            return new ExprVisitor().visit(ctx.expr(),world);
        } else if(ctx.dict()!=null) {
            return new DictVisitor().visit(ctx.dict(), world);
        } else if(ctx.variable()!=null) {
            String name = ctx.variable().name().getText();
            if(!world.containsKey(name)) throw new JsqInvalidLogicException(String.format("Variable name [%s] is not found in the context!", name));
            return world.get(name).getValue();
        } else {
            throw new UnsupportedOperationException("LATER");
        }
    }
}

package org.jsq.antlr.visitor;

import org.jsq.NoteUtils;
import org.jsq.antlr.Variables;
import org.jsq.antlr.generated.JuisyqueParser;
import org.jsq.antlr.visitor.generic.StatelessVisitor;

public class NoteVisitor implements StatelessVisitor<JuisyqueParser.NoteContext, Variables, Object> {

    @Override
    public Object visit(JuisyqueParser.NoteContext ctx, Variables world) {
        return NoteUtils.makeTemporal(ctx.NOTE().getText());
    }
}

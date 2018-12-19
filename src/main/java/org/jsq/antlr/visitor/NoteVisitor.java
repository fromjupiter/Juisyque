package org.jsq.antlr.visitor;

import org.antlr.v4.runtime.tree.TerminalNode;
import org.jsq.NoteUtils;
import org.jsq.antlr.Variables;
import org.jsq.antlr.generated.JuisyqueLexer;
import org.jsq.antlr.generated.JuisyqueParser;
import org.jsq.antlr.visitor.generic.StatelessVisitor;
import org.jsq.core.basic.Pitch;
import org.jsq.core.basic.Symbol;
import org.jsq.core.note.PitchNote;
import org.jsq.core.note.SymbolNote;

import java.util.Arrays;
import java.util.List;

public class NoteVisitor implements StatelessVisitor<JuisyqueParser.NoteContext, Variables, Object> {

    @Override
    public Object visit(JuisyqueParser.NoteContext ctx, Variables world) {
        return NoteUtils.makeNote(ctx.NOTE().getText());
    }
}

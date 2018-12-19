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

    private final static List<String> symbols = Arrays.asList("T","R");

    @Override
    public Object visit(JuisyqueParser.NoteContext ctx, Variables world) {
        TerminalNode node = ctx.NOTE();
        String noteText = node.getText().toUpperCase();
        switch(noteText) {
            case "T":return new SymbolNote(Symbol.construct(Symbol.Type.TENUTO));
            case "R":return new SymbolNote(Symbol.construct(Symbol.Type.REST));
            default: return new PitchNote(NoteUtils.makePitch(noteText));
        }
    }
}

package org.jsq.antlr.visitor;

import org.antlr.v4.runtime.tree.TerminalNode;
import org.jsq.NoteUtils;
import org.jsq.antlr.Variables;
import org.jsq.antlr.generated.JuisyqueParser;
import org.jsq.antlr.visitor.generic.StatelessVisitor;
import org.jsq.core.basic.Chord;
import org.jsq.core.basic.Pitch;
import org.jsq.core.note.PitchNote;

import java.util.List;
import java.util.stream.Collectors;

public class ChordVisitor implements StatelessVisitor<JuisyqueParser.ChordContext, Variables, Object> {
    @Override
    public Object visit(JuisyqueParser.ChordContext ctx, Variables world) {
        List<JuisyqueParser.Chord_elementContext> notes = ctx.chord_element();
        return new Chord(
                notes.stream()
                .map(x-> NoteUtils.makeNote(x.note().NOTE().getText()) )
                .filter(x-> x instanceof PitchNote)
                .map(x-> ((PitchNote)x).getPitch())
                .collect(Collectors.toList())
        );

    }
}

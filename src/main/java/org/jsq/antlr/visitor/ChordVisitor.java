package org.jsq.antlr.visitor;

import org.jsq.NoteUtils;
import org.jsq.antlr.Variables;
import org.jsq.antlr.generated.JuisyqueParser;
import org.jsq.antlr.visitor.generic.StatelessVisitor;
import org.jsq.core.music.Chord;
import org.jsq.core.music.Note;

import java.util.List;
import java.util.stream.Collectors;

public class ChordVisitor implements StatelessVisitor<JuisyqueParser.ChordContext, Variables, Object> {
    @Override
    public Object visit(JuisyqueParser.ChordContext ctx, Variables world) {
        List<JuisyqueParser.Chord_elementContext> notes = ctx.chord_element();
        return new Chord(
                notes.stream()
                .map(x-> NoteUtils.makeTemporal(x.note().NOTE().getText()) )
                .filter(x-> x instanceof Note)
                .map(x-> ((Note)x).getPitch())
                .collect(Collectors.toList())
        );

    }
}

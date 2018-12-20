package org.jsq.core.music;

import org.jsq.core.basic.Pitch;
import org.jsq.exception.JsqInvalidAttributeException;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Chord extends Temporal<List<Pitch>> implements Iterable<Note> {

    private List<Note> notes;

    public Chord(List<Pitch> pitches) {
        this(pitches, 1.0);
    }

    public Chord(Pitch... pitches) {
        this(Arrays.asList(pitches),1.0);
    }

    public Chord(List<Pitch> pitches, Double span) {
        this.subject = pitches;
        this.timeSpan = span;
        this.notes = pitches.stream().map(p->new Note(p,timeSpan)).collect(Collectors.toList());
    }

    @Override
    public void setTimeSpan(Double span) {
        if(span < 0) throw new JsqInvalidAttributeException("Time span should be positive value");
        timeSpan = span;
        this.notes.forEach(x->x.setTimeSpan(timeSpan));
    }

    public Note get(int index) {
        return notes.get(index);
    }

    public int size() { return notes.size(); }

    @Override
    public Iterator<Note> iterator() {
        return notes.iterator();
    }

    @Override
    public void forEach(Consumer<? super Note> action) {
        notes.forEach(action);
    }

    @Override
    public Spliterator<Note> spliterator() {
        return notes.spliterator();
    }

}

package org.jsq.core.basic;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Chord implements Iterable<Pitch> {

    List<Pitch> pitches;

    public Chord(List<Pitch> pitches) {
        this.pitches = pitches;
    }

    public Chord(Pitch... pitches) {
        this.pitches = Arrays.asList(pitches);
    }

    public Pitch get(int index) {
        return pitches.get(index);
    }

    @Override
    public Iterator<Pitch> iterator() {
        return pitches.iterator();
    }

    @Override
    public void forEach(Consumer<? super Pitch> action) {
        pitches.forEach(action);
    }

    @Override
    public Spliterator<Pitch> spliterator() {
        return pitches.spliterator();
    }
}

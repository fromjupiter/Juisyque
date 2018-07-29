package org.jsq.core.note;

import org.jsq.core.basic.Chord;

public class ChordNote extends Note<Chord> {

    public ChordNote(Chord chord) {
        this.subject = chord;
    }

    public ChordNote(Chord chord, Double span) {
        this.subject = chord;
        this.timeSpan = span;
    }

    public Chord getChord() {
        return this.subject;
    }

}

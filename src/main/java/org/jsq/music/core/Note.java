package org.jsq.music.core;

import org.jsq.music.attr.Pitch;

public final class Note extends Temporal<Pitch> {

    public Note(Pitch pitch) {
        this(pitch,1.0);
    }

    public Note(Pitch pitch, Double span) {
        this.subject = pitch;
        this.timeSpan = span;
    }

    public Pitch getPitch() {
        return this.subject;
    }

}
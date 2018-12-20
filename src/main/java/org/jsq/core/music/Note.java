package org.jsq.core.music;

import org.jsq.core.basic.Pitch;

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
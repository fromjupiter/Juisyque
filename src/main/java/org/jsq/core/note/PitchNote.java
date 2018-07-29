package org.jsq.core.note;

import org.jsq.core.basic.Pitch;

public final class PitchNote extends Note<Pitch> {

    public PitchNote(Pitch pitch) {
        this.subject = pitch;
    }

    public PitchNote(Pitch pitch, Double span) {
        this.subject = pitch;
        this.timeSpan = span;
    }

    public Pitch getPitch() {
        return this.subject;
    }

}
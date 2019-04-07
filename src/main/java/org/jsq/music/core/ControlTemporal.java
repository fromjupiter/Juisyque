package org.jsq.music.core;

import org.jsq.music.attr.Control;

public class ControlTemporal extends Temporal<Control> {

    public ControlTemporal(Control symbol) {
        this.subject = symbol;
    }

    public ControlTemporal(Control symbol, Double span) {
        this.subject = symbol;
        this.timeSpan = span;
    }

    public Control getValue() {
        return this.subject;
    }
}

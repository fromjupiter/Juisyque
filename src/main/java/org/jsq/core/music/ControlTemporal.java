package org.jsq.core.music;

import org.jsq.core.basic.Control;

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

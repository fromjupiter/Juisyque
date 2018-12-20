package org.jsq.core.basic;

import lombok.Getter;

public class Control {
    public enum Type {
        REST,
        TENUTO
    }

    @Getter
    private Type type;

    private Control(Type type) {
        this.type = type;
    }

    public static Control construct(Type type) {
        return new Control(type);
    }
}

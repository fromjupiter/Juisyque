package org.jsq.core.basic;

import lombok.Getter;

public class Symbol {
    public enum Type {
        REST,
        TENUTO
    }

    @Getter
    private Type type;

    private Symbol(Type type) {
        this.type = type;
    }

    public static Symbol construct(Type type) {
        return new Symbol(type);
    }
}

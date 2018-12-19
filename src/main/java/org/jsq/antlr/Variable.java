package org.jsq.antlr;

import lombok.Getter;
import lombok.Setter;

public class Variable {

    private String id;

    @Getter
    @Setter
    private Object value;

    public Variable(String id) {
        this(id, null);
    }

    public Variable(String id, Object value) {
        this.id = id;
        this.value = value;
    }

    public String id() {
        return id;
    }

    public String type() {
        throw new UnsupportedOperationException("LATER!");
    }

    public String toString() {
        return String.format("$%s = %s",id,value.toString());
    }
}

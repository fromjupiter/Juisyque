package org.jsq.syntax.type.operator;

public enum Ops {
    Add("+"),
    MINUS("-"),
    TIMES("*"),
    DIVDE("/"),
    BIDIVIDE("//"),
    BITIMES("**");

    private String value;
    Ops(String symbol) {this.value = symbol;}

    public String symbol() {return value;}

    public static Ops fromSymbol(String symbol) {
        for(Ops o: Ops.values()) {
            if(o.value.equals(symbol)){
                return o;
            }
        }
        throw new IllegalArgumentException("No operator with symbol ["+ symbol + "].");
    }
}

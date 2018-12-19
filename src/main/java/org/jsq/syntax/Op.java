package org.jsq.syntax;

public enum Op {
    Add("+"),
    MINUS("-"),
    TIMES("*"),
    DIVDE("/"),
    BIDIVIDE("//"),
    BITIMES("**");

    private String value;
    Op(String symbol) {this.value = symbol;}

    public String symbol() {return value;}

    public static Op fromSymbol(String symbol) {
        for(Op o:Op.values()) {
            if(o.value.equals(symbol)){
                return o;
            }
        }
        throw new IllegalArgumentException("No operator with symbol ["+ symbol + "].");
    }
}

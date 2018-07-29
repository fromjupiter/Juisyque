package org.jsq.core.note;

import org.jsq.core.basic.Symbol;

public class SymbolNote extends Note<Symbol> {

    public SymbolNote(Symbol symbol) {
        this.subject = symbol;
    }

    public SymbolNote(Symbol symbol, Double span) {
        this.subject = symbol;
        this.timeSpan = span;
    }

    public Symbol getSymbol() {
        return this.subject;
    }
}

package org.jsq.core;

import org.jsq.core.generic.Vector;
import org.jsq.core.music.Temporal;

import java.util.ArrayList;
import java.util.List;

public class TemporalVector extends Vector<Temporal> {

    public TemporalVector() { elements = new ArrayList<>(); }

    public TemporalVector(List<Temporal> elements) {
        this.elements = elements;
    }

    @Override
    public double length() {
        return elements.stream().mapToDouble(Temporal::getDuration).sum();
    }

    @Override
    public Vector<Temporal> slice(int fromIndex, int toIndex) {
        return new TemporalVector(elements.subList(fromIndex, toIndex));
    }

    @Override
    public boolean validate() {
        return true;
    }

    @Override
    public boolean validate(Temporal note) {
        return true;
    }

}

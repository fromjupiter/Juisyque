package org.jsq.core;

import org.jsq.core.generic.Vector;
import org.jsq.core.note.Note;
import org.jsq.core.note.Temporal;

import java.util.ArrayList;
import java.util.List;

public class NoteVector extends Vector<Note> {

    public NoteVector() { elements = new ArrayList<>(); }

    public NoteVector(List<Note> elements) {
        this.elements = elements;
    }

    @Override
    public double length() {
        return elements.stream().mapToDouble(Note::getDuration).sum();
    }

    @Override
    public Vector<Note> slice(int fromIndex, int toIndex) {
        return new NoteVector(elements.subList(fromIndex, toIndex));
    }

    @Override
    public boolean validate() {
        return true;
    }

    @Override
    public boolean validate(Note note) {
        return true;
    }

}

package org.jsq.core;

import org.jsq.core.generic.Matrix;
import org.jsq.core.generic.Vector;
import org.jsq.core.note.Note;
import org.jsq.exception.JsqInvalidAttributeException;
import org.jsq.exception.JsqUnsupportedException;

import java.util.ArrayList;
import java.util.List;

public class NoteMatrix extends Matrix<Note> {

    public NoteMatrix() {
        elements = new ArrayList<>();
    }

    public NoteMatrix(List<Vector<Note>> elements) throws JsqInvalidAttributeException {
        if( elements.isEmpty()
                || elements.stream().allMatch( t->t.length()==elements.get(0).length())) {
            this.elements = elements;
        } else {
            throw new JsqInvalidAttributeException("Note matrix construction failed because given vectors have different length");
        }
    }

    @Override
    public NoteMatrix slice(int fromIndex, int toIndex) {
        return hSlice(fromIndex, toIndex);
    }

    public NoteMatrix vSlice(int fromIndex, int toIndex) {
        throw new JsqUnsupportedException("VSLICE not supported yet!", NoteMatrix.class);
    }

    public NoteMatrix hSlice(int fromIndex, int toIndex) {
        try {
            return new NoteMatrix(elements.subList(fromIndex, toIndex));
        } catch (JsqInvalidAttributeException ex) {
            throw new JsqUnsupportedException("Shouldn't be here!", NoteMatrix.class, ex);
        }
    }

}

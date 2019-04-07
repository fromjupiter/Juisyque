package org.jsq.music;

import org.jsq.music.generic.Matrix;
import org.jsq.music.generic.Vector;
import org.jsq.music.core.Temporal;
import org.jsq.exception.JsqInvalidLogicException;
import org.jsq.exception.JsqUnsupportedException;

import java.util.ArrayList;
import java.util.List;

public class TemporalMatrix extends Matrix<Temporal> {

    public TemporalMatrix() {
        elements = new ArrayList<>();
    }

    public TemporalMatrix(List<Vector<Temporal>> elements) throws JsqInvalidLogicException {
        if( elements.isEmpty()
                || elements.stream().allMatch( t->t.length()==elements.get(0).length())) {
            this.elements = elements;
        } else {
            throw new JsqInvalidLogicException("Temporal matrix construction failed because given vectors have different length");
        }
    }

    @Override
    public TemporalMatrix slice(int fromIndex, int toIndex) {
        return hSlice(fromIndex, toIndex);
    }

    public TemporalMatrix vSlice(int fromIndex, int toIndex) {
        throw new JsqUnsupportedException("VSLICE not supported yet!", TemporalMatrix.class);
    }

    public TemporalMatrix hSlice(int fromIndex, int toIndex) {
        try {
            return new TemporalMatrix(elements.subList(fromIndex, toIndex));
        } catch (JsqInvalidLogicException ex) {
            throw new JsqUnsupportedException("Shouldn't be here!", TemporalMatrix.class, ex);
        }
    }

}

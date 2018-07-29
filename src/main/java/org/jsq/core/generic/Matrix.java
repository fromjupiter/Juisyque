package org.jsq.core.generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class Matrix<T> extends Vector<Vector<T>> {

    /*
        return the length of the first row
     */
    @Override
    public double length() {
        if(elements.isEmpty()) {
            return 0;
        } else {
            return elements.get(0).length();
        }
    }

    /*
        A valid matrix require that all rows are at the same length
     */
    @Override
    public boolean validate() {
        return elements.isEmpty() || elements.stream().allMatch(elements.get(0)::equals);
    }

    @Override
    public boolean validate(Vector<T> v) {
        return v.length() == length();
    }
}

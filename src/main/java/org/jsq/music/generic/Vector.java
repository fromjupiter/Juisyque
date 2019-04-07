package org.jsq.music.generic;

import org.jsq.exception.JsqUnsupportedException;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public abstract class Vector<T> implements Collection<T> {

    protected List<T> elements;

    public abstract double length();

    public abstract Vector<T> slice(int fromIndex, int toIndex);

    public abstract boolean validate();

    public abstract boolean validate(T t);

    @Override
    public Iterator<T> iterator() {
        return elements.iterator();
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        throw new JsqUnsupportedException("Feature not supported yet!",Vector.class);
    }

    @Override
    public boolean add(T t) {
        return validate(t) && elements.add(t);
    }

    public Optional<T> set(int index, T t) {
        if ( validate(t) ) {
            return Optional.of(elements.set(index, t));
        } else {
            return Optional.empty();
        }
    }

    public boolean add(int index, T t) {
        if (validate(t)) {
            elements.add(index, t);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean remove(Object o) {
        return elements.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return elements.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return c.stream().allMatch(this::validate) && elements.addAll(c);
    }

    public boolean addAll(int index, Collection<? extends T> c) {
        return c.stream().allMatch(this::validate) && elements.addAll(index, c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return elements.removeAll(c);
    }

    @Override
    public boolean removeIf(Predicate<? super T> filter) {
        return elements.removeIf(filter);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return elements.retainAll(c);
    }

    @Override
    public void clear() {
        elements.clear();
    }

    public void sort(Comparator<? super T> c) {
        elements.sort(c);
    }

    public T get(int index) {
        return elements.get(index);
    }

    public T remove(int index) {
        return elements.remove(index);
    }

    public ListIterator<T> listIterator() {
        return elements.listIterator();
    }

    public ListIterator<T> listIterator(int index) {
        return elements.listIterator(index);
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        elements.forEach(action);
    }

    @Override
    public Spliterator<T> spliterator() {
        return elements.spliterator();
    }

    @Override
    public Stream<T> stream() {
        return elements.stream();
    }

    @Override
    public Stream<T> parallelStream() {
        return elements.parallelStream();
    }

    @Override
    public int size() {
        return elements.size();
    }

    @Override
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return elements.contains(o);
    }
}

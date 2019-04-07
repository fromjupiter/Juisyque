package org.jsq.music.generic;

public abstract class BinaryTree<T> {
    private T value;

    private BinaryTree<T> left;
    private BinaryTree<T> right;

    public BinaryTree(T value) {
        this.value = value;
    }

    public BinaryTree<T> getLeft() {
        return left;
    }

    public BinaryTree<T> getRight() {
        return right;
    }

    public void setLeft(BinaryTree<T> left) {
        this.left = left;
    }

    public void setRight(BinaryTree<T> right) {
        this.right = right;
    }
}

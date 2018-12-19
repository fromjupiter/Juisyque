package org.jsq.antlr.visitor.generic;

public interface StatelessVisitor<T, W, R> {

    R visit(T ctx,W world);
}

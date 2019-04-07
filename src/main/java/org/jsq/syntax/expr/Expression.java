package org.jsq.syntax.expr;

import org.jsq.music.generic.BinaryTree;
import org.jsq.syntax.type.Type;

public class Expression {
    private final BinaryTree<ExprTreeNode> root;

    private Type type;

    public Type type() {
        if(type == null) {
            //TODO: calc type

        }
        return type;
    }

    public Expression(BinaryTree<ExprTreeNode> root) {
        this.root = root;
    }
}


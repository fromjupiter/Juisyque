package org.jsq.antlr;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.jsq.antlr.generated.JuisyqueBaseVisitor;
import org.jsq.antlr.generated.JuisyqueLexer;
import org.jsq.antlr.generated.JuisyqueParser;
import org.jsq.antlr.generated.JuisyqueVisitor;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;

public class Juisyque {

    private JuisyqueVisitor visitor;

    public Juisyque() {
        visitor = new JuisyqueAnalyzer();
    }

    public Object compile(CharStream charStream) {
        JuisyqueLexer lexer = new JuisyqueLexer(charStream);
        JuisyqueParser parser = new JuisyqueParser(new CommonTokenStream(lexer));

        ParseTree tree = parser.stmts();

        return visitor.visit(tree);
    }

    public Object compile(InputStream inputStream) throws IOException {
        return compile(CharStreams.fromStream(inputStream));
    }

    public Object compile(Path path) throws IOException {
        return compile(CharStreams.fromPath(path));
    }

    public Object compile(String filename) throws IOException {
        return compile(CharStreams.fromFileName(filename));
    }
}

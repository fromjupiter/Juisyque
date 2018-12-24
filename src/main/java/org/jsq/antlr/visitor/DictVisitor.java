package org.jsq.antlr.visitor;

import org.jsq.antlr.Variables;
import org.jsq.antlr.generated.JuisyqueParser;
import org.jsq.antlr.visitor.generic.StatelessVisitor;
import org.jsq.exception.JsqInvalidLogicException;

import java.util.Map;
import java.util.stream.Collectors;

public class DictVisitor implements StatelessVisitor<JuisyqueParser.DictContext, Variables, Object> {
    @Override
    public Object visit(JuisyqueParser.DictContext ctx, Variables world) {
        if(ctx==null) throw new JsqInvalidLogicException("Dictionary cannot be null");
        ExprVisitor exprVisitor = new ExprVisitor();

        Map<String, Object> result = ctx.dict_pair().stream().collect(Collectors.toMap(
                pair->pair.STRING().getText().substring(1,pair.STRING().getText().length()-1),
                pair->exprVisitor.visit(pair.expr(),world))
        );
        return result;
    }
}

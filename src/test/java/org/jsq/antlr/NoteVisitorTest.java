package org.jsq.antlr;

import org.antlr.v4.runtime.tree.TerminalNode;
import org.jsq.antlr.generated.JuisyqueParser;
import org.jsq.antlr.visitor.NoteVisitor;
import org.jsq.core.note.Note;
import org.jsq.core.note.PitchNote;
import org.jsq.core.note.SymbolNote;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.io.ByteArrayInputStream;

import static org.mockito.Mockito.*;

public class NoteVisitorTest {
    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @Mock
    JuisyqueParser.NoteContext ctx;

    @Mock
    TerminalNode node;

    @Before
    public void setUp() {
        when(node.getText()).thenReturn("G#o4");
        when(ctx.NOTE()).thenReturn(node);
    }

    @Test
    public void testVisit001() {
        Variables variables = new Variables();
        PitchNote res = (PitchNote) new NoteVisitor().visit(ctx,variables);
        Assert.assertEquals("GSHARP",res.getPitch().getStep().name());
        Assert.assertEquals(4,res.getPitch().getOctave());
    }

    @Test
    public void testVisit002() {
        Variables variables = new Variables();

        when(node.getText()).thenReturn("T");
        SymbolNote res = (SymbolNote) new NoteVisitor().visit(ctx,variables);
        Assert.assertEquals("TENUTO",res.getSymbol().getType().name());

        when(node.getText()).thenReturn("R");
        res = (SymbolNote) new NoteVisitor().visit(ctx,variables);
        Assert.assertEquals("REST",res.getSymbol().getType().name());
    }
}

package org.jsq.antlr;

import org.antlr.v4.runtime.tree.TerminalNode;
import org.jsq.antlr.generated.JuisyqueParser;
import org.jsq.antlr.visitor.NoteVisitor;
import org.jsq.core.music.Note;
import org.jsq.core.music.ControlTemporal;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

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
        Note res = (Note) new NoteVisitor().visit(ctx,variables);
        Assert.assertEquals("GSHARP",res.getPitch().getStep().name());
        Assert.assertEquals(4,res.getPitch().getOctave());
    }

    @Test
    public void testVisit002() {
        Variables variables = new Variables();

        when(node.getText()).thenReturn("T");
        ControlTemporal res = (ControlTemporal) new NoteVisitor().visit(ctx,variables);
        Assert.assertEquals("TENUTO",res.getValue().getType().name());

        when(node.getText()).thenReturn("R");
        res = (ControlTemporal) new NoteVisitor().visit(ctx,variables);
        Assert.assertEquals("REST",res.getValue().getType().name());
    }
}

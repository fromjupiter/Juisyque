package org.jsq.antlr.visitor;

import org.jsq.antlr.Variables;
import org.jsq.antlr.generated.JuisyqueParser;
import org.jsq.core.basic.Pitch;
import org.jsq.core.music.Chord;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.RETURNS_DEEP_STUBS;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ChordVisitorTest {
    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @Mock
    JuisyqueParser.ChordContext ctx;

    List<JuisyqueParser.Chord_elementContext> nodes = new ArrayList<>();

    @Before
    public void setUp() {
        JuisyqueParser.Chord_elementContext ctx1 = mock(JuisyqueParser.Chord_elementContext.class, RETURNS_DEEP_STUBS);
        JuisyqueParser.Chord_elementContext ctx2 = mock(JuisyqueParser.Chord_elementContext.class, RETURNS_DEEP_STUBS);
        JuisyqueParser.Chord_elementContext ctx3 = mock(JuisyqueParser.Chord_elementContext.class, RETURNS_DEEP_STUBS);
        nodes.add(ctx1);
        nodes.add(ctx2);
        nodes.add(ctx3);
        when(ctx1.note().NOTE().getText()).thenReturn("G");
        when(ctx2.note().NOTE().getText()).thenReturn("B");
        when(ctx3.note().NOTE().getText()).thenReturn("Do+1");
        when(ctx.chord_element()).thenReturn(nodes);
    }

    @Test
    public void testVisit001() {
        Variables variables = new Variables();
        Chord res = (Chord) new ChordVisitor().visit(ctx,variables);

        Assert.assertEquals(Pitch.construct(Pitch.Step.G, 0),res.get(0).getPitch());
        Assert.assertEquals(Pitch.construct(Pitch.Step.B, 0),res.get(1).getPitch());
        Assert.assertEquals(Pitch.construct(Pitch.Step.D, 1),res.get(2).getPitch());
    }
}
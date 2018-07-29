package org.jsq.core.basic;

import lombok.Getter;

/**
 * The Pitch class stands for pitches in musical field.
 * <p>An Pitch object has two components:<br/>
 * pitch step, e.g. C,D,E,F,G,A,B<br/>
 * octave field, the widely-known term "standard C" is a C step in octave field 4.<br/>
 *
 * @author Kexiang Feng
 */
public final class Pitch {

    public enum Step {
        C (0),
        CSHARP(1),DFLAT (1),
        D(2),
        DSHARP(3),EFLAT (3),
        E(4), FFLAT(4),
        F(5), ESHARP(5),
        FSHARP(6),GFLAT(6),
        G(7),
        GSHARP(8),AFLAT(8),
        A(9),
        ASHARP(10),BFLAT(10),
        B(11),CFLAT(11),
        BSHARP(12)
        ;
        private int value;

        Step(int i){this.value = i;}

        public int toInt(){return value;}
    }

    @Getter
    private int octave; //valid range is 1-8

    @Getter
    private Step step; // 0-12

    private Pitch(Step step, int octave) {
        this.step = step;
        this.octave = octave;
    }

    public static Pitch construct(Step step, int octave) {
        return new Pitch(step, octave);
    }

    @Override
    public String toString(){
        return step.name();
    }

    public String toFullString(){
        return step.name()+"o"+ octave;
    }

    @Override
    public boolean equals(Object o){
        if(this==o) return true;
        if(o==null||this.getClass()!=o.getClass()) return false;
        Pitch other = (Pitch)o;
        return octave ==other.octave
                && step.toInt()==other.step.toInt();
    }

    @Override
    public int hashCode(){
        return octave * 20 + step.toInt();
    }

    /**
     * Get the midi key value of the object
     * @return midi key value
     */
    public int toMidiKey(){
        return toMidiKey(0);
    }

    public int toMidiKey(int offset) {
        return (octave + offset + 1) * 12 + step.toInt();
    }
}
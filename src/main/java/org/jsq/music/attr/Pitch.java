package org.jsq.music.attr;

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
        C (0, "C"),
        CSHARP(1, "C#"),DFLAT (1, "Db"),
        D(2, "D"),
        DSHARP(3, "D#"),EFLAT (3, "Eb"),
        E(4, "E"), FFLAT(4, "Fb"),
        F(5, "F"), ESHARP(5, "E#"),
        FSHARP(6, "F#"),GFLAT(6, "Gb"),
        G(7, "G"),
        GSHARP(8, "G#"),AFLAT(8, "Ab"),
        A(9, "A"),
        ASHARP(10, "A#"),BFLAT(10, "Bb"),
        B(11, "B"),CFLAT(11, "Cb"),
        BSHARP(12, "B#")
        ;

        private int value;
        private String str;

        Step(int i,String str){this.value = i; this.str = str;}

        public int toInt(){return value;}

        public String toString() {return str;}
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
        return step.toString();
    }

    public String toFullString(){
        return step.toString() + octave;
    }

    @Override
    public boolean equals(Object o){
        if(this==o) return true;
        if(o==null||this.getClass()!=o.getClass()) return false;
        Pitch other = (Pitch)o;
        return octave ==other.octave
                && step==other.step;
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
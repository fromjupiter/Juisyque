package org.jsq.music.attr;

public class Volume {

    private int value;

    public Volume(int value) {
        if(value < 0 || value > 15)
            value = 15;
        this.value = value;
    }

    @Override
    public String toString(){return "v"+value;}

    @Override
    public boolean equals(Object o){
        if(this==o) return true;
        if(o==null||this.getClass()!=o.getClass()) return false;
        Volume other = (Volume)o;
        return value==other.value;
    }

    @Override
    public int hashCode(){
        return value;
    }

    public int toMidiVelocity(){
        return value*8;
    }
}

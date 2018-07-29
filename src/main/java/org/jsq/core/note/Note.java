package org.jsq.core.note;

import lombok.Getter;
import lombok.Setter;
import org.jsq.core.basic.Volume;

public abstract class Note<T> implements Temporal {

    protected T subject;

    @Getter
    @Setter
    protected Double timeSpan = 1.0;

    /*
        Default time span unit is a full note (1.0)
     */
    @Getter
    @Setter
    protected Double spanBase = 1.0;

    @Getter
    @Setter
    protected Volume volume = new Volume(15);

    @Override
    public Double getDuration() {
        return timeSpan * spanBase;
    }

    @Override
    public String toString(){
        return subject.toString();
    }

    @Override
    public boolean equals(Object o){
        if(this==o) return true;
        if(o==null||this.getClass()!=o.getClass()) return false;
        Note other = (Note)o;
        return subject.equals(other.subject);
    }

    @Override
    public int hashCode(){
        return subject.hashCode();
    }

}

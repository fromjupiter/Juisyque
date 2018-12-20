package org.jsq.core.music;

import lombok.Getter;
import lombok.Setter;
import org.jsq.core.basic.Volume;
import org.jsq.exception.JsqInvalidLogicException;

public abstract class Temporal<T> {

    protected T subject;

    protected Double timeSpan = 1.0;

    /*
        Default time span unit is a full music (1.0)
     */
    @Getter
    @Setter
    protected Double spanBase = 1.0;

    @Getter
    @Setter
    protected Volume volume = new Volume(15);

    public Double getTimeSpan() { return timeSpan; }

    public void setTimeSpan(Double span) {
        if(span < 0) throw new JsqInvalidLogicException("Time span should be positive value");
        this.timeSpan = span;
    }

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
        Temporal other = (Temporal)o;
        return subject.equals(other.subject);
    }

    @Override
    public int hashCode(){
        return subject.hashCode();
    }

}

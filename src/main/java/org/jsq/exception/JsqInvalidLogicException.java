package org.jsq.exception;

public class JsqInvalidLogicException extends RuntimeException {
    private static final long serialVersionUID = 1351179695646884185L;
    private int index;
    private int start;
    private int end;
    public JsqInvalidLogicException(String msg){
        super(msg);
    }

    public JsqInvalidLogicException(String msg, Throwable cause){
        super(msg, cause);
    }

    public JsqInvalidLogicException(int start, int end, String msg){
        super(msg);
        this.start = start;
        this.end = end;
    }

    public JsqInvalidLogicException(int index, int start, int end, String msg){
        super(msg);
        this.index = index;
        this.start = start;
        this.end = end;
    }

    public int getIndex() {
        return index;
    }
    public void setIndex(int index) {
        this.index = index;
    }
    public int getStart() {
        return start;
    }
    public void setStart(int start) {
        this.start = start;
    }
    public int getEnd() {
        return end;
    }
    public void setEnd(int end) {
        this.end = end;
    }

    @Override
    public String toString(){
        return super.toString()+" ("+index+","+start+","+end+")";
    }
}

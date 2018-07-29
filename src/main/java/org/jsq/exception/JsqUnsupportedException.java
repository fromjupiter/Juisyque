package org.jsq.exception;

public class JsqUnsupportedException extends RuntimeException  {

    private Class location;

    public JsqUnsupportedException(String msg) {
        super(msg);
    }

    public JsqUnsupportedException(String msg, Class clazz) {
        super(msg);
        location = clazz;
    }

    public JsqUnsupportedException(String msg, Class clazz, Throwable cause) {
        super(msg, cause);
        location = clazz;
    }

}

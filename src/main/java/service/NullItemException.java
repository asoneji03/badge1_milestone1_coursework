package service;

public class NullItemException extends Exception{
    public NullItemException(String message) {
        super(message);
    }

    public NullItemException(String message, Throwable cause){
        super(message, cause);
    }
}

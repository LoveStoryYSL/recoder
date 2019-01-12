package com.xtu.liuli.exception;

import java.io.IOException;

public class FileNotExistException extends IOException
{
    public FileNotExistException(String message) {
        super(message);
    }
    public FileNotExistException(String message, Throwable cause) {
        super(message, cause);
    }
    public FileNotExistException(Throwable cause) {
        super(cause);
    }
    public FileNotExistException(){
        super();
    }
}
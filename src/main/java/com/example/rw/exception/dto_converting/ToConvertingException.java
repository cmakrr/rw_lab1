package com.example.rw.exception.dto_converting;

public class ToConvertingException extends RuntimeException {

    public ToConvertingException(String message){
        super(message);
    }

    public ToConvertingException(){
        super("Could not execute dto conversion");
    }
}
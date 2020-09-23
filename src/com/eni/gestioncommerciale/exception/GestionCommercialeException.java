package com.eni.gestioncommerciale.exception;
import java.lang.Exception;

public class GestionCommercialeException extends Exception{
    public GestionCommercialeException() {
    }

    public GestionCommercialeException(String message) {
        super(message);
    }

    public GestionCommercialeException(String message, Throwable cause) {
        super(message, cause);
    }

    public GestionCommercialeException(Throwable cause) {
        super(cause);
    }

    public GestionCommercialeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

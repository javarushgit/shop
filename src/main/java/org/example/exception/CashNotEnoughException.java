package org.example.exception;

public class CashNotEnoughException extends Exception
{
    public CashNotEnoughException(String message) {
        super(message);
    }
}

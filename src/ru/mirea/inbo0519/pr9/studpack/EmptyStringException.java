package ru.mirea.inbo0519.pr9.studpack;

public class EmptyStringException extends IllegalArgumentException{
    public EmptyStringException(String err)
    {
        super(err);
    }
}

package ru.mirea.inbo0519.pr9.clientpack;

public class InvalidTINException extends RuntimeException {
    public InvalidTINException(String err){
        super(err);
    }
}

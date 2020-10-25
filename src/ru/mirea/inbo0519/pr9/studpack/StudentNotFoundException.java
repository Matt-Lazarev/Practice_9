package ru.mirea.inbo0519.pr9.studpack;

public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(String err){
        super(err);
    }
}

package ru.mirea.inbo0519.pr9.clientpack;

public class Client {
    private final String NAME;
    private final int TIN;

    public String getName() {
        return NAME;
    }

    public int getT() {
        return TIN;
    }

    public Client(String name, int t)
    {
        NAME = name;
        TIN = t;
    }


    @Override
    public String toString() {
        return NAME + " " + TIN;
    }
}

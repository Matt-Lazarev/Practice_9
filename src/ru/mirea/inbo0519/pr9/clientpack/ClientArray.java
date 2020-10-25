package ru.mirea.inbo0519.pr9.clientpack;

import ru.mirea.inbo0519.pr9.studpack.StudentNotFoundException;

public class ClientArray {
    private Client[] arr;

    public Client getClient(int i)
    {
        return arr[i];
    }

    public ClientArray(){
        arr = new Client[]{
                new Client("Mark", 131),
                new Client("Ellis", 182),
                new Client("Matt", 123),
                new Client("Tom", 108),
                new Client("Elle", 192),
                new Client("Kate", 104),
                new Client("Lem", 137),
                new Client("Menny", 164),
                new Client("Diana", 113),
                new Client("Tommy", 198),
                new Client("Ann", 143),
                new Client("Steve", 151)
        };
    }

    public Client check(String name, int t)
    {
        int i =0;
        while(i < arr.length && ! arr[i].getName().equals(name) )
            i++;
        if(i<arr.length && arr[i].getT() == t)
            return arr[i];
        else
            throw new InvalidTINException("Current TIN is invalid");
    }
}


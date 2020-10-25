package ru.mirea.inbo0519.pr9.clientpack;

import ru.mirea.inbo0519.pr9.studpack.StudentArray;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class TestClient {
    private static String[] name = {"Mark", "Ellis", "Matt", "Tom","Elle","Kate","Lem","Menny","Diana","Tommy","Ann","Steve"};

    private static int randI(){
        Random r = new Random();
        Date date = new Date();
        r.setSeed(date.getTime());
        return r.nextInt(name.length);
    }

    public static void main (String[] args) {
        ClientArray arr = new ClientArray();
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("1. Try \"InvalidTINException\"");
            System.out.println("2. Try \"Valid check\"");
            System.out.println("0. Exit");

            int choice = sc.nextInt();
            switch(choice)
            {
                case 0: return;
                case 1: arr.check(arr.getClient(randI()).getName(), 0);
                case 2: Client client = arr.getClient(randI());
                        System.out.println("Valid: " + arr.check(client.getName(), client.getT()));
                        break;
            }
        }while(sc.hasNextInt());
    }
}

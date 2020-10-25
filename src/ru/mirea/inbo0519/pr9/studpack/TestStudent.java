package ru.mirea.inbo0519.pr9.studpack;

import java.util.*;

public class TestStudent {
    private static String[] name = {"Mark", "Ellis", "Matt", "Tom","Elle","Kate","Lem","Menny","Diana","Tommy","Ann","Steve"};

    private static String randomNameFromList(){
        Random r = new Random();
        Date date = new Date();
        r.setSeed(date.getTime());
        int i = r.nextInt(name.length);
        return name[i];
    }

    public static void main (String[] args) {
        StudentArray arr = new StudentArray();
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("1. Try \"EmptyStringException\"");
            System.out.println("2. Try \"StudentNotFoundException\"");
            System.out.println("3. Try find method");
            System.out.println("4. Try sort method");
            System.out.println("5. Try display method");
            System.out.println("0. Exit");

            int choice = sc.nextInt();
            switch(choice)
            {
                case 0: return;
                case 1: arr.find("");
                case 2: arr.find("No name");
                case 3: System.out.println(arr.find(randomNameFromList()));
                        break;
                case 4: System.out.println("The students were sorted by average mark ");
                        arr.sortI();
                        break;
                case 5: arr.display();
            }
        }while(sc.hasNextInt());
    }
}

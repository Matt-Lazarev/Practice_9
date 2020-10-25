package ru.mirea.inbo0519.pr9.studpack;

public class StudentArray {

    private Student[] arr;

    public StudentArray(){
        arr = new Student[]{
                new Student("Mark", 4.5, 131),
                new Student("Ellis", 3.9, 182),
                new Student("Matt", 2.8, 123),
                new Student("Tom", 4.9, 108),
                new Student("Elle", 4.1, 192),
                new Student("Kate", 3.3, 104),
                new Student("Lem", 4.2, 137),
                new Student("Menny", 3.5, 164),
                new Student("Diana", 2.9, 113),
                new Student("Tommy", 3.4, 198),
                new Student("Ann", 4.2, 143),
                new Student("Steve", 5.0, 151)
        };
    }
    public void sortI()
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            Student key = arr[i];
            int j = i - 1;
            while (j >= 0 && (arr[j].compareTo(key)>0)) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public Student find(String name)
    {
        if(name.equals(""))
            throw new EmptyStringException("The argument is empty");
        else{
            int i =0;
            while(i < arr.length && !arr[i].getName().equals(name) )
                i++;
            if(i<arr.length)
                return arr[i];
            else
                throw new StudentNotFoundException("Student not found in the list");
        }
    }

    public void display()
    {
        for(var x: arr)
            System.out.println(x);
    }
}

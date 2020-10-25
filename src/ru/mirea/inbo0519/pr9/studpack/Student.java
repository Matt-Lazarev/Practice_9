package ru.mirea.inbo0519.pr9.studpack;

class Student implements Comparable<Student>
{
    private Integer ID;
    private String name;
    private Double averageMark;

    public String getName() {
        return name;
    }

    public Student(String n, double am, int num)
    {
        name = n;
        averageMark = am;
        ID = num;
    }

    @Override
    public int compareTo(Student o) {
        return this.averageMark.compareTo(o.averageMark);
    }

    @Override
    public String toString() {
        return "Name: " + name + "  Average: " + averageMark + "  ID: " + ID;
    }

}

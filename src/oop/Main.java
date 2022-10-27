package oop;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Student s1 = new Student(12, 83.5F, "Rahul");
        Student s2 = new Student(12, 80.2F, "Dev");
        System.out.println(s1.name);
        System.out.println(s2.name);
        s1.changeName("Harry");
        System.out.println(s1.name);
        System.out.println(s2.name);
    }
}

class Student{
    int rollNo;
    float marks;
    String name;

    void changeName(String name){
        this.name = name;
    }

    Student(int rollNo,float marks,String name){
        this.rollNo = rollNo;
        this.marks = marks;
        this.name = name;
    }
}
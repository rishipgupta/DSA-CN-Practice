package oop;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Student s1 = new Student(12, 83.5F, "Rahul");
        Student s2 = new Student(12, 80.2F, "Dev");
//        System.out.println(s1.name);
//        System.out.println(s2.name);
//        s1.changeName("Harry");
//        System.out.println(s1.name);
//        System.out.println(s2.name);


        //While Creating s3 the constructor with only rollNo and name parameter will be called
        Student s3 = new Student(54, "Aman");
        System.out.println(s3.rollNo);
        System.out.println(s3.name);
        //marks will give default value for floats
        System.out.println(s3.marks);

    }
}

class Student{
    int rollNo;
    float marks;
    String name;

    void changeName(String name){
        this.name = name;
    }

    //Constructor Overloading: Creating multiple constructors for different scenerios

    Student(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }

    Student(int rollNo,float marks,String name){
        this.rollNo = rollNo;
        this.marks = marks;
        this.name = name;
    }
}
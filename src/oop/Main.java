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

        //Creating an object by calling empty constructor
        Student s4 = new Student();
        //The above code will be equivalient to :
        //Student s4 = new Student(0,0f,"default name");
        //Empty constructor will initiate the values passed to this keyword
        //Here this keyword points to the constructor class;

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

    //Calling Constructor from another constructor using this keyword
    Student(){
        this(0,0f,"default name");
    }

    Student(int rollNo,float marks,String name){
        this.rollNo = rollNo;
        this.marks = marks;
        this.name = name;
    }
}
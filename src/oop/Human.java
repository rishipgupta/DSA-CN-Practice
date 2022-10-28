package oop;

public class Human {
    int age;
    String name;
    static long population;

    Human(int age, String name){
        this.age = age;
        this.name = name;
        Human.population++;
    }
}

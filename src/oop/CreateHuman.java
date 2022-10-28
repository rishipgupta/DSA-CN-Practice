package oop;

public class CreateHuman {
    public static void main(String[] args) {
        System.out.println(Human.population);
        Human h1 = new Human(23, "A");
        Human h2 = new Human(24, "B");
        System.out.println(Human.population);

    }
}

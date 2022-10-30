package inheritancetemp;

import inheritance.Vehicle;

public class Bike extends Vehicle {
    public Bike(){
        super(100);
    }
        public void print(){
            super.print();
            System.out.println("Bike print called");
        }
//    public static void main(String[] args) {
//        Bike b = new Bike();
//        b.maxSpeed = 100;
//        System.out.println(b.maxSpeed);
//        print();
//    }
}

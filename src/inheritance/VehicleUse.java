package inheritance;

import inheritancetemp.Bike;

public class VehicleUse {
    public static void main(String[] args) {
//        Vehicle v = new Vehicle();
//        v.color = "Red";
        //Checking protected access modifier
        //maxSpeed is protected variable
        //VehicleUse is non derived class in same package
//        v.maxSpeed = 100;
//        v.print();

        Car c = new Car(240,4);
        c.color  = "black";
//        c.numDoors = 4;
//        c.maxSpeed = 240;
        //print method is inherited by c from Car class
        c.print();
        Bike b = new Bike();
        b.print();
    }
}

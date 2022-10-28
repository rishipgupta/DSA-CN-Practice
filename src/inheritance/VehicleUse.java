package inheritance;

public class VehicleUse {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.color = "Red";
        v.print();

        Car c = new Car();
        c.color  = "black";
        c.numDoors = 4;
        c.maxSpeed = 240;
        //print method is inherited by Car from Vehicle
        c.print();
    }
}

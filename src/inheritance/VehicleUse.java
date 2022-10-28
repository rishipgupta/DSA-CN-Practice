package inheritance;

public class VehicleUse {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.color = "Red";
        v.print();

        Car c = new Car();
        //print method is inherited by Car from Vehicle
        c.print();
    }
}

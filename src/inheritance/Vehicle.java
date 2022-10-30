package inheritance;

public class Vehicle {
    String color;
    protected int maxSpeed;

    public Vehicle(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }
    public void print() {
        System.out.println("Color of Vehicle is " + color + " and max speed is " + maxSpeed);
    }
}

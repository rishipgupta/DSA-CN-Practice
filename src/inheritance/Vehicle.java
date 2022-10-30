package inheritance;

public abstract class Vehicle {
    String color;
    protected int maxSpeed;

    public Vehicle(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }
    public void print() {
        System.out.println("Color of Vehicle is " + color + " and max speed is " + maxSpeed);
    }

    //abstract method is used when we don't know what the body of function would be.
    //When the output varies from one child class to other
    //Car class would have different output.
    //Bike class would have different output
    public abstract boolean isMotorized();
}

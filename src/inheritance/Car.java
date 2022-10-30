package inheritance;

//extends keyword is used to inherit properties from parent class
public class Car extends Vehicle{
    int numDoors;

    public Car(int maxSpeed, int numDoors){
        super(maxSpeed);
        this.numDoors = numDoors;
    }
    public void print(){
        super.print();
        System.out.println(color+ " " +maxSpeed+ " " +numDoors);
    }

    //Creating isMotorized method
    // that would answer the abstract method query of parent class Vehicle
    @Override
    public boolean isMotorized() {
        return true;
    }
}

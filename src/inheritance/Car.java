package inheritance;

//extends keyword is used to inherit properties from parent class
public class Car extends Vehicle{
    int numDoors;

    public void print(){
        System.out.println(color+ " " +maxSpeed+ " " +numDoors);
    }
}

package conditionalsAndLoops;
import java.util.Scanner;
import java.lang.*;
public class CheckCase {
    public static void main(String[] args) {
    Scanner c = new Scanner(System.in);
    char ch = c.next().trim().charAt(0);
    if(Character.isUpperCase(ch)){
    System.out.println("is UpperCase");
    }else{
        System.out.println("is lower case");
    }
    }
}

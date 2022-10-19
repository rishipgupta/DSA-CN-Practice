package conditionalsAndLoops;
//Find the nth fibonacci number;
import java.util.Scanner;
public class FindFibonacciNumber {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();
        int a = 1;
        int b = 1;
        int c = a+b;
        if(num == 0){
            System.out.println(0);;
        }
        if(num == 1){
            System.out.println(1);;
        }
        if(num == 2 ){
            System.out.println(1);
        }

        for(int i = 3;i<=num;i++){
            c = a+b;
            a = b;
            b =c;
        }
        System.out.println(c);
    }
}

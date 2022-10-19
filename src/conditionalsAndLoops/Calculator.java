package conditionalsAndLoops;
//program only ends if user enters x or X

import java.util.Scanner;

public class Calculator {
    public static void printAnswer() {
        Scanner s = new Scanner(System.in);
        int ans = 0;
        while (true) {
            System.out.print("Enter Operator: ");
            char op = s.next().trim().charAt(0);
            System.out.println();
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Enter Two Numbers ");
                int num1 = s.nextInt();
                int num2 = s.nextInt();
//                System.out.println();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = (num1 / num2);
                    }else{
                        System.out.println("Second number can not be zero. Enter numbers again");
                    }
                }

            } else if (op == 'x' || op == 'X') {
                System.out.println("-------Ending Program---------");
                break;
            } else {
                System.out.println("Invalid Operator");
            }
            System.out.println(ans);
        }
    }

    public static void main(String[] args) {
        printAnswer();
    }
}

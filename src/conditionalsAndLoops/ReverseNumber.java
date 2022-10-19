package conditionalsAndLoops;

import java.lang.Math;
//This works for numbers with no trailing zeroes
public class ReverseNumber {
    public static void reverseNum(int n) {
//        String num = Integer.toString(n);
        int newNum = 0;
        while(n>0) {
            newNum += (n % 10);
            if (n / 10 != 0) {
                newNum = newNum * 10;
            }
            n = n / 10;
        }
        System.out.println(newNum);
    }

    public static void main(String[] args) {
//        System.out.println(00001);
        reverseNum(1004);
    }
}

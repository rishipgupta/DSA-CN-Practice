package conditionalsAndLoops;
//Create separate functions check if number is armstrong
// Separate function to print all three digit numbers
public class PrintArmStrongNumbers {
    public static boolean isArmStrong(int n) {
        int a = n;
        int sum = 0;
        while (a > 0) {
            int rem = a % 10;
            a = a / 10;
            sum = sum + (rem * rem * rem);
        }
        return sum == n;
    }

    static void printThreeDigitArmStrongNum() {
        for (int i = 100; i < 1000; i++) {
            if (isArmStrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
//        System.out.println(isArmStrong(233));
        printThreeDigitArmStrongNum();
    }
}

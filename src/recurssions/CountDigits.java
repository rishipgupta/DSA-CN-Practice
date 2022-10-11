package recurssions;

public class CountDigits {
    public static int count(int n) {
        if (n <= 0) {
            return 0;
        }
        n = n / 10;
        return 1 + count(n);
    }

    public static void main(String[] args) {
        int count = count(1);
        System.out.println(count);
    }
}

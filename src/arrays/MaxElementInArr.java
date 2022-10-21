package arrays;

public class MaxElementInArr {
    public static int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println(max);
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18};
        max(arr);
    }
}

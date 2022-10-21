package arrays;

import java.util.Arrays;

public class ReverseArr {
    public static int[] reverse(int[] arr) {
        System.out.println(Arrays.toString(arr));
        int[] temp = new int[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0 && j < temp.length; i--, j++) {
            temp[j] = arr[i];
        }
        arr = temp;
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        reverse(arr);
    }
}

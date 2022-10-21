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

    public static int[] swap(int[] arr) {
        System.out.println(Arrays.toString(arr));
        for (int i = 0, j = arr.length - 1; i < arr.length / 2 && j >= arr.length / 2; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {11, 12, 13, 14, 15, 16, 17, 18};
//        reverse(arr);
        swap(arr);
    }
}

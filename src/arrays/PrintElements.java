package arrays;

import java.util.Arrays;

public class PrintElements {
    static void printArrElements(int[] arr) {
        //1st way - simple for loop

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //2nd way Enhanced for loop
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        //3rd Way Arrays.toString(arr)
        System.out.print(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        printArrElements(arr);
    }
}

package mergesort;

public class MergeSort {
    static int i = 0;

    //merge function combines the adjacent elements after sorting them in right order
    //It has three indexes: 1 for the left half, 2nd for right half, 3rd for the combined array of both
    public static int[] merge(int[] arr, int s, int m, int e) {
        int leftArrStartIndex = s; // start index of left half
        int rightArrStartIndex = m + 1; //start index of right half
        int tempArrStartIndex = 0; // start index of resultant array

        int[] temp = new int[e - s + 1];

        while (leftArrStartIndex <= m && rightArrStartIndex <= e) {
            if (arr[leftArrStartIndex] >= arr[rightArrStartIndex]) {
                temp[tempArrStartIndex] = arr[rightArrStartIndex];
//                System.out.println(temp[tempArrStartIndex]);
                rightArrStartIndex++;
                tempArrStartIndex++;
            } else {
                temp[tempArrStartIndex] = arr[leftArrStartIndex];
//                System.out.println(temp[tempArrStartIndex]);
                leftArrStartIndex++;
                tempArrStartIndex++;
            }
        }
        while (leftArrStartIndex <= m) {
            temp[tempArrStartIndex] = arr[leftArrStartIndex];
//            System.out.println(temp[tempArrStartIndex]);
            tempArrStartIndex++;
            leftArrStartIndex++;
        }
        while (rightArrStartIndex <= e) {
            temp[tempArrStartIndex] = arr[rightArrStartIndex];
//            System.out.println(temp[tempArrStartIndex]);
            tempArrStartIndex++;
            rightArrStartIndex++;
        }
        int x = 0;
        for (int l = s; l <= e; l++) {
            arr[l] = temp[x++];
        }
        return arr;
    }

    //mergeSort divides the array into halves till we reach single element
    public static void mergeSort(int[] arr, int s, int e) {
        if (s < e) {
            ++i;
//            int m = s + (e - s) / 2;
            int m = (e + s) / 2;
            mergeSort(arr, s, m);
            mergeSort(arr, m + 1, e);
            merge(arr, s, m, e);
        }
    }

    public static void main(String[] args) {
        int[] arr = {-78, -5, 9, 3};
        mergeSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

package arrays;

public class SwapElements {
    public static int[] swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }
    static void printArr(int[]arr){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int [] arr = {1,3,5,7,9};
        System.out.print("Before swapping elements ");
        printArr(arr);
        swap(arr,0,3);
        System.out.println();
        System.out.print("After Swapping elements  ");
        printArr(arr);
    }
}

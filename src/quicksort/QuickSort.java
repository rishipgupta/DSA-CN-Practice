package quicksort;

public class QuickSort {
    public static void quickSortArr(int [] arr,int s,int e){
        if(s<e){
            int p = partition(arr,s,e);
            quickSortArr(arr,s,p-1);
            quickSortArr(arr,p+1,e);
        }

    }
    public static int partition(int[] arr, int s, int e){
        int pivot = arr[e];
        int pIndex = s;
        for(int i =s; i<=e-1;i++){
            if(arr[i]<=pivot){
                int temp = arr[i];
                arr[i] = arr[pIndex];
                arr[pIndex] = temp;
                pIndex++;
            }
        }
        int temp2 = arr[e];
        arr[e] = arr[pIndex];
        arr[pIndex] = temp2;
        return pIndex;
    }
    public static void main(String[] args) {
        int [] input = {2,6,8,5,4,3};
        quickSortArr(input,0,input.length-1);
        for(int i =0; i<input.length; i++){
        System.out.print(input[i]+" ");
        }
    }
}

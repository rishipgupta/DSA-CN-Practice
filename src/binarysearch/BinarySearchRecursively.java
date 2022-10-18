package binarysearch;
//Remember the Array has to be sorted
public class BinarySearchRecursively {
    public static int binarySearch(int[] arr, int startIndex, int endIndex,int k){
        if(startIndex>endIndex){
            return -1;
        }
        int mid = (startIndex+endIndex)/2;
        if(arr[mid]==k){
            return mid;
        }
        if(arr[mid]<k){
//            startIndex = mid+1;
            return binarySearch(arr,mid+1,endIndex,k);
        }else{
            return binarySearch(arr,startIndex,mid-1,k);

        }
    }
    public static void main(String[] args) {
        int arr [] = {1,3,5,7,9,11};
        int k = 7;
        System.out.println(binarySearch(arr,0,arr.length-1,k));
    }
}

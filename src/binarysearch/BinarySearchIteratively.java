package binarysearch;

public class BinarySearchIteratively {
    public static int binarySearch(int[]arr,int k){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
        int mid = (start+end)/2;
            if(arr[mid]==k){
                return mid;
            }else if(arr[mid]<k){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr [] = {1,3,5,6,7, 8,11,9};
        System.out.println(binarySearch(arr,8));
    }
}

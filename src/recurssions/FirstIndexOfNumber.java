package recurssions;
/*
Given an array of length N and an integer x, you need to find and return the first index of integer x present in the array. Return -1 if it is not present in the array.
First index means, the index of first occurrence of x in the input array.
Do this recursively. Indexing in the array starts from 0.
 */
public class FirstIndexOfNumber {
    public static int findIndex(int input[],int x , int startIndex){
        int index = -1;
        if(startIndex==input.length){
            return -1;
        }
        if(input[startIndex]==x){
            return startIndex;
        }
        startIndex++;
        return findIndex(input,x, startIndex);
    }
    public static int firstIndex(int input[],int x){
        return findIndex(input,x,0);
    }
    public static void main(String[] args) {
        int arr[] = {9,3,10,9,8,1,0,8};
        int x = 38;
        System.out.println(firstIndex(arr,x));
    }
}

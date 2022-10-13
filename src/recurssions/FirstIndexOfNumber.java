package recurssions;

public class FirstIndexOfNumber {
    public static int findIndex(int input[],int x , int startIndex){
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

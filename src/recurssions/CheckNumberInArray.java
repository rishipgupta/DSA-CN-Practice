package recurssions;

public class CheckNumberInArray {

    //writing another function that will take the input array, x integer and start index
    //we would increase the start index till we reach the last index
    //check if input[startIndex] == x;
    //our exit condition would be if(startIndex == input.length;
    //we would use recursion with increasing index value by 1;
    public static boolean isNumberPresent(int input[],int x, int startIndex){
        if(startIndex == input.length){
            return false;
        }
        if(input[startIndex]==x){
            return true;
        }
        return isNumberPresent(input,x,startIndex+1);
    };
    public static void main(String[] args) {
        int arr [] = {1,2,4,6,5,7,8};
        System.out.println(isNumberPresent(arr,5,0));
    }
}

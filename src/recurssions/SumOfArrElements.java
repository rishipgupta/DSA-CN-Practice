package recurssions;

public class SumOfArrElements {
    public static int sum(int input[],int startIndex) {
        if(startIndex == input.length){
            return 0;
        }
        return input[startIndex]+sum(input,startIndex+1);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println(sum(arr,0));
    }
}

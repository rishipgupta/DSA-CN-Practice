package recurssions;

public class SumOfArrElements {
    public static int sum(int input[]) {
        if (input.length == 1) {
            return input[0];
        }
        int smallArr[] = new int[input.length - 1];
        //problem with this solution is that we are making too many copies of smallArr
        for (int i = 1; i < input.length; i++) {
            smallArr[i - 1] = input[i];
        }
        int result = input[0] + sum(smallArr);
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println(sum(arr));
    }
}

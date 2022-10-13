package recurssions;

/*
Given an array of length N and an integer x, you need to find and return the last index of integer x present in the array. Return -1 if it is not present in the array.
Last index means - if x is present multiple times in the array, return the index at which x comes last in the array.
You should start traversing your array from 0, not from (N - 1).
Do this recursively. Indexing in the array starts from 0.
 */
public class LastIndexOfNumber {
    public static int findLastIndex(int input[], int x, int startIndex, int index) {
        if (startIndex == input.length) {
            return index;
        }
        if (input[startIndex] == x) {
            index = startIndex;
        }

        return findLastIndex(input, x, startIndex + 1, index);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 2, 5};
        int x = 45;
        System.out.println(findLastIndex(arr, x, 0, -1));
    }
}

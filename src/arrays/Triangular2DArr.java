package arrays;

import java.util.Arrays;

public class Triangular2DArr {
    static void create2DArr() {

        int rows = 5;
        int cols = 5;
        int[][] arr2D = new int[rows][];
//        When we do not mention columns then each row is currently null
//        System.out.println(arr2D[0]); output is null
//        So we need to add value to each index
        for (int i = 0; i < rows; i++) {
            arr2D[i] = new int [i+1];
            for (int j = 0; j <=i; j++) {
                arr2D[i][j] = j;
                System.out.print(arr2D[i][j]);
            }
            System.out.println();
        }
//        return arr2D;
    }

    public static void main(String[] args) {
        create2DArr();
    }

}

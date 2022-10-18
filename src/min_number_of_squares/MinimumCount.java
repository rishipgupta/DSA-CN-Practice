package min_number_of_squares;

public class MinimumCount {
    public static boolean isSquare(int n){
        double isSqr = Math.sqrt(n);
        return isSqr == Math.floor(isSqr);
    }
    public static int minCount(int n){
        if(isSquare(n)){
            return 1;
        }
        int result = n;
        for(int i = 1; i*i<n;i++){
            result = Integer.min(result,1+minCount(n-i*i));
        }
        return result;
    }
    public static void main(String[] args) {
        int n = 9;
        System.out.println("The minimum number of squares is " + minCount(n));
    }
}

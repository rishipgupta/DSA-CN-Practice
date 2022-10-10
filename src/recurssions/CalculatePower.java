package recurssions;

public class CalculatePower {
    public static int calculatePower(int x,int n){
        if(n == 0){//proving for base condition
            return 1;
        }
        //Assuming our calculatePower running for induction hypothesis n-1 value
        int smallOutput = calculatePower(x,n-1);
        int result = x*smallOutput; //proving for last condition;
        return result;
    }
    public static void main(String[] args) {
        int result = calculatePower(2,5);
        System.out.println(result);
    }
}

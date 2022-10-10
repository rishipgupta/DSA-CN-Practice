package recurssions;
//Find sum of n natural numbers
//Apply PMI principals
public class SumOfNaturalNumbers {

    public static int sumOfNaturalNumbers (int n){
        //Base case prooved for n == 1
        if(n==1){
            return 1;
        }

        //Hypothetical middle value assumed to be true
        int assumedVal = sumOfNaturalNumbers(n-1);

        //proving for last case;
        int result = n + assumedVal;
        System.out.println("n "+n+"  ###assumedVal: "+assumedVal+ "  **result**: "+result);
        return result;
    }

    public static void main(String[] args) {
        sumOfNaturalNumbers(5);
    }
}

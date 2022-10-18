package basicjava;

public class IsPrime {
    public static void isPrime(int n){
        boolean isPrimeNum = true;
        if(n==2){
            isPrimeNum = true;
        }
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                isPrimeNum = false;
            }
        }
        if(isPrimeNum){
        System.out.println("Prime Number");
        }else{
            System.out.println("Not Prime");
        }
    }
    public static void main(String[] args) {
        isPrime(11);
    }
}

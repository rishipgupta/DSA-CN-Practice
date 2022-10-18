package basicjava;

public class isPrime {
    public static void isPrime(int n){
        boolean isPrimeNum = true;
        if(n==2){
            isPrimeNum = true;
        }
        for(int i=2;i<n/2;i++){
            if(n%i==0){
                isPrimeNum = false;
            }
        }
        System.out.println(isPrimeNum);
    }
    public static void main(String[] args) {
        isPrime(10);
    }
}

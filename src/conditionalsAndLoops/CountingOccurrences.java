package conditionalsAndLoops;
public class CountingOccurrences {

    public static void countOccurence(int n, int x){
        int originalNum = n;
        int count = 0;
        //For numbers greater than or equal to 10
        while(n/10 != 0){
        int num = n%10;
            n = (n-num)/10;
            if(num==x){
                count++;
            }
        }
        //For numbers less than 10
        if(n/10==0){
            if(n==x){
                count++;
            }
        }
        System.out.println(x + " occurs "+ count+ " times in " + originalNum );
    }

    public static void main(String[] args) {
        countOccurence(10,8);
    }
}

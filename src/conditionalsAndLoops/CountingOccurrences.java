package conditionalsAndLoops;
public class CountingOccurrences {

    public static void countOccurence(int n, int x){
        int originalNum = n;
        int count = 0;
        while(n%10 != 0){
        int num = n%10;
            n = (n-num)/10;
            if(num==x){
                count++;
            }
        }
        System.out.println(x + " occurs "+ count+ " times in " + originalNum );
    }

    public static void main(String[] args) {
        countOccurence(1385757879,7);
    }
}

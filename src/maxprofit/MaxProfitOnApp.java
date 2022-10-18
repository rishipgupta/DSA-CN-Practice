package maxprofit;

import java.util.Arrays;

public class MaxProfitOnApp {
    public static int maximumProfit(int budget[]) {

        Arrays.sort(budget);
        int cost[] = new int[budget.length];

        for (int i = 0; i < budget.length; i++) {
            cost[i] = budget[i] * (budget.length - i);
        }
        int max = Integer.MIN_VALUE;

        for (int i : cost) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {8, 1, 2, 7, 1, 5, 6, 1, 6, 6};
        System.out.print(
                maximumProfit(arr));
    }
}

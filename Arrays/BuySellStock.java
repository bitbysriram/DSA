import java.util.*;
public class BuySellStock {
    public static int  BuySellStock(int[] prices){
        int minprice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int price : prices){
            if(price < minprice){
                minprice = price;
            }
            int profit = price - minprice;
            if(profit > maxProfit){
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. elements in Array :");
        int n = sc.nextInt();

        int[] prices = new int[n];

        System.out.println("Enter elements in Array :");
        for(int i = 0;i < n;i++){
            prices[i] = sc.nextInt();
        }
        System.out.println("Maximum profit :"+BuySellStock(prices));

    }
}

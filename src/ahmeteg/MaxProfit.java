package ahmeteg;

import java.util.HashMap;

public class MaxProfit {

    public static void main(String[] args) {
        //System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
        //System.out.println(maxProfit(new int[]{7,6,4,3,1}));
        System.out.println(maxProfit(new int[]{2,4,1}));
    }
   static public int  maxProfit(int[] prices) {

        int today=Integer.MAX_VALUE;
        int pToday=0;
        int pAll=0;

        for(int i=0;i<prices.length;i++) {
        if(prices[i]<today)
            today=prices[i];

        pToday=prices[i]-today;
        if(pToday>pAll)
            pAll=pToday;

        }
        return pAll;
   }
}

package GreedyApproach;

class Solution {
    public int buyChoco(int[] prices, int money) {
        int s=Integer.MAX_VALUE;
        int ss=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<s) {
                s=prices[i];
                ss=s;
            }
            
        }
        int r=money-s-ss;
        return  r>0?r:money;

    }

}
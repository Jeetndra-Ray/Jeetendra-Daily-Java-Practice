package com.jitu.dailytarget.may22;

//1672. Richest Customer Wealth

public class MaximumWealth {
    public static int maximumWealth(int[][] accounts) {
        int ans=0;
        for (int [] i : accounts){
            int sum=0;
            for (int j: i){
                     sum+=j;
            }
            if (sum>ans){
                ans=sum;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int accounts[][] = {{1,2,3},{3,2,1}};
        System.out.println( maximumWealth(accounts));
    }
}

package com.jitu.dailytarget.may25.arrays;

public class Sever1HandelRequestBarclaysQuestion {
    public static int sever1HandelRequest(int []requests){
        int count=0;
        if (requests.length==0){
            return 0;
        }
        for (int i = 0;i<requests.length;i++){
            count=count+requests[i];
            i++;
        }
        return count;
    }

    public static void main(String[] args) {
        int []arr={2,-3,8,-6,-7,18,1};
        System.out.println(sever1HandelRequest(arr));
    }
}

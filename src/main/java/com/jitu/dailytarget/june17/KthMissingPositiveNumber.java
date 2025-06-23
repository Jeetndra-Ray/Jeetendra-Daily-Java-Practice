package com.jitu.dailytarget.june17;
//https://leetcode.com/problems/kth-missing-positive-number/description/

public class KthMissingPositiveNumber {
    public static int findKthPositive(int[] arr, int k) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] - (mid + 1) >= k) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start + k;
    }

    public static void main(String[] args) {
        int [] arry={1,2,3,4};
        System.out.println( findKthPositive(arry,2));
    }

    // array = {1,2,3,4} k = 2;  and= 6;
    // s= 0  e = arr.length-1=3;   mid s+e/2    if (arr[mid]-[mid+1]>=k){ end = mid -1;   } else s = mid +1;
    //
    // 0      3                      1            3 - 2=1 >= 2 false                      s = 1+1=2
    // 2      3            2+3/2=2                 3 -3=0 >= 2  false                        s=2+1;
    // 3      3            3+3/2 =3                 4-4>=0 2 false                         s = 3+1=4
    // 4      3      loop brake return = s + k = 4 +2  = 6

    // array = {2,3,4,7,11} k = 5;  and= 9;
    // s= 0  e = arr.length-1=4;   mid s+e/2    if (arr[mid]-[mid+1]>=k){ end = mid -1;   } else s = mid +1;
    //  0       4                0+4/2=2       4 - 3 =1>= 5= false                          s = 2+1 = 3
    // 3       4                 3+4/2=3         7 - 4 = 3>= 5==false                      s= 3+1;
    // 4      4                4+4/2 = 4            11-5= 6 >=5 true     e = 4-1
    // 4    3      loop brake  return s + k  4 + 5 = 9


}

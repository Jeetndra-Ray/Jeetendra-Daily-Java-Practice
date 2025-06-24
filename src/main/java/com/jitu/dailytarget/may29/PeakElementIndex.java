package com.jitu.dailytarget.may29;

public class PeakElementIndex {
    public static int findPeakElement(int[] nums) {
        int star=0;
        int end=nums.length-1;
        while (star<end){
            int mid = (star+end)/2;
            if (nums[mid]<nums[mid+1]){
                star=mid+1;
            }
            if(nums[mid]>nums[mid+1]){
                end=mid;
            }
        }

        return star;
    }

    public static void main(String[] args) {
        int []arr={1};

        System.out.println(findPeakElement(arr));

    }
    /// 1,2,1,3,5,6,4
    ///  Star= 0 =1, end= 6 = 4, mid= 0+6/2= 3=3;
    /// if( mid<mid+1;==3<5)---->true
    /// { star = mid+1;}
    /// star=4=5, end =6=4,mid =5+6/2=5
    /// if(mid<m+1;==6<4)----->false
    /// if (mid>mid+1;==6>4)----> true
    /// {end = mid+1}
    ///  Star= 4 =5, end= 4 = 5, mid= 4+4/2=4;
    /// if (mid<mid+1)----true
    ///{ star = mid+1;}
    /// start = 5=6; end =4=5;------loop Brake;  in this case we can
    /// return == Start(Which is 5)--->but will it work for every case

    /// 1,2,3,1
    ///  Star= 0 =1, end= 3 = 1, mid= 0+3/2=2;
    //






}

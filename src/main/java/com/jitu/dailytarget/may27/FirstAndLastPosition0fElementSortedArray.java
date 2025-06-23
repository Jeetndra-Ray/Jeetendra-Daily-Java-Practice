package com.jitu.dailytarget.may27;

public class FirstAndLastPosition0fElementSortedArray {
    public static int[] searchRange(int[] nums, int target) {
        int result[] = {-1, -1};
        int firstposition = 0;
        int indext = 0;
        int start = 0;
        int end = nums.length - 1;
        if (end == 1) {
            result = new int[]{0, 0};
        }
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] < target) {
                start = mid + 1;
            }
            if (nums[mid] > target) {
                end = mid - 1;
            }
            if (nums[mid] == target) {
                result[indext] = mid;
                firstposition = mid;
                indext++;
                break;
            }
        }

        while (start <= firstposition) {
            int mid = (start + firstposition) / 2;
            if (nums[mid] == target) {
                result[indext] = mid;
            }
            if (mid > target) {
                start = mid + 1;
            } else firstposition = mid - 1;
        }
        if (result[0] > result[1]) {
            int tem = result[0];
            result[0] = result[1];
            result[1] = tem;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1};
        int[] nums2 = searchRange(nums, 1);
        for (int i : nums2) {
            System.out.println(i);
        }
    }
}

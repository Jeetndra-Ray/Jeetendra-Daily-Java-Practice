package com.jitu.dailytarget.june13;

import java.util.Arrays;

public class FairCandySwap {
    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int star = 0;
        int end = aliceSizes.length;
        while (star <= end) {
            int mid = (star + end) / 2;
            if (aliceSizes[star] + bobSizes[star] == aliceSizes[aliceSizes.length-1] + bobSizes[bobSizes.length-1]) {
                return new int[]{aliceSizes[star], bobSizes[star]};
            }
            if (aliceSizes[star] + bobSizes[bobSizes.length-1] == aliceSizes[aliceSizes.length-1] + bobSizes[star]) {
                return new int[]{aliceSizes[star], bobSizes[star]};
            } else star = mid + 1;
        }
        return new int[]{0, 0};
    }

    public static void main(String[] args) {
        int[] aliceSizes = {2};
        int[] bobSizes = {1, 3};
        int [] ressul = fairCandySwap(aliceSizes,bobSizes);
        System.out.println(Arrays.toString(ressul));

        ///  1+3=4 and 2+2 =4


    }
    }

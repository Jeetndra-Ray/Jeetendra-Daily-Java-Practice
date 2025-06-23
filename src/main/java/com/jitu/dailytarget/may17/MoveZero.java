package com.jitu.dailytarget.may17;

// Move all zeros to the end of an array while maintaining the order of non-zero elements.

public class MoveZero {
    public static void main(String[] args) {
        int array[] = {0, 3, 0, 4, 5, 0, 0, 3, 4, 50};
        int index = array.length - 1;
//        for (int i=0;i<array.length;i++){
//            if (array[i] == 0){
//                array[index]=array[i];
//                index--;
//            }
//        }
        // Move non-zero elements forward
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                array[index++] = array[i];
            }
        }
        // Fill remaining positions with zero
        for (int i = index; i < array.length; i++) {
            array[i] = 0;
        }

        for (int i : array) {
            System.out.print(i + ",");
        }
    }
}

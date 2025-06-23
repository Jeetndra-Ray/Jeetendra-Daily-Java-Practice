package com.jitu.dailytarget.may24;

public class LengthOfLastWord {

    public static int lengthOfLastWord(String str) {
        int count = 0;
        String str1 = str.trim();
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != ' ') {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    public static int lengthOfLastWord1(String str) {
        str.trim();
        String s[]=str.split(" ");
        int count = s[s.length-1].length();
        return count;

    }

    public static void main(String[] args) {
        String str1 = "Hello World";
        System.out.println(lengthOfLastWord(str1));
        System.out.println(lengthOfLastWord1(str1));
//        int arr[]={2,3,56,7};
//        int num= arr[arr.length-1].length();
       }
}





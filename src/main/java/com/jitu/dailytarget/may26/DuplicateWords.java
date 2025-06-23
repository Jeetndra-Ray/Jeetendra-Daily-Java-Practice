package com.jitu.dailytarget.may26;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class DuplicateWords {
    public static String duplicateWordsUsingList(String s){
        String src1="";
        ArrayList<String> list = new ArrayList<>();
        String []scr =s.split(" ");
        for(int i = 0;i<scr.length;i++){
            if (!list.contains(scr[i])){
                list.add(scr[i]);
            }
        }
        for (String string : list){
            src1=src1 +" "+string;
        }

      return src1.trim();
    }

   /* public static void main(String[] args) {
*//*        String s = "Goodbye bye bye world world world";
        System.out.println(duplicateWords(s));
        String string = duplicateWords(s);
        System.out.println(string.length());*//*
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String []s = new String[num];
        for (int i=0;i<=num;i++){
           s[i]=scanner.nextLine();
        }
        for (String string : s) {
            System.out.println(duplicateWords(string));
        }
    }*/

    public static String duplicateWordsUsingHasSet(String s){
        String src1="";
       // ArrayList<String> hashSet = new ArrayList<>();
        HashSet<String> hashSet = new HashSet<>();
        String []scr =s.split(" ");
        for(int i = 0;i<scr.length;i++){
            hashSet.add(scr[i]);
        }
        for (String string : hashSet){
            src1=src1 + " " + string;
        }

        return src1.trim();
    }

    public static void main(String[] args) {
        /*String str = "Goodbye bye bye world world world";
        System.out.println(duplicateWordsUsingList(str));
        System.out.println(" Length using list " + duplicateWordsUsingList(str).length());
        String string = duplicateWordsUsingHasSet(str);
        System.out.println(" Length using HashSet " + string.length());*/
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        while (num>=0){
            String s = scanner.nextLine();
            System.out.println(duplicateWordsUsingHasSet(s));
            num--;
        }
        scanner.close();
    }
}

package com.jitu.dailytarget.may25;

public class FirstUniqueCharacterInString {
    public int firstUniqChar(String s) {
        for (int i = 0;i<s.length();i++){
            int count=0;
            for (int j =0;j<s.length();j++){
                if ( i!=j && s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
            if (count==0){
                return i;
            }
        }
        return -1;
    }
}

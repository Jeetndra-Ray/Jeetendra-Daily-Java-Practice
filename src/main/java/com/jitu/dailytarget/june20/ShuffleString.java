package com.jitu.dailytarget.june20;

public class ShuffleString {
    public String restoreString(String s, int[] indices) {
        String string ="";
        for (int i =0;i<s.length();i++){
          string=string+s.charAt(indices[i]);
        }
        return string;
    }
}

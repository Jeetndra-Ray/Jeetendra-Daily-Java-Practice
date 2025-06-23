package com.jitu.dailytarget.june20;
// https://leetcode.com/problems/shuffle-string/description/
public class ShuffleString {
    public String restoreString(String s, int[] indices) {
        String string ="";
        for (int i =0;i<s.length();i++){
          string=string+s.charAt(indices[i]);
        }
        return string;
    }
    public String restoreStringApproch2(String s, int[] indices) {
        int length=s.length();
        StringBuilder sb=new StringBuilder("");
        char c[]=new char[length];

        for(int i=0;i<length;i++){
            c[indices[i]]=s.charAt(i);
        }
        sb.append(c);
        return sb.toString();
    }
}

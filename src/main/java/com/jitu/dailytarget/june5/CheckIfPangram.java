package com.jitu.dailytarget.june5;

public class CheckIfPangram {
    public boolean checkIfPangram(String sentence) {
        if (sentence.length()<26){
            return false;
        }
        for (char c = 'a';c<='z';c++){
            if (!sentence.contains(String.valueOf(c))){
                return false;
            }
        }
        return true;
    }
}

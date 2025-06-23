package com.jitu.dailytarget.may12.examsystem;

import java.util.ArrayList;
import java.util.List;

public class ExamSystem {
    private   List<Question> questions = new ArrayList<>();

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    private String userName;
    private String passWord;


    public boolean login(String userName,String passWord){
        if (this.passWord==passWord||this.userName==userName)
            return true;
        else return false;
    }

    

}

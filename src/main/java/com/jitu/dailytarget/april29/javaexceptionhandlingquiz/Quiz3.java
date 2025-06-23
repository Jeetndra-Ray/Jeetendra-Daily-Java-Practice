package com.jitu.dailytarget.april29.javaexceptionhandlingquiz;

public class Quiz3 {
    public static void main(String[] args) {
        String[] scr = {"abc", "123", null, "xyz"};
        for (int i = 0; i < 6; i++)
        try
        {
            int a = scr[i].length() + Integer.parseInt(scr[i]);
            System.out.println(a);
        }
        catch (NumberFormatException e)
        {
            System.out.println(1);
        }
        catch (NullPointerException e)
        {
            System.out.println(2);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(3);
        }
    }
}

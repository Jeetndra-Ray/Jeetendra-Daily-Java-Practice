package com.jitu.dailytarget.april28;

public class Rethrowing {
    public static void main(String[] args) {
        try
        {
            String s = null;
            System.out.println(s.length());   //This statement throws NullPointerException
        }
        catch(NullPointerException ex)
        {
            System.out.println("NullPointerException is caught here");

            throw ex;     //Re-throwing NullPointerException
        }
        finally {
            System.out.println("This block is always executed");
        }
    }
}

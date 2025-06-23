package com.jitu.dailytarget.april28;

public class Combinations {
    public static void main(String[] args) {
        try
        {
            int i = 10/0;           //This statement throws ArithmeticException

            System.out.println("This statement will not be executed");
        }
        catch(Exception ex)
        {
            System.out.println("This block is executed immediately after an exception is thrown");
        }
        finally
        {
            System.out.println("This block is always executed");
        }
    }


}
class ExceptionHandling
{
    public static void main(String[] args)
    {
        System.out.println("You can keep any number of statements here");

        try
        {
            int i = 10/0;           //This statement throws ArithmeticException

            System.out.println("This statement will not be executed");
        }

        //You can't keep statements here

        catch(ArithmeticException ex)
        {
            System.out.println("This block is executed immediately after an exception is thrown");
        }

        //You can't keep statements here

        finally
        {
            System.out.println("This block is always executed");
        }

        System.out.println("You can keep any number of statements here");
    }
}

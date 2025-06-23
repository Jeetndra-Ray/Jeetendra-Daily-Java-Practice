package com.jitu.dailytarget.april29.javaexceptionhandlingquiz;

public class Quiz7 {
    public static void main(String[] args) {

        try {
            method();
            System.out.println("a");
        }catch (Exception e){
            System.out.println("b");
        }
        finally {
            System.out.println("c");
        }
        System.out.println("d");
    }
    public static void method(){
        throw new RuntimeException();
    }
}

/*
Recursion:

main(args) calls the main method itself. This is recursive behavior, where the method keeps calling itself over and over again.

However, this will not end because there's no base condition to stop the recursion, so it will eventually throw a StackOverflowError, which is an Error in Java.

Multiple catch blocks:

catch (NumberFormatException | NullPointerException e): This catch block handles either a NumberFormatException or NullPointerException. If either of these exceptions occurs, it prints 1.

catch (Exception | Error e): This block will catch any other exception or error (including the StackOverflowError caused by the recursion) and prints 2.

Step-by-step Execution:
Recursion starts:
The main method calls itself (main(args)), which means the program will keep executing the main method repeatedly.

Catching Exceptions:

On the first call to main, there’s no exception yet, but since the method calls itself indefinitely, eventually, you’ll run into a StackOverflowError. This happens because the program runs out of memory for keeping track of all the method calls.

Handling the Error:

Since StackOverflowError is an Error (not an exception), it will be caught by the second catch block: catch (Exception | Error e).

The message 2 will be printed when the error is caught.

Output:
When the StackOverflowError happens, the second catch block catches it, and 2 is printed.

Why Does It Print 2?
The first catch block is designed to catch NumberFormatException or NullPointerException. However, these exceptions don’t occur in this code — the recursion causes a StackOverflowError, which is caught by the second catch block.

The second catch block is more general (Exception | Error), so it catches any other exception or error, including the StackOverflowError.

Key Points to Remember:
Recursion without a base case leads to a StackOverflowError.

Multiple catch blocks can catch different types of exceptions. However, they have to be in the right order:

More specific exceptions (NumberFormatException and NullPointerException) should be caught first.

The more general Exception or Error catch should come after, to catch any unhandled cases.
*/

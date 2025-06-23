package com.jitu.dailytarget.april30.ounterintheconstructor;

//Create a class Circle with a static counter in the constructor to
// count how many objects are created. Print the count after creating 3 objects.

 public class Circle {
    static int count;

   public Circle(){
        count++;
    }

    public void cout(){
        System.out.println(count);
    }
}

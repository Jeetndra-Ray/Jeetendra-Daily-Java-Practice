package com.jitu.dailytarget.april27.abstraction;

public interface FunctionalInterfaceTest {

    void add();

    default void testDefaultMethod() {
        System.out.println("This is test default Interface method");
    }

    static void testStaticMethod(){
        System.out.println("This is test static Interface method");
    }
}

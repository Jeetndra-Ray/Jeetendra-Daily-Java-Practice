package com.jitu.dailytarget.april27.abstraction;

public class FunctionalInterfaceTestImpl implements FunctionalInterfaceTest {

    static {
        int num = 33;
    }

    @Override
    public void add() {
        System.out.println("I'm in Implementation class -- Add Method Impl");
    }

    public static void main(String[] args) {
        FunctionalInterfaceTest functionalInterfaceTest = new FunctionalInterfaceTestImpl();
        functionalInterfaceTest.add();
        functionalInterfaceTest.testDefaultMethod();
        FunctionalInterfaceTest.testStaticMethod();
    }
}

package com.jitu.dailytarget.april26.oops.encapsulation.encapsulation3;

public class UserTest {
    public static void main(String[] args) {
        User user = new User("Jitu","jit00909");
        user.getUsername();
        user.getPassword();
        user.displayInfo();

        User user1 = new User("Jitu","jit909");
        System.out.println( user1.getUsername());
        System.out.println( user1.getPassword());
        user1.displayInfo();
    }
}

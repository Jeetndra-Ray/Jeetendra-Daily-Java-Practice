package com.jitu.dailytarget.april29.accessmodifiers.person;

import com.jitu.dailytarget.april29.accessmodifiers.person.Person;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
       person.setAge(23);
       person.setName("Monu");
       person.getAge();
       person.getName();
        System.out.println(person.getAge());
        System.out.println(person.getName());
    }
}

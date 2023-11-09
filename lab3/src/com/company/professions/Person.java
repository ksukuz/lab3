package com.company.professions;

public class Person {
    private int age;

    protected String fullName;

    public Person(){

    }

    public Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }

    @Override
    public String toString() {
        return ("\nПолное имя - " + fullName + "\nВозраст - " + age);
    }
}

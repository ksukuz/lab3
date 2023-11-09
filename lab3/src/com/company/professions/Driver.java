package com.company.professions;

public class Driver extends Person{
    protected int experience;

    public Driver(){

    }

    public Driver(String fullName, int age, int experience){
        super(fullName, age);
        this.experience = experience;
    }

    public String toString(){
        return (super.toString() + "\nСтаж вождения - " + experience);
    }
}

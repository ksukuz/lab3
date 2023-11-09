package com.company.vehicles;

public class Lorry extends Car{
    protected int carrying;

    public Lorry(){

    }

    public Lorry(String marka, String carClass, double weight, int power, String company, String fullName, int age, int experience, int carrying){
        super(marka, carClass, weight, power, company, fullName, age, experience);
        this.carrying = carrying;
    }

    @Override
    public String toString() {
        return (super.toString() + "\nГрузоподъемность - " + carrying + "кг");
    }
}

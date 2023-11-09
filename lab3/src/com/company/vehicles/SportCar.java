package com.company.vehicles;

public class SportCar extends Car{
    protected double speed;

    public SportCar(){

    }

    public SportCar(String marka, String carClass, double weight, int power, String company, String fullName, int age, int experience, double speed){
        super(marka, carClass, weight, power, company, fullName, age, experience);
        this.speed = speed;

    }

    @Override
    public String toString() {
        return super.toString() + "\nПредельная скорость - " +speed + "км/ч";
    }
}

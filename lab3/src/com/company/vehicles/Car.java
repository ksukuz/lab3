package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    protected String marka;
    protected String carClass;

    protected double weight;
    protected Driver driver;
    protected Engine engine;

    public Car(){

    }

    public Car(String marka, String carClass, double weight, int power, String company, String fullName, int age, int experience){
        engine = new Engine(power, company);
        driver = new Driver(fullName, age, experience);
        this.marka = marka;
        this.carClass = carClass;
        this.weight = weight;

    }

    public void start(){
        System.out.println("Поехали");
    }

    public void stop(){
        System.out.println("Останавливаемся");
    }

    public void turnRight(){
        System.out.println("Поворот направо");
    }

    public void turnLeft(){
        System.out.println("Поворот налево");
    }

    @Override
    public String toString() {
        return ("Модель автомобиля - " + marka + "\nКласс автомобиля - " + carClass + "\nВес автомобиля - " + weight + "т" + "\nВодитель автомобиля: " +  driver.toString() + "\nДвигатель:" + engine.toString());
    }
}

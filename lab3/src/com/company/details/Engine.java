package com.company.details;

public class Engine {
    protected int power;
    protected String company;

    public Engine(){

    }

    public Engine(int power, String company){
        this.power = power;
        this.company = company;
    }

    @Override
    public String toString() {
        return ("\nМощность - " + power + "л.с." + "\nПроизводитель - " + company);
    }
}

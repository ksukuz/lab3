package task3;

public abstract class Fruit {

    public Fruit(double weight){
        this.weight=weight;
    }

    public Fruit(){

    }
    double weight;

    public void printManufacturerInfo(){
        System.out.print("Made in RB");
    }

    public abstract double coast();
}

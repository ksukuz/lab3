package task3;

public class Apple extends Fruit{

    public Apple(){

    }
    public Apple(double weight){
        super(weight);
    }
    @Override
    public double coast() {
        return weight*5;
    }
}

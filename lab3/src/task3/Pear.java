package task3;

public class Pear extends Fruit{

    public Pear(){

    }

    public Pear(double weight){
        super(weight);
    }
    @Override
    public double coast() {
        return weight*10;
    }
}

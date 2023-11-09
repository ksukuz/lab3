package task3;

public class Plum extends Fruit{

    public Plum(){

    }

    public Plum(double weight){
        super(weight);
    }
    @Override
    public double coast() {
        return weight*15;
    }
}

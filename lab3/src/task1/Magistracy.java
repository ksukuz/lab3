package task1;

public class Magistracy extends Student{

    private String scientificWork;

    public Magistracy(String firstName, String lastName, int group, double averageMark, String scientificWork){
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }

    public Magistracy(){

    }

    @Override
    public int getScholarship() {
        if(getAverageMark() >=8){
            return 200;
        }
        return 180;
    }
}

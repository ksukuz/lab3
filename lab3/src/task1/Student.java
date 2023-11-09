package task1;

public class Student {
    private String firstName;
    private String lastName;
    private int group;
    private double averageMark;

    public Student(String firstName, String lastName, int group, double averageMark){
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public Student(){

    }

    public int getScholarship(){
        if(averageMark >= 8){
            return 100;
        }
        return 80;
    }

    public double getAverageMark() {
        return averageMark;
    }
}

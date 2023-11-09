package task4;

public class Magazine implements Printable{

    String magazineName;
    public Magazine(String magazineName){
        this.magazineName = magazineName;
    }
    @Override
    public void print() {

        System.out.println("Название журнала - \"" + magazineName + "\"");

    }

    public static void printMagazines(Printable[] printable){
        for (Printable mas : printable){
            if(mas instanceof Magazine)
                mas.print();
        }
    }
}

package task4;

public class Book implements Printable{

    String bookName;

    public Book(String bookName){
        this.bookName = bookName;
    }


    @Override
    public void print() {
        System.out.println("Название книги - \"" + bookName + "\"");
    }

    public static void printBook(Printable[] printable){
        for (Printable mas : printable){
            if(mas instanceof Book)
                mas.print();
        }
    }
}

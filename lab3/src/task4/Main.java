package task4;

import java.sql.SQLOutput;

/*
Определите интерфейс Printable, содержащий метод void print().
Определить класс Book, реализующий интерфейс Printable. Определите класс
Magazine, реализующий интерфейс Printable. Создайте массив типа Printable,
который будет содержать книги и журналы. В цикле необходимо пройти по
массиву и вызвать метод print() для каждого объекта. Создайте статический
метод printMagazines(Printable[] printable) в классе Magazine, который будет
выводить на консоль названия только журналов. Создайте статический метод
printBooks(Printable[] printable) в классе Book, который будет выводить на
консоль названия только книг. Используйте оператор instanceof.
 */

public class Main {

    public static void main(String[] args) {

        Printable[] printables = new Printable[4];
        printables[0] = new Book("Буря столетия");
        printables[1] = new Book("Цветы для Элджернона");
        printables[2] = new Magazine("Стрекоза");
        printables[3] = new Magazine("Все звезды");

        for (Printable mas : printables){
            mas.print();
        }

        System.out.println(" ");

        Magazine.printMagazines(printables);

        System.out.println(" ");

        Book.printBook(printables);
    }
}

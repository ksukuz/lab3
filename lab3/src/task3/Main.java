package task3;

/*
Создайте абстрактный класс Фрукт и классы Яблоко, Груша, Слива
расширяющие его. Класс Фрукт должен содержать: поле вес, завершенный метод
printManufacturerInfo(){System.out.print("Made in RB");}, абстрактный метод,
возвращающий стоимость фрукта, который должен быть переопределен в
каждом классе наследнике. Метод должен учитывать вес фрукта. Создайте
несколько объектов разных классов. Подсчитайте общую стоимость проданных
фруктов. А также общую стоимость отдельно проданных яблок, груш и слив.
 */

public class Main {

    public static void main(String[] args) {
        Fruit apple = new Apple(0.500);
        Fruit plum = new Plum(2.000);
        Fruit pear = new Pear(3.500);


        System.out.println("Общая стоимость яблок = " + apple.coast());
        System.out.println("Общая стоимость слив = " + plum.coast());
        System.out.println("Общая стоимость груш = " + pear.coast());

        System.out.println("Общая стоимость проданных фруктов = " + (apple.coast()+plum.coast()+pear.coast()));

    }
}

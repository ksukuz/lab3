package task1;

/*
Создайте пример наследования, реализуйте класс Student и класс
Magistracy, магистрант отличается от студента наличием некой научной работы.
Класс Student должен содержать поля: String firstName, lastName, group. А
также, double averageMark, содержащее среднюю оценку. Создайте переменную
типа Student, которая ссылается на объект типа Magistracy. Создайте метод
getScholarship() для класса Student, который возвращает сумму стипендии. Если
средняя оценка студента равна 8, то сумма 100 руб., иначе 80 руб.
Переопределите этот метод в классе Magistracy. Если средняя оценка аспиранта
равна 8, то сумма 200 руб., иначе 180 руб. Создайте массив типа Student,
содержащий объекты класса Student и Magistracy. Вызовите метод
getScholarship() для каждого элемента массива.
 */

public class Main {

    public static void main(String[] args) {
        Student student1 = new Magistracy("Pavel","Kulbit", 161101, 6.5, "Infocommunications");
        Student student2 = new Student("Sonia","Lapina", 163101, 9.0);
        Student student3 = new Magistracy("Maria", "Kondratyk", 063001, 10.0, "Web-technologies");
        Student student4 = new Student("Ksenia", "Kuzmitskaya", 163101, 9.0);

        Student[] students = new Student[4];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        students[3] = student4;

        for (Student mas : students) {
            System.out.println("Sum of scholarship = " + mas.getScholarship());
        }
    }
}

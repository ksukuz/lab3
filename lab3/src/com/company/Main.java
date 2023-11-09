package com.company;

import com.company.vehicles.Car;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;

/*
Создайте класс Car в пакете com.company.vehicles, Engine в пакете
com.company.details и Driver в пакете com.company.professions. Класс Driver
должен содержать поля – ФИО, стаж вождения. Класс Engine должен содержать
поля – мощность, производитель. Класс Car должен содержать поля – марка
автомобиля, класс автомобиля, вес, водитель типа Driver, мотор типа Engine.
Методы start(), stop(), turnRight(), turnLeft(), которые выводят на печать:
"Поехали", "Останавливаемся", "Поворот направо" или "Поворот налево". А
также метод toString(), который выводит полную информацию об автомобиле, ее
водителе и моторе. Создайте производный от Car класс – Lorry (грузовой
автомобиль), характеризуемый также грузоподъемностью кузова. Создайте
производный от Car класс – SportCar, характеризуемый также предельной
скоростью. Класс Driver должен расширять класс Person.
 */

public class Main {
    public static void main(String[] args) {
        Car car1 = new Lorry("BMW", "D", 3, 530, "BMW AG", "Ксения Кузьмицкая", 19, 1, 500);
        Car car2 = new SportCar("BMW", "D", 3, 326, "BMW AG", "Ксения Кузьмицкая", 19, 1, 450.5);

        System.out.println(car1);
        System.out.println(" ");
        System.out.println(car2);

    }
}

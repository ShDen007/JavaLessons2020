package com.company.lesson13.HomeEx2;

import java.util.Scanner;

//* Задание 2
// * Создайте класс «Город» (City).
// Необходимо хранить в полях класса: название города (name), название региона (region), название
// * страны (country), количество жителей в городе (inhabitants), почтовый индекс
// * города (index), телефонный код города (code). Реализуйте методы клас-
// * са для ввода данных, вывода данных, реализуйте конструктор с параметром и по умолчанию.
public class City {

    public static String name = "Dobrotvir";
    public static String region = "Lviv";
    public static String country = "Ukraine";
    static double area = 2.87;
    private int inhabitants;
    private int index;
    private int code;

    public City(String name, String region, String country, double area) {
    }

    public City(int inhabitants, int index, int code) {
        this.inhabitants = inhabitants;
        this.index = index;
        this.code = code;
    }

    public int getInhabitants() {
        return inhabitants;
    }

    public void setInhabitants(int inhabitants) {
        this.inhabitants = inhabitants;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public static double getArea() {
        return area;
    }

    public static void setArea(double area) {
        City.area = area;
    }

    public static void main(String[] args) {
        City city = new City(name, region, country, area);
        Scanner scan = new Scanner(System.in);

        System.out.println("Введіть телефонний код міста");
        city.setCode(scan.nextInt());
        // System.out.println(city.getCode());

        System.out.println("Введіть індекс міста");
        city.setIndex(scan.nextInt());
        //  System.out.println(city.getIndex());

        city.setInhabitants(6399);

        System.out.println("Назва міста - " + name);
        System.out.println("Регіон - " + region);
        System.out.println("Країна - " + country);
        System.out.println("Площа міста - " + area + "(кв. км)");
        System.out.println("Телефонний код міста:  " + city.getCode());
        System.out.println("Індекс міста:  " + city.getIndex());
        System.out.println("Кількість жителів: " + city.getInhabitants() + " (чол) ");
    }
}







package com.company.lesson13.HomeEx1;

import java.util.Scanner;

//* Задание 1
// * Создайте класс «Человек» (Human). Необходимо хранить
// * в полях класса: ФИО (fullName), дату рождения (String dateOfBirth),
//   контактный телефон (phone), город (city), страну (country), домашний адрес (address).
// * Реализуйте методы класса для ввода данных, вывода данных, реализуйте
// * доступ к отдельным полям через методы класса, конструктор с параметрами
// * и по умолчанию
public class Human {
    public static String fullName = "John John Johnsonn ";
    public static String dateOfBirth = "12.12.2012";
    public static String address = "Lvivska street";
    private int phone;
    private String city;
    private String country;


    public Human() {
    }
    public Human(int phone, String city, String country) {
        this.phone = phone;
        this.city = city;
        this.country = country;
    }

    public int getPhone() {
        return phone;
    }
    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}

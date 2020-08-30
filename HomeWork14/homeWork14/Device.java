package com.company.Lesson14.homeWork14;
//Задание 1
//        Создать базовый класс «Устройство» и производные
//        классы «Чайник», «Микроволновка», «Автомобиль»,
//        «Пароход». С помощью конструктора установить имя
//        каждого устройства и его характеристики.
//        Реализуйте для каждого из классов методы:
//        * Sound — издает звук устройства (пишем текстом в
//        консоль);
//        * Show — отображает название устройства;
//        * Desc — отображает описание устройства.

public class Device<getName> {
    private String Name;
    private String color;
    private String SerialNum;
    private double power;
    private String fieldUse;
    //конструктор за замовчуванням
    Device() {
    }
    //конструктор Device
    public Device(String name, String color, String serialNum, int power, String fieldUse) {
        Name = name;
        this.color = color;
        SerialNum = serialNum;
        this.power = power;
        this.fieldUse = fieldUse;
    }
    //Геттери і Сеттери
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSerialNum() {
        return SerialNum;
    }

    public void setSerialNum(String serialNum) {
        SerialNum = serialNum;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public String getFieldUse() {
        return fieldUse;
    }

    public void setFieldUse(String fieldUse) {
        this.fieldUse = fieldUse;
    }

    public void sound() {             //метод який виводить звук
    }

    public void show(){               //метод який виводить назву пристрою
    }

    public void desk(){                //метод який відображає інформацію про пристрій

    }





}

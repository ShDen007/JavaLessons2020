package com.company.Lesson14.homeWork14;

public class Teapot extends Device{

    //конструктор за замовчуванням.
    public Teapot() {
    }

    //конструктор Teapot.
    public Teapot(String name, String color, String serialNum, int power, String fieldUse) {
        super(name, color, serialNum, power, fieldUse);
    }

    //метод який виводить звук чайника в тект.
    @Override
    public void sound() {
        super.sound();
        System.out.println("the sound of teapot");
    }

    //метод який виводить назву пристрою.
    @Override
    public void show() {
        super.show();
        setName("Siemens");
        System.out.println(getName());
    }

    //метод який виводить інформацію про пристрій
    @Override
    public void desk() {
        super.desk();
        setColor("White");
        setSerialNum("SDJDKGK2424");
        setPower(2.0);
        setFieldUse("To heat water");
        System.out.println(getColor());
        System.out.println("SN: " + getSerialNum());
        System.out.println(getPower() + "(kWatt)");
        System.out.println(getFieldUse());
    }
}

package com.company.Lesson14.homeWork14;

public class Ship extends Device {

    //конструктор за замовчуванням.
    public Ship() {
    }

    //конструктор Ship.
    public Ship(String name, String color, String serialNum, int power, String fieldUse) {
        super(name, color, serialNum, power, fieldUse);
    }

    //метод який виводить звук корабля в тект.
    @Override
    public void sound() {
        super.sound();
        System.out.println("the sound of a ship");


    }

    //метод який виводить назву пристрою.
    @Override
    public void show() {
        super.show();
        setName("Titanic");
        System.out.println(getName());
    }

    //метод який виводить інформацію про пристрій.
    @Override
    public void desk() {
        super.desk();
        setColor("White");
        setSerialNum("TN31031909");
        setPower(55000);
        setFieldUse("Sea voyages");
        System.out.println(getColor());
        System.out.println("SN: " + getSerialNum());
        System.out.println(getPower() + "h.p.");
        System.out.println(getFieldUse());




    }

}
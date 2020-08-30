package com.company.Lesson14.homeWork14;

public class Car extends Device {

    //конструктор за замовчуванням.
    public Car() {
    }

    //конструктор Car.
    public Car(String name, String color, String serialNum, int power, String fieldUse) {
        super(name, color, serialNum, power, fieldUse);
    }


    //метод який виводить звук авто в тект.
    @Override
    public void sound() {
        super.sound();
        System.out.println("car sound");
    }

    //метод який виводить назву пристрою.
    @Override
    public void show() {
        super.show();
        setName("Audi");
        System.out.println(getName());
    }

    //метод який виводить інформацію про пристрій
    @Override
    public void desk() {
        super.desk();
        setColor("Black");
        setSerialNum("324FDFG24324");
        setPower(110);
        setFieldUse("For ride");
        System.out.println(getColor());
        System.out.println("SN: " + getSerialNum());
        System.out.println(getPower() + "(hp)");
        System.out.println(getFieldUse());

    }
}

//        car.setName("Audi");
//        car.setColor("Black");
//        car.setSerialNum("SJFDF773572FDF");
//        car.setPower(110);
//        car.setFieldUse("drive");


//        System.out.println("this a car");
//        System.out.println(car.getName());
//        System.out.println(car.getColor());
//        System.out.println("SN: " + car.getSerialNum());
//        System.out.println(car.getPower() + "(л.с)");
//        System.out.println("For " + car.getFieldUse());
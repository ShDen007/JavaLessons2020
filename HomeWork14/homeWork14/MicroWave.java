package com.company.Lesson14.homeWork14;

public class MicroWave extends Device {

    //конструктор за замовчуванням.
    public MicroWave() {
    }

    //конструктор Microwave
    public MicroWave(String name, String color, String serialNum, int power, String fieldUse) {
        super(name, color, serialNum, power, fieldUse);
    }

    //метод який виводить звук microwave в тект.
    @Override
    public void sound() {
        super.sound();
        System.out.println("microwave sound");;
    }

    //метод який виводить назву пристрою.
    @Override
    public void show() {
        super.show();
        setName("Bosch");
        System.out.println(getName());
    }

    //метод який виводить інформацію про пристрій
    @Override
    public void desk() {
        super.desk();
        setColor("Metalic");
        setSerialNum("DTF2674723742734HHD");
        setPower(1.45);
        setFieldUse("For cooking");
        System.out.println(getColor());
        System.out.println("SN: " + getSerialNum());
        System.out.println(getPower() + "(kWatt)");
        System.out.println(getFieldUse());

    }


}

package com.company.Lesson14.homeWork141;
//Задание 2
//        Создать класс Man (человек), с полями: имя, возраст, пол и вес.
//        Определить методы задания имени, возраста и веса.
//        Создать производный класс Student, имеющий поле года обучения.
//        Определить методы задания и увеличения(изменения) года обучения.
//        У обоих классов должны быть конструкторы по умолчанию и с параметрами.
//        В классе Man создайте метод show, который будет выводить на консоль информацию о человеке.
//        В классе Student метод show нужно переопределить таким образом, чтоб выводилась информация про год обучения.
public class Man {
    private String name;        //ім'я
    private int age;            //вік
    private char gender;        //стать
    private double weight;      //вага

    //конструктор по замовчуванню
    public Man(){
    }

    //конструктор з параметрами
    public Man(String name, int age, char gender, double weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }

    //Геттери і Сеттери для
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    //метод виведення інформації про людину
    public void show(){

        setName("John");
        setAge(30);
        setGender('M');
        setWeight(75.5);
        System.out.println("Ім'я  -  " + getName());
        System.out.println("вік  -  " + getAge());
        System.out.println("стать  -  " + getGender());
        System.out.println("вага  -  " + getWeight());
        System.out.println(  );
    }








}

package com.company.Lesson14.homeWork141;
import java.util.Calendar;
import java.util.Date;

public class Student extends Man {

    private  int year;           //Поточний рік
    private int yearStart;        //Рік початку навчання
    private int yearOfStudy;       //Рік навчання

    //конструктор по замовчуванню.
    Student(){
    }
    //конструктор з параметрами.

    public Student(String name, int age, char gender, double weight, int year, int yearStart, int yearOfStudy) {
        super(name, age, gender, weight);
        this.year = year;
        this.yearStart = yearStart;
        this.yearOfStudy = yearOfStudy;
    }

    //Геттери і Сеттери

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYearStart() {
        return yearStart;
    }

    public void setYearStart(int yearStart) {
        this.yearStart = yearStart;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

        //перевизначення методу для відображення інформації про рік навчання студента
        @Override
        public void show() {
           setYear(2020);
           setYearStart(2018);
           setYearOfStudy(getYear()-getYearStart());
           System.out.println("Рік навчання  -  " + getYearOfStudy());


         }
}

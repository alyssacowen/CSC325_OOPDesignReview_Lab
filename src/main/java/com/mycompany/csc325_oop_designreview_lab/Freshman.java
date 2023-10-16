package com.mycompany.csc325_oop_designreview_lab;

public class Freshman extends Student{
    public Freshman(){
        super(" ",0,0);}

    protected int credits;

    //Freshman constructor
    public Freshman(String name, int age, int credits) {
        this.name = name;
        this.age = age;
        this.credits = credits;
    }
    //Freshman toString
    @Override
    public String toString() {
        return ("Student Name: " + this.getName() + "Student Age: " + this.getAge() + "Address: " + this.getAddress() + "Student GPA: " + this.getGPA() + "Amount of Credits: " + this.getCredits() );
    }
    }



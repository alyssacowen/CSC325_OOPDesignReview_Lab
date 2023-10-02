package com.mycompany.csc325_oop_designreview_lab;

public abstract class Freshman extends Student{
    protected int credits;

    //freshman constructor
    public Freshman(String name, short age, int credits) {
        this.name = name;
        this.age = age;
        this.credits = credits;
    }
    //freshman toString
    @Override
    public String toString() {
        return super.toString() + ", Credits: " + credits;
    }
}

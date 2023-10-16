package com.mycompany.csc325_oop_designreview_lab;

public class Senior extends Student {
    private int credits;

    public Senior(String name, int age, int credits) {
        super(name, age, credits);
        // Check if credits are at least 85, and if not will write "not enough credits".
        if (credits < 85)
            System.out.println("Not enough credits, must have 85");

    }

    @Override
    public String toString() {
        return ("Student Name: " + this.getName() + "Student Age: " + this.getAge() + "Address: " + this.getAddress() + "Student GPA: " + this.getGPA() + "Amount of Credits: " + this.getCredits() );
    }
}


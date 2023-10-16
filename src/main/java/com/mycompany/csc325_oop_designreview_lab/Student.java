/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */


//
// extended person and implemented human to make this class a child of person and human
public class Student extends Human {
    private double GPA; //field for gpa
private int credits;
//constructors
Student(){
    super(" ", 0);
    this.credits = 0;
}
    public Student(String name, int age)
    {
        super(name,age);
    }
    /**
     * paramerterized constructor
     */
    public Student(String name, int age, int credits)
    {
        super(name,age);
        this.credits = credits;

    }
    //setter and getter for GPA
	public void setGPA(){
        this.GPA = GPA;
    }

    /**
     *override of getAddress method
     */
    @Override
    public String getAddress()
    {
        return this.address;
    }

    /**
     *override of setAdress method
     */
    @Override
    public void setAddress(String Address)
    {
        this.address = address;
    }

    // ToDo 3: Add a field for GPA and create setter and getter

    /**
     *get gpa method
     */
    public double getGPA()
    {
        return GPA;
    }

    /**
     *set gpa method
     */
    public void setGPA(double GPA)
    {
        this.GPA = GPA;
    }
    // ToDo 4: Add comments to your code

    /**
     *set credits method
     */
    public void setCredits(int credits)
    {
        this.credits = credits;
    }

    /**
     * get credits method
     */
    public int getCredits()
    {
        return credits;
    }


    @Override
    public String toString()
    {
        return ("Name: " + this.getName() + " Age: " + this.getAge()+ " Address: " + this.getAddress() + this.getGPA());
    }

}

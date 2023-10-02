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
public abstract class Student extends Person implements Human {
    private double gpa; //field for gpa


    //setter and getter for GPA
	public void setGPA(){
        this.gpa = gpa;
    }
    public double getGPA(double gpa){
        return gpa;
    }
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", GPA: " + gpa;
    }

}

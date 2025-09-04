package com.cpp.cs5800q4;

import java.util.ArrayList;

public class Course2 {
    private String courseName;
    private ArrayList<Instructor> instructors;
    private ArrayList<Textbook> textbooks;

    public Course2(String courseName) {
        this.courseName = courseName;
        this.instructors = new ArrayList<>();
        this.textbooks = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public ArrayList<Instructor> getInstructors() {
        return instructors;
    }

    public void setInstructors(ArrayList<Instructor> instructors) {
        this.instructors = instructors;
    }

    public ArrayList<Textbook> getTextbooks() {
        return textbooks;
    }

    public void setTextbooks(ArrayList<Textbook> textbooks) {
        this.textbooks = textbooks;
    }

    public void addInstructor(Instructor instructor) {
        this.instructors.add(instructor);
    }

    public void addTextbook(Textbook textbook) {
        this.textbooks.add(textbook);
    }

    public void print() {
        System.out.println("Course Name: " + courseName);

        System.out.println("  Instructors: ");
        for(Instructor instructor: instructors) {
            System.out.println("\t| " + "Instructor First name: " + instructor.getFirstName());
            System.out.println("\t| " + "Instructor Last name: " + instructor.getLastName());
            System.out.println("\t| " + "Office Number: " + instructor.getOfficeNumber());
            System.out.println();
        }

        System.out.println("  Textbooks: ");
        for(Textbook textbook: textbooks) {
            System.out.println("\t| " + "Textbook Title: " + textbook.getTitle());
            System.out.println("\t| " + "Textbook Author: " + textbook.getAuthor());
            System.out.println("\t| " + "Textbook Publisher: " + textbook.getPublisher());
            System.out.println("");
        }

    }


}

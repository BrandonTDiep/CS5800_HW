package com.cpp.cs5800q4;

public class CS5800_Q4 {
    public static void main(String[] args) {
        Instructor instructor0 = new Instructor("Nima", "Davarpanah", "3-2636");
        Textbook textbook0 = new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall");
        Course course = new Course("Advanced Software Engineering", instructor0, textbook0);
        course.print();
        System.out.println();

        // allow multiple textbooks and instructors
        Course2 course2 = new Course2("Advanced Software Engineering");

        Instructor instructor = new Instructor("Nima", "Davarpanah", "3-2636");
        Textbook textbook = new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall");

        course2.addInstructor(instructor);
        course2.addTextbook(textbook);

        Instructor instructor1 = new Instructor("Yu", "Sun", "9-2470");
        Textbook textbook1 = new Textbook("Prompt Engineering", "Bob Burger", "Scholastic Books");

        course2.addInstructor(instructor1);
        course2.addTextbook(textbook1);
        course2.print();
    }

}

package com.cpp.cs5800q1;

public abstract class Employee {

    private String firstName;
    private String lastName;
    private String SSN;


    public Employee(String firstName, String lastName, String sSN2)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = sSN2;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    @Override
    public String toString() {
        return  "| " + "First Name: " + firstName + " | " + "Last Name: "+ lastName + " | " + "SSN: " + SSN + " ";
    }

}

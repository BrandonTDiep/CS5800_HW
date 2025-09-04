package com.cpp.cs5800q1;

public class SalariedEmployee extends Employee {

    private int weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String SSN, int weeklySalary) {
        super(firstName, lastName, SSN);
        this.weeklySalary = weeklySalary;
    }

    public int getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(int weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override
    public String toString() {
        return super.toString() + "| " + "Weekly Salary: $" + String.format("%,d", weeklySalary);
    }

}


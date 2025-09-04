package com.cpp.cs5800q1;

public class HourlyEmployee extends Employee {

    private int wage;
    private int hoursWorked;

    public HourlyEmployee(String firstName, String lastName, String SSN, int wage, int hoursWorked) {
        super(firstName, lastName, SSN);
        this.wage = wage;
        this.hoursWorked = hoursWorked;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String toString() {
        return super.toString() + "| " + "Wage: $" + wage + " | " + "Hours Worked: " + hoursWorked;
    }

}

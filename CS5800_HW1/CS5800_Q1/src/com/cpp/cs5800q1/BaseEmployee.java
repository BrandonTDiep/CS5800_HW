package com.cpp.cs5800q1;

public class BaseEmployee extends Employee {

    private int baseSalary;

    public BaseEmployee(String firstName, String lastName, String SSN, int baseSalary) {
        super(firstName, lastName, SSN);
        this.baseSalary = baseSalary;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return super.toString() + "| " + "Base Salary: $" + String.format("%,d", baseSalary);
    }

}


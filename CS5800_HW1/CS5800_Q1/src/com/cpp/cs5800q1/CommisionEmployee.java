package com.cpp.cs5800q1;

public class CommisionEmployee extends Employee {

    private int commissionRate;
    private int grossSalary;

    public CommisionEmployee(String firstName, String lastName, String SSN, int commissionRate, int grossSalary) {
        super(firstName, lastName, SSN);
        this.commissionRate = commissionRate;
        this.grossSalary = grossSalary;
    }

    public int getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(int commissionRate) {
        this.commissionRate = commissionRate;
    }

    public int getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(int grossSalary) {
        this.grossSalary = grossSalary;
    }

    @Override
    public String toString() {
        return super.toString() + "| " + "Commision Rate: " + commissionRate + "%" + " | " + "Gross Salary: $" + String.format("%,d", grossSalary);
    }

}


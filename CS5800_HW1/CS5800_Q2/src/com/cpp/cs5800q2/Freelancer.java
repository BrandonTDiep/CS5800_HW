package com.cpp.cs5800q2;

public class Freelancer implements Payable {

    public String firstName;
    public String lastName;
    public double hourlyRate;
    public double hoursWorked;

    public Freelancer(String firstName, String lastName, double hourlyRate, double hoursWorked) {
        this.firstName = firstName;
        this.lastName = lastName;
        setHourlyRate(hourlyRate);
        setHoursWorked(hoursWorked);
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

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate < 0) {
            throw new IllegalArgumentException("Error: Hourly rate can't be negative!");
        }
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        if (hoursWorked < 0) {
            throw new IllegalArgumentException("Error: Hours worked can't be negative!");
        }
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePayment() {
        if (hoursWorked <= 40) {
            return hourlyRate * hoursWorked;
        }
        else {
            return (40 * hourlyRate) + ((hoursWorked - 40) * hourlyRate * 1.5);
        }
    }

    @Override
    public String getPayeeName() {
        return firstName + " " + lastName;
    }

    public void print() {
        System.out.printf("Freelancer: %s | Calculated Payment for this period: $%.2f%n", getPayeeName(), calculatePayment());
    }

}

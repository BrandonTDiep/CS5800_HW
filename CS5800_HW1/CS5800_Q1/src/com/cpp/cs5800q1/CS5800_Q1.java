package com.cpp.cs5800q1;


public class CS5800_Q1 {

    public static void main(String[] args) {

        SalariedEmployee employeeJonas = new SalariedEmployee("Joe", "Jonas", "111-11-1111", 2500);

        HourlyEmployee employeeSmith = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25, 32);

        HourlyEmployee employeeQuinn = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19, 47);

        CommisionEmployee employeeDior = new CommisionEmployee("Nicole", "Dior", "444-44-4444", 15, 50000);

        SalariedEmployee employeeChanel = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700);

        BaseEmployee employeeDavenport = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000);

        CommisionEmployee employeeVaziri = new CommisionEmployee("Mahnaz", "Vaziri", "777-77-7777", 22, 40000);

        Employee[] employees = {employeeJonas, employeeSmith, employeeQuinn, employeeDior, employeeChanel, employeeDavenport, employeeVaziri};

        for (Employee emp : employees) {
            System.out.println(emp);
        }


    }

}

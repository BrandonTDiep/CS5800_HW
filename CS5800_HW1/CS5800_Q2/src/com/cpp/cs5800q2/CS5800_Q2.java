package com.cpp.cs5800q2;

import java.util.ArrayList;

public class CS5800_Q2 {

    public static void main(String[] args) {
        ArrayList<Payable> payables = new ArrayList<>();

        payables.add(new Freelancer("Joe", "Jonas", 23.0, 40.0));
        payables.add(new Freelancer("Nick", "Jonas", 25.0, 46.3));

        payables.add(new VendorInvoice("Jonas Brothers Corporation", "INV-12345", 50000.00));
        payables.add(new VendorInvoice("Cartoon Network", "INV-54321", 999.99));

        double totalPayout = 0;

        for (Payable p : payables) {
            if (p instanceof Freelancer) {
                ((Freelancer) p).print();
            }
            else {
                ((VendorInvoice) p).print();
            }
            totalPayout += p.calculatePayment();
        }

        System.out.printf("%nTotal payout for this period: $%.2f%n", totalPayout);


    }

}


package com.cpp.cs5800q2;

public class VendorInvoice implements Payable {

    private String vendorName;
    private String invoiceNumber;
    private double amountDue;

    public VendorInvoice(String vendorName, String invoiceNumber, double amountDue) {
        this.vendorName = vendorName;
        this.invoiceNumber = invoiceNumber;
        setAmountDue(amountDue);
    }


    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName)
    {
        this.vendorName = vendorName;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber)
    {
        this.invoiceNumber = invoiceNumber;
    }

    public double getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(double amountDue) {
        if (amountDue < 0) {
            throw new IllegalArgumentException("Error: Amount Due can't be negative!");
        }
        this.amountDue = amountDue;
    }

    @Override
    public double calculatePayment() {
        return amountDue;
    }

    @Override
    public String getPayeeName() {
        return getVendorName();
    }

    public void print() {
        System.out.printf("Vendor: %s | Invoice #: %s | Payment: $%.2f%n", getPayeeName(), invoiceNumber, calculatePayment());
    }

}

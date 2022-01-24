package org.itstep.task02;


import org.itstep.task01.Employee;



public class EmployeeAndTax extends Employee {
    private double tax;

    public EmployeeAndTax(String fullName, String paymentType, double payment) {
        super(fullName, paymentType, payment);

    }

    public EmployeeAndTax(String fullName, double tax, String paymentType, double payment) {
        super(fullName, paymentType, payment);
        this.tax = tax;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public void setPaymentType(String paymentType) {

        if (paymentType.equals("почасовая")) {
            tax = 20;
        } else {
            tax = 15;
        }

    }



    public double getPaymentWithTax() {
        double PaymentWithTax = getPayment() - (getPayment() * (tax / 100));
 //       double sum = PaymentWithTax;????
        return PaymentWithTax;
    }

    @Override
    public String toString() {
        setPaymentType(getPaymentType());
        return String.format("%-8s | %-9s | %-10s  | %.1f ", getFullName(), getTax(), getPayment(), getPaymentWithTax());
    }


}

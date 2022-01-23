package org.itstep.task02;

import org.itstep.PaymentTypes;
import org.itstep.task01.Employee;

import java.net.PortUnreachableException;
import java.security.PublicKey;
import java.util.Scanner;

public class EmployeeAndTax extends Employee {
    private double tax;

    public EmployeeAndTax(String fullName, String paymentType, double payment) {
        super(fullName, paymentType, payment);
        //       this.tax = tax;

    }

    public EmployeeAndTax(String fullName, double tax, String paymentType, double payment) {
        super(fullName, paymentType, payment);
        this.tax = tax;
    }

    public double getTax() {
        return tax;
    }

    public void setPaymentType(String paymentType) {
//        Scanner sc = new Scanner(System.in);
//        String pt = sc.nextLine();
//        System.out.println("Введите тип оплаты: ");
        if (paymentType.equals("почасовая")) {
            tax = 20;
        } else {
            tax = 15;
        }
        paymentType = paymentType;
    }

    public double getPaymentWithTax() {
        double PaymentWithTax = getPayment() - (getPayment() * (tax / 100));
        double sum = PaymentWithTax * 3;
        return PaymentWithTax;
    }



    @Override
    public String toString() {
        setPaymentType(getPaymentType());
        return String.format("%-8s | %-9s | %-10s  | %.1f ", getFullName(), getTax(), getPayment(), getPaymentWithTax());
    }


}

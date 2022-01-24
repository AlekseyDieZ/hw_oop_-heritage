package org.itstep.task03;

import org.itstep.task02.EmployeeAndTax;

public class EmployeeAndChild extends EmployeeAndTax {
    boolean hasChild;

    public EmployeeAndChild(String fullName, String paymentType, double payment, boolean hasChild) {
        super(fullName, paymentType, payment);
        this.hasChild = hasChild;
    }

    public EmployeeAndChild(String fullName, String paymentType, double payment) {
        super(fullName, paymentType, payment);
    }

//    public EmployeeAndChild(String fullName, double tax, String paymentType, double payment) {
//        super(fullName, tax, paymentType, payment);
//    }

    public boolean isHasChild() {
        return hasChild;
    }

    public void setHasChild(boolean hasChild) {
        this.hasChild = hasChild;
    }

    public void setPaymentType(String paymentType) {

        if (paymentType.equals("почасовая")) {
            setTax(20);
        } else {
            setTax(15);
        }

        if (!hasChild) {
            double tax = getTax() + 5;
            setTax(tax);
        } else {
            getTax();
        }
    }


    @Override
    public String toString() {
        setPaymentType(getPaymentType());
        return String.format("%-8s | %-9s | %-10s  | %.1f ", getFullName(), getTax(), getPayment(), getPaymentWithTax());
    }
}
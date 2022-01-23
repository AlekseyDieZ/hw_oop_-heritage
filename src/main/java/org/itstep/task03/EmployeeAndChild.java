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
}

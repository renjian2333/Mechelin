package com.tongji.michelin.factory.support.payroll;

import com.tongji.michelin.person.staff.Staff;

/**
 * @classname WagePayroll
 * @description Pay out normal wages for all staffs
 */
public class WagePayroll extends Payroll {

    public WagePayroll() {
        super();
    }

    @Override
    public void payOff() {
        for (Staff staff : staffList) {
            staff.getPaid();
        }
    }
}

package com.amikhailov.oop.shop.staff;

import com.amikhailov.oop.shop.SalesRoom;
import com.amikhailov.oop.shop.interfaces.DepartmentInterface;
import com.amikhailov.oop.shop.interfaces.EmployeeInterface;

public class Administrator {

    private SalesRoom salesRoom;

    public Administrator(SalesRoom salesRoom) {
        this.salesRoom = salesRoom;
    }

    public Consultant getFreeConsultant(DepartmentInterface departmentInterface){
        for (EmployeeInterface employee : departmentInterface.getEmployeeList()){
            if (employee instanceof Consultant){
                if (employee.isFree()){
                    return (Consultant)employee;
                }
            }
        }

        return null;
    }

}

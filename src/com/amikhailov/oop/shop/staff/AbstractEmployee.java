package com.amikhailov.oop.shop.staff;

import com.amikhailov.oop.shop.interfaces.DepartmentInterface;
import com.amikhailov.oop.shop.interfaces.EmployeeInterface;

public abstract class AbstractEmployee implements EmployeeInterface {

    public AbstractEmployee(String name) {
        this.name = name;
    }

    public AbstractEmployee() {
    }

    private String name;
    private DepartmentInterface department;
    private boolean free;

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public DepartmentInterface getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentInterface department) {
        this.department = department;
    }

    @Override
    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }
}

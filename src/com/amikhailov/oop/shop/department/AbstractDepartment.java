package com.amikhailov.oop.shop.department;

import com.amikhailov.oop.shop.interfaces.DepartmentInterface;
import com.amikhailov.oop.shop.interfaces.EmployeeInterface;
import com.amikhailov.oop.shop.interfaces.GoodsInterface;

import java.util.ArrayList;

public abstract class AbstractDepartment implements DepartmentInterface {

    public AbstractDepartment(String name) {
        this.name = name;
    }

    public AbstractDepartment() {
    }

    private String name;
    private ArrayList<EmployeeInterface> employeeList;
    private ArrayList<GoodsInterface> goodsList;



    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public ArrayList<EmployeeInterface> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<EmployeeInterface> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public ArrayList<GoodsInterface> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(ArrayList<GoodsInterface> goodsList) {
        this.goodsList = goodsList;
    }

    public void addEmployee(EmployeeInterface employee){
        employee.setDepartment(this);
        try {
            employeeList.add(employee);
        }catch (NullPointerException e){
            System.out.println("Empty element");
        }

    }

    public void addGoods(GoodsInterface goods){
        goods.setDepartment(this);
        try {
            goodsList.add(goods);
        }catch (NullPointerException e){
            System.out.println("Empty element");

        }
    }
}

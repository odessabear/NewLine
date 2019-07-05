package com.amikhailov.oop.shop;

import com.amikhailov.oop.shop.client.BaseVisitor;
import com.amikhailov.oop.shop.department.BaseDepartment;
import com.amikhailov.oop.shop.service.Administrator;

import java.util.ArrayList;

public class SalesRoom {

    private String name;
    private ArrayList<BaseDepartment> departmentList;
    private ArrayList<BaseVisitor> visitorList;
    private Administrator administrator;

}

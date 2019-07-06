package com.amikhailov.oop.shop;


import com.amikhailov.oop.shop.interfaces.DepartmentInterface;
import com.amikhailov.oop.shop.interfaces.VisitorInterface;
import com.amikhailov.oop.shop.service.Administrator;

import java.util.ArrayList;

public class SalesRoom {

    private ArrayList<DepartmentInterface> departmentList;// в каждом департаменте имеются свои сотрудники

    private String name;

    private ArrayList<VisitorInterface> visitorList;

    private Administrator administrator;

}

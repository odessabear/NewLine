package com.amikhailov.oop.shop.department;

import com.amikhailov.oop.shop.goods.BaseGoods;
import com.amikhailov.oop.shop.service.BaseEmployee;

import java.util.ArrayList;

public class BaseDepartment {

    private String name;
    private ArrayList<BaseEmployee> emploeeList;
    private ArrayList<BaseGoods> goodsList;
}

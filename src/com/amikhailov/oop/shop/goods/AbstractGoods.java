package com.amikhailov.oop.shop.goods;

import com.amikhailov.oop.shop.department.AbstractDepartment;
import com.amikhailov.oop.shop.interfaces.GoodsInterface;

public abstract class AbstractGoods implements GoodsInterface {
    // свойства, которые будут иметь все товары
public static final int DEFAULT_GUARANTEE = 2;

    public AbstractGoods() {
    }

    public AbstractGoods(String name) {
        this.name = name;
    }



    private double price;

    private boolean hasGuarantee;

    private String name;

    private AbstractDepartment department;

    private String company;

    public AbstractGoods(double price, boolean hasGuarantee, String name, String company) {
        this.price = price;
        this.hasGuarantee = hasGuarantee;
        this.name = name;
        this.company = company;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean hasGuarantee() {
        return hasGuarantee;
    }

    public void setHasGuarantee(boolean hasGuarantee) {
        this.hasGuarantee = hasGuarantee;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public AbstractDepartment getDepartment() {
        return department;
    }

    public void setDepartment(AbstractDepartment department) {
        this.department = department;
    }

    @Override
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}

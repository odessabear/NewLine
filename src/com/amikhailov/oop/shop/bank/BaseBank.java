package com.amikhailov.oop.shop.bank;

import com.amikhailov.oop.shop.interfaces.BankInterface;

public class BaseBank implements BankInterface {

    private String name;
    private String creditDescription;


    @Override
    public void checkInfo() {

    }

    @Override
    public void giveCredit() {

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getCreditDescription() {
        return creditDescription;
    }
}
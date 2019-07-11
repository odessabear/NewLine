package com.amikhailov.oop.shop.bank;

import com.amikhailov.oop.shop.interfaces.BankInterface;

public abstract class AbstractBank implements BankInterface {

    private String name;
    private String creditDescription;

    public AbstractBank(String name, String creditDescription) {
        this.name = name;
        this.creditDescription = creditDescription;
    }

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
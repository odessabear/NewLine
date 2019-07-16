package com.amikhailov.oop.shop.bank;

public class MonoBank extends AbstractBank {

    public MonoBank(String name, String creditDescription) {
        super(name, creditDescription);
    }

    @Override
    public void checkInfo() {
        super.checkInfo();
    }

    public void checkInfo(boolean critical){}

    @Override
    public void giveCredit() {
        // доработанная реализация
    }
}

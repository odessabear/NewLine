package com.amikhailov.oop.shop.bank;

public class PrivatBank extends AbstractBank {

    public PrivatBank(String name, String creditDescription) {
        super(name, creditDescription);
    }

    @Override
    public void checkInfo() {
        // доработанная реализация
    }

    @Override
    public void giveCredit() {
        // доработанная реализация
    }
}

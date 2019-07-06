package com.amikhailov.oop.shop.client;

import com.amikhailov.oop.shop.interfaces.VisitorInterface;

public class BaseVisitor implements VisitorInterface {

    private String name;

    @Override
    public void buy(){

    }

    @Override
    public void returnGoods(){

    }

    @Override
    public String getName() {
        return name;
    }


}

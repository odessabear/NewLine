package com.amikhailov.oop.shop.goods;

import com.amikhailov.oop.shop.interfaces.ElectronicDeviceInterface;

public class ElectronicDevice extends AbstractGoods implements ElectronicDeviceInterface {

    public ElectronicDevice(){

    }

    public ElectronicDevice(String name){
        super(name);
    }

    @Override
    public void on() {
        // общая реализация
    }

    @Override
    public void off() {
        // общая реализация
    }
}
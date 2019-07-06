package com.amikhailov.oop.shop.goods;

import com.amikhailov.oop.shop.interfaces.ElectronicDeviceInterface;

public class ElectronicDevice extends BaseGoods implements ElectronicDeviceInterface {

    @Override
    public void on() {
        // общая реализация
    }

    @Override
    public void off() {
        // общая реализация
    }
}
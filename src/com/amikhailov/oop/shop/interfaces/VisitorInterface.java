package com.amikhailov.oop.shop.interfaces;

public interface VisitorInterface {

    void buy(GoodsInterface goods);

    void returnGoods(GoodsInterface goods);

    String getName();
}

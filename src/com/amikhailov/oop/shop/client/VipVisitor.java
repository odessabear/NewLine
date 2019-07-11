package com.amikhailov.oop.shop.client;

import com.amikhailov.oop.shop.interfaces.GoodsInterface;

public class VipVisitor extends AbstractVisitor {
    private float discount;

    private boolean checkDiscount() {
        return discount > 0;
    }

    public void buy(GoodsInterface goods) {
        if (!checkDiscount()){
            super.buy(goods);
        }else {
            // discount buy))
        }
    }
}

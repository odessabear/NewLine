package com.amikhailov.oop.shop.client;

import com.amikhailov.oop.shop.interfaces.GoodsInterface;

public class VipVisitor extends AbstractVisitor {
    private float discount;

    public VipVisitor(float discount){
        this.discount = discount;
    }

    public VipVisitor(String name, float discount) {
        super(name);
        this.discount = discount;
    }

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

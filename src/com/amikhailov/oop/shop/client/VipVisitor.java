package com.amikhailov.oop.shop.client;

public class VipVisitor extends BaseVisitor {
    private float discount;

    private boolean checkDiscount() {
        return discount > 0;
    }

    public void buy() {
        if (!checkDiscount()){
            super.buy();
        }else {
            // discount buy))
        }
    }
}

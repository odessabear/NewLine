package com.amikhailov.oop.shop.staff;

import com.amikhailov.oop.shop.enums.ConsultResult;
import com.amikhailov.oop.shop.interfaces.VisitorInterface;

public class Consultant extends AbstractEmployee {

    public Consultant() {
    }

    public Consultant(String name) {
        super(name);
    }

    public ConsultResult consult(VisitorInterface visitor) {
        super.setFree(false);
        return ConsultResult.BUY;
    }


    public void send() {

    }
}

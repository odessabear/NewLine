package com.amikhailov.start;

import com.amikhailov.oop.shop.client.CommonVisitor;
import com.amikhailov.oop.shop.goods.Computer;
import com.amikhailov.oop.shop.goods.Subwoofer;
import com.amikhailov.oop.shop.goods.Televisor;

public class Main {

    public static void main(String[] args) {
        Televisor televisor = new Televisor("Sumsung");

        Subwoofer subwoofer = new Subwoofer("Microlab");

        Computer computer1 = new Computer("MacBook");
        Computer computer2 = new Computer("Asus");

        CommonVisitor visitor = new CommonVisitor();

        visitor.buy(televisor);
        visitor.buy(subwoofer);
        visitor.buy(computer1);
        visitor.buy(computer2);
    }
}

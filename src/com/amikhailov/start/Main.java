package com.amikhailov.start;

import com.amikhailov.oop.shop.client.CommonVisitor;
import com.amikhailov.oop.shop.goods.Computer;
import com.amikhailov.oop.shop.goods.Subwoofer;
import com.amikhailov.oop.shop.goods.Televisor;
import com.amikhailov.oop.shop.interfaces.GoodsInterface;

public class Main {

    public static void main(String[] args) {
        Televisor televisor = new Televisor("Sumsung");

        Subwoofer subwoofer = new Subwoofer("Microlab");

        Computer computer1 = new Computer("MacBook");
        Computer computer2 = new Computer("Asus");


        GoodsInterface goodsInterface = new Televisor("Samsung");

        ((Televisor)goodsInterface).selectChannel(2);

        CommonVisitor visitor = new CommonVisitor();

        visitor.buy(televisor);
        visitor.buy(subwoofer);
        visitor.buy(computer1);
        visitor.buy(computer2);

        televisor.selectChannel(3);
        televisor.selectChannel("NBC");
    }
}

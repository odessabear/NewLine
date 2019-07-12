package com.amikhailov.oop.shop.goods;

public class Televisor extends ElectronicDevice {

 //   private String model;

    public Televisor(String name){
        super(name);
    }

    public void selectChannel(int channelNumber) {
        System.out.println("You selected channel number " + channelNumber);
    }

    public void selectChannel(String channelName){
        System.out.println("You selected " + channelName + " channel");
    }
}

package com.amikhailov.javabegin.start;

import com.amikhailov.javabegin.objects.Car;
import com.amikhailov.javabegin.objects.Door;
import com.amikhailov.javabegin.objects.Phone;

public class Main {

    public static void main(String[] args) {

        Car car = new Car();
        car.setName("toyota");

        System.out.println("car name is " + car.getName());

        Door door = new Door();

        door.setHeight(100);

        System.out.println("Door's height is " + door.getHeight() + " sm");


        Phone phone1 = new Phone(1024,"Samsung","GSM");

        System.out.println(phone1.getType());

    }
}

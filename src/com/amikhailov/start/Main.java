package com.amikhailov.start;

import com.amikhailov.oop.shop.SalesRoom;
import com.amikhailov.oop.shop.client.CommonVisitor;
import com.amikhailov.oop.shop.client.VipVisitor;
import com.amikhailov.oop.shop.department.ElectronicDepartment;
import com.amikhailov.oop.shop.department.GameDepartment;
import com.amikhailov.oop.shop.enums.ConsultResult;
import com.amikhailov.oop.shop.goods.Computer;
import com.amikhailov.oop.shop.goods.GameConsole;
import com.amikhailov.oop.shop.goods.Subwoofer;
import com.amikhailov.oop.shop.goods.Televisor;
import com.amikhailov.oop.shop.interfaces.GoodsInterface;
import com.amikhailov.oop.shop.staff.Administrator;
import com.amikhailov.oop.shop.staff.Consultant;

public class Main {

    public static void main(String[] args) {
        imitateShopWorking();
    }

    private static void imitateShopWorking() {

        SalesRoom salesRoom = new SalesRoom();// создаем торговый зал

        // создаем администратора всего торгового зала
        Administrator administrator = new Administrator(salesRoom);

        // создаем два департамента (отдела)
        ElectronicDepartment electronicDepartment = new ElectronicDepartment();
        GameDepartment gameDepartment = new GameDepartment();

        // добавляем департаменты в торговый зал
        salesRoom.addDepartment(electronicDepartment);
        salesRoom.addDepartment(gameDepartment);

        // добавляем сотрудников в каждый отдел
        Consultant consultant1 = new Consultant("Джон");
        consultant1.setFree(true);

        Consultant consultant2 = new Consultant("Анна");

        electronicDepartment.addEmployee(consultant1);
        electronicDepartment.addEmployee(consultant2);

        // создаем товары для отделов
        Computer computer = new Computer(200, true, "Zenbook", "Asus", 2048);
        Televisor televisor = new Televisor(1000, false, "SmartTV", "Samsung");
        GameConsole xbox = new GameConsole("XBOX", 1024);

        // добавляем товары в отделы
        electronicDepartment.addGoods(televisor);
        electronicDepartment.addGoods(computer);
        gameDepartment.addGoods(xbox);

        // создаем покупателей
        CommonVisitor visitor1 = new CommonVisitor("Джон");
        VipVisitor vipVisitor1 = new VipVisitor("Джон", 50);



        // ищем свободного консультанта из нужного отдела
        ConsultResult consultResult = administrator.getFreeConsultant(electronicDepartment).consult(visitor1);

        switch (consultResult) {
            case BUY:
                visitor1.buy(televisor);
                break;
            case EXIT:
                break;
        }


    }

}

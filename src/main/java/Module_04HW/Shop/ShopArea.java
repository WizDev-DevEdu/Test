package Module_04HW.Shop;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class ShopArea {
    public static void main(String[] args) {
//      Создание объектов
        InternalShopStaff seller1 = new InternalShopStaff("Bob", "Smith", 25, 20, 200, "seller", 1, "mobile");
        InternalShopStaff seller2 = new InternalShopStaff("Rob", "Smot", 26, 20, 300, "seller", 1, "TV");
        InternalShopStaff seller3 = new InternalShopStaff("Tod", "Smither", 27, 20, 400, "seller", 1, "PC");
        InternalShopStaff manager = new InternalShopStaff("Tim", "Robertson", 30, 21, 400, "manager", 1, "manage");
        InternalShopStaff cashier1 = new InternalShopStaff("Ron", "Piterson", 20, 15, 100, "cashier", 1, "cashier");
        InternalShopStaff security = new InternalShopStaff("Rick", "Miller", 42, 4, 250, "security", 1, "securit");
        Shop shop1 = new Shop("Dnipro", 10000, 123, "shop");
        Storage storage1 = new Storage("Dnipro", 15000, 500, "storage");
        Customer klient1 = new Customer();
        Goods pc = new Goods("PC", 2);
        ExternalShopStaff accounter = new ExternalShopStaff("Rita", "Hgdgh", 36, 21, 500, "accounter");
        Office director = new Office("director",1,"management");

//        Покупатель появился в магазине. Взаимодействие с менеджером
        klient1.askQuation();
        manager.chooseDepartment();
        Scanner in = new Scanner(System.in);
        String enterDepartment = in.nextLine();
        manager.chooseSeller(enterDepartment);

//        Передача покупателя продавцу. Взаимодействие с продавцем.
        String enterGoodsType = in.nextLine();
        pc.goodsType(enterGoodsType);

//        Попытка продажи товара, передача покупателя кассиру.
        String enterAnswer = in.nextLine();
        seller3.goToCashier(enterAnswer);
        if (enterAnswer.equals("yes")){
            String enterAnswer2 = in.nextLine();
        }else{
            String enterAnswer2 = in.nextLine();
            seller3.differentChoise(enterAnswer2);
            String enterAnswer3 = in.nextLine();
            seller3.chooseSeller(enterAnswer3);
            String enterGoodsType2 = in.nextLine();
            pc.goodsType(enterGoodsType2);
            String enterAnswer4 = in.nextLine();
            seller3.goToCashier(enterAnswer4);
        }

//        Взаимодействие кассира и покупателя
        cashier1.askCustomerAboutNumber();
        int enterNumberOfGoods = Integer.parseInt(in.nextLine());
        cashier1.askCustomerAboutGoods();
        String cuftomerChoose = in.nextLine();
        cashier1.conversation1();
        System.out.println(cashier1.priceOfGoods(enterNumberOfGoods, cuftomerChoose));
        cashier1.conversation2();

//        Взаимодействие покупателя и охраны
        security.checkTheCeckRequest();
        String securityConversation = in.nextLine();
        security.checkTheCeck(securityConversation);

//         Взаимодействие менеджера с персоналом офиса. Cоздала метод getInfo() для работы через интерфейс
        director.askAllInfo();
        seller1.getInfo();
        seller2.getInfo();
        seller3.getInfo();
        manager.getInfo();
        cashier1.getInfo();
        security.getInfo();
        shop1.getInfo();
        storage1.getInfo();

    }
}


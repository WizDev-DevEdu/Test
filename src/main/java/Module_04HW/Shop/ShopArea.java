package Module_04HW.Shop;

import java.util.Scanner;

public class ShopArea {
    public static void main(String[] args) {
//      создала метод getInfo() для работы через интерфейс
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
        seller1.getInfo();
        seller2.getInfo();
        seller3.getInfo();
        manager.getInfo();
        cashier1.getInfo();
        security.getInfo();
        shop1.getInfo();
        storage1.getInfo();
        klient1.askQuation();
        manager.chooseDepartment();
        Scanner in = new Scanner(System.in);
        String enterDepartment = in.nextLine();
        manager.chooseSeller(enterDepartment);
        String enterGoodsType = in.nextLine();
        pc.goodsType(enterGoodsType);
        String enterAnswer = in.nextLine();
        seller3.goToCashier(enterAnswer);
        String enterAnswer2 = in.nextLine();
        seller3.differentChoise(enterAnswer2);
        String enterAnswer3 = in.nextLine();
        seller3.chooseSeller(enterAnswer3);
        String enterGoodsType2 = in.nextLine();
        pc.goodsType(enterGoodsType2);
        String enterAnswer4 = in.nextLine();
        seller3.goToCashier(enterAnswer4);
        cashier1.askCustomerAboutNumber();
        int enterNumberOfGoods = Integer.parseInt(in.nextLine());
        cashier1.askCustomerAboutGoods();
        String cuftomerChoose = in.nextLine();
        cashier1.priceOfGoods(enterNumberOfGoods,cuftomerChoose);

//        System.out.println(phone.priceOfGoods(enter));
    }
}


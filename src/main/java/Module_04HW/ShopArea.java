package Module_04HW;

public class ShopArea {
    public static void main(String[] args) {
//      создала метод getInfo() для работы через интерфейс
        InternalShopStaff seller1 = new InternalShopStaff("Bob","Smith", 25, 20,200, "seller",1, "mobile");
        InternalShopStaff seller2 = new InternalShopStaff("Rob","Smot", 26, 20,300, "seller",1, "TV");
        InternalShopStaff seller3 = new InternalShopStaff("Tod","Smither", 27, 20,400, "seller",1, "PC");
        InternalShopStaff manager = new InternalShopStaff("Tim","Robertson", 30,21,400,"manager", 1,"manage");
        InternalShopStaff cashier1 = new InternalShopStaff("Ron","Piterson", 20,15,100,"cashier",1,"cashier");
        InternalShopStaff security = new InternalShopStaff("Rick","Miller", 42,4, 250, "security", 1, "securit");
        seller1.getInfo();
        seller2.getInfo();
        seller3.getInfo();
        manager.getInfo();
        cashier1.getInfo();
        security.getInfo();
        Shop shop1 = new Shop("Dnipro",10000,123, "shop");
        shop1.getInfo();
        Storage storage1  = new Storage("Dnipro", 15000, 500,"storage");
        storage1.getInfo();
        Customer klient1 = new Customer();
        Goods phone = new Goods();
        ExternalShopStaff accounter = new ExternalShopStaff("Rita","Hgdgh",36,21,500,"accounter");
        klient1.askQuation();
        System.out.println(phone.price);
    }
}

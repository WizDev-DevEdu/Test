package Module_04HW;

public class ShopArea {
    public static void main(String[] args) {
        InternalShopStaff seller1 = new InternalShopStaff();
        seller1.setFirstName("Bob");
        seller1.setLastName("Smith");
        seller1.setAge(25);
        seller1.getInfo();
        seller1.getInternalInfo("seller",123,"TV");
        System.out.println("The salary os employee is " + seller1.calcularionOfSalary(20,300));
        Shop shop1 = new Shop("Dnipro",10000,123, "shop");
        shop1.getInfo();
        shop1.getShopInfo(123, 29, "TV, Monile, Kitchen goods");
        Storage storage1  = new Storage("Dnipro", 15000, 500,"storage");
        storage1.getInfo();
        storage1.getStorageInfo(1000,50,"TV");
    }
}

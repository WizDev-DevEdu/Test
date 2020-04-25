package Module_04HW;

public class Goods {
    public int price;
    private String type;
    private int number;

    public void price(){
        System.out.println("Этот товар стоит:" + ExternalShopStaff.priceOfGoods);
    }
}
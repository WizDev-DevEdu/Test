package Module_04HW;

public class ExternalShopStaff extends Staff {
    public static String priceOfGoods;
    private String admposition;
    private int price;

    public ExternalShopStaff(String firstName, String lastName, int age, int workedDays, int rate, String admposition) {
        super(firstName, lastName, age, workedDays, rate);
        this.admposition = admposition;
        this.price = price;
    }

    public void priceOfGoods() {
        System.out.println("price = 8000");

    }
}
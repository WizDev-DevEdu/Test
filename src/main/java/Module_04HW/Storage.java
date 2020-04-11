package Module_04HW;

public class Storage extends Buildings {
    private int goodsNumber;
    private int employeesNumber;
    private String goodsName;

    public Storage(String city, int rent, int area, String type) {
        super(city, rent, area, type);
    }

    public void getStorageInfo(int goodsNumber, int employeesNumber, String goodsName) {
        System.out.println("Information about Storage:");
        System.out.println("Goods number is " + goodsNumber);
        System.out.println("Staffs number is " + employeesNumber);
        System.out.println("Goods: " + goodsName);
    }
}
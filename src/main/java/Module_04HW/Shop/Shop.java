package Module_04HW.Shop;

public class Shop extends Buildings {
    private int shopNumber;
    private int employeesNumber;
    private String department;


    public Shop(String city, int rent, int area, String type) {
        super(city, rent, area, type);
    }

    public void getInfo() {
        System.out.println("Information about shop:");
        System.out.println("Shop number is " + shopNumber);
        System.out.println("Staffs number is " + employeesNumber);
        System.out.println("Department: " + department);

    }
}
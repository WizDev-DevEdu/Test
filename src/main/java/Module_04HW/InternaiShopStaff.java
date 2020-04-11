package Module_04HW;

public class InternaiShopStaff extends Staff {
    private String position;
    private int shopNumber;
    private String specialization;

    public InternaiShopStaff(String firstName, String lastName, int age, int number, int workedDays, int rate, String position, int shopNumber, String specialization) {
        super(firstName, lastName, age, number, workedDays, rate);
        this.position = position;
        this.shopNumber = shopNumber;
        this.specialization = specialization;
    }

    public void getInternalInfo() {
        System.out.println("Position is " + position);
        System.out.println("Shop number is "+ shopNumber);
        System.out.println("Specialization is " + specialization);
    }
}

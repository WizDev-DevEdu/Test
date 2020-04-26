package Module_04HW.Shop;

public class Office {
    private String position;
    private int employeesNumber;
    private String department;


    public Office(String position, int employeesNumber, String department) {
        this.position = position;
        this.employeesNumber = employeesNumber;
        this.department = department;
    }
    public void askAllInfo(){
        System.out.println("Передайте мне всю инфу о складах, магазинах и персонале");
    }
}

package Module_04HW;

public class InternalShopStaff extends Staff {
    private String position;
    private int shopNumber;
    private String specialization;


    public InternalShopStaff(String firstName, String lastName, int age, int workedDays, int rate, String position, int shopNumber, String specialization) {
        super(firstName, lastName, age, workedDays, rate);
        this.position = position;
        this.shopNumber = shopNumber;
        this.specialization = specialization;
    }

    public void getInfo(String position, int shopNumber, String specialization) {
        System.out.println("Position is " + position);
        System.out.println("Shop number is " + shopNumber);
        System.out.println("Specialization is " + specialization);
    }

//    public int customerQustion(){
//        switch(position){
//
//            case seller:
//                System.out.println();
//
//        }
//    }

}

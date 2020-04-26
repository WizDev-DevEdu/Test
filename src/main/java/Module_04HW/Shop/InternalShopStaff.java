package Module_04HW.Shop;

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

    public void chooseDepartment() {
        System.out.println("Какой отдел вас интересует? У нас есть: mobile, TV, PC");
    }

    public void chooseSeller(String enterDepartment) {
        switch (enterDepartment) {
            case "mobile":
                System.out.println("Здравствуйте, я продавец отдела mobile. У нас есть phone1 и phone2. Какой РС вы хотите купить?");
                break;
            case "TV":
                System.out.println("Здравствуйте, я продавец отдела TV. У нас есть TV1 и TV2. Какой РС вы хотите купить?");
                break;
            case "PC":
                System.out.println("Здравствуйте, я продавец отдела РС. У нас есть PC1 и PC2. Какой РС вы хотите купить?");
                break;
            default:
                System.out.println("У нас такого нет");

        }
    }

    public void goToCashier(String enterAnswer) {
        switch (enterAnswer.toLowerCase()) {
            case "yes":
                System.out.println("Пройдемте на кассу");
                break;
            case "no":
                System.out.println("Я могу Вам чем-то еще помочь?");
                break;
            default:
                System.out.println("Мы учтем Ваши пожелания");
        }
    }

    public void differentChoise(String enterAnswer2) {
        switch (enterAnswer2.toLowerCase()) {
            case "yes":
                System.out.println("Какой отдел вас интересует? У нас есть: mobile, TV, PC");
                break;
            case "no":
                System.out.println("Я могу Вам чем-то еще помочь?");
                break;
            default:
                System.out.println("Мы учтем Ваши пожелания");
        }
    }
    public void askCustomer() {
        System.out.println("Какоое количество товара Вам необходимо?");
    }
}
    public void priceOfGoods (int enterNumberOfGoods){
        System.out.println(enterNumberOfGoods*);
    }
//    public int customerQustion(){
//        switch(position){
//
//            case seller:
//                System.out.println();
//
//        }
//    }



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
                System.out.println("Здравствуйте, я продавец отдела mobile. У нас есть phone1 и phone2. Какой mobile вы хотите купить?");
                break;
            case "TV":
                System.out.println("Здравствуйте, я продавец отдела TV. У нас есть TV1 и TV2. Какой TV вы хотите купить?");
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

    public void askCustomerAboutNumber() {
        System.out.println("Какое количество товара Вам необходимо?");
    }

    public void askCustomerAboutGoods() {
        System.out.println("Какой товар Вы выбрали?");
    }
public void conversation1(){
    System.out.println("Полная стоимость:");
}
    public int priceOfGoods(int enterNumberOfGoods, String cuftomerChoose) {
        int price = 0;
        switch (cuftomerChoose) {
            case "phone1":
                price =  enterNumberOfGoods * 8000;
                break;
            case "phone2":
                price =  enterNumberOfGoods * 7000;
                break;
            case "TV1":
                price =  enterNumberOfGoods * 18000;
                break;
            case "TV2":
                price =  enterNumberOfGoods * 28000;
                break;
            case "PC1":
                price =  enterNumberOfGoods * 38000;
                break;
            case "PC2":
                price =  enterNumberOfGoods * 58000;
                break;
            default:
                price = 1;
        }return price;
    }
    public void conversation2(){
        System.out.println("После оплаты предъявите чек охране");
    }

    public void checkTheCeckRequest() {
        System.out.println("У Вас есть чек? Предъявите.");
    }

    public void checkTheCeck(String securityConversation) {
        switch (securityConversation.toLowerCase()) {
            case "yes":
                System.out.println("Все Ок! Спасибо за покупку.");
                break;
            case "no":
                System.out.println("Звоните в полицию!!!");
                break;
            default:
                System.out.println("ЭЭЭЭ, блым-блым");
        }
    }
    public void askAnoutCassaAmount(){
        System.out.println("Кассир какой выторг сегодня? Сдай кассу.");
    }
//    public int totalCassa(){
//        int cassaAmount = 0;
//        cassaAmount = price;
//        System.out.println();
//    }return cassaAmount;


}




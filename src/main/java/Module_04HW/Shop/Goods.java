package Module_04HW.Shop;

public class Goods {
    private String type;
    private int number;

    public Goods(String type, int number) {
        this.type = type;
        this.number = number;
    }

    public void goodsType (String enterGoodsType) {
        switch (enterGoodsType) {
            case "phone1":
                System.out.println("Ваш товар стоит: 8000. Вам подходит?");
                break;
            case "phone2":
                System.out.println("Ваш товар стоит: 7000. Вам подходит?");
                break;
            case "TV1":
                System.out.println("Ваш товар стоит: 18000. Вам подходит?");
                break;
            case "TV2":
                System.out.println("Ваш товар стоит: 28000. Вам подходит?");
                break;
            case "PC1":
                System.out.println("Ваш товар стоит: 38000.Вам подходит?");
                break;
            case "PC2":
                System.out.println("Ваш товар стоит: 58000.Вам подходит?");
                break;
            default:
                System.out.println("Извените, я не могу Вам помочь.");

        }
    }


}
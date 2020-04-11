package Module_04HW;

public class Buildings {
    private String city;
    private int rent;
    private int area;
    private String type;


    public Buildings(String city, int rent, int area, String type) {
        this.city = city;
        this.rent = rent;
        this.area = area;
        this.type = type;
    }
    public void getInfo() {
        System.out.printf("Information about %s:\n",type);
        System.out.println("City is " + city);
        System.out.println("Rent is " + rent);
        System.out.println("Area is " + area);

    }
}
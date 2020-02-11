package Module_02HW;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.println("Введите свой возраст");
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
       in.close();
        switch(age){

            case  10:
                System.out.println("Совсем как ребенок!");
                break;
            case 20:
                System.out.println("Так и знал, что - подросток!");
                break;
            case 30:
                System.out.println("Выглядишб взрослым.");
                break;
            case 40:
                System.out.println("Самое то!");
                break;
            case 50:
                System.out.println("Уже немного не то.");
                break;
            case 60:
                System.out.println("Совсем не то.");
                break;
            case 70:
                System.out.println("Динозавров помнишь?");
                break;
            case 80:
                System.out.println("В нашей сране столько живут?");
                break;
            case 90:
                System.out.println("Не верю!");
                break;
            case 100:
                System.out.println("Столько не живут в наше время");
                break;
            default:
                System.out.println("Горец?");
        }
    }
}

package Module_02HW;

import java.util.Scanner;

public class AnyLeght
{
    public static void main(String[] args) {

        System.out.println("Введите число любой длины");
        Scanner in = new Scanner(System.in);
        double number = in.nextDouble();
        in.close();

        if (number % 2 != 0){
            System.out.println("Число нечетное " );
        } else
            {
            System.out.println("Число четное ");

        }
    }
}

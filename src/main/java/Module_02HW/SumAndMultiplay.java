package Module_02HW;
import java.util.Scanner;

public class SumAndMultiplay {
    public static void main (String[] args){
        System.out.println("Введите число");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        in.close();
        int summa = 0;
        int miltiplay = 1;
        while (number!=0){

            miltiplay *= number % 10;
            summa += number % 10;
            number /= 10;
            //summa += number;
        }
        System.out.println("Сумма: " + summa);
        System.out.println("Произведение: " + miltiplay);

    }
}

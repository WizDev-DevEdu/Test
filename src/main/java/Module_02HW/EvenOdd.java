package Module_02HW;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        System.out.println("Введите четное и не четное число в любом порядке");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        double firstNumber = in.nextDouble();
        System.out.println("Введите второе число");
        double secondNumber = in.nextDouble();
        in.close();

        if (firstNumber % 2 != 0){
            System.out.println("Первое число нечетное " + firstNumber);
        } else if (secondNumber  % 2 != 0) {
            System.out.println("Второе число нечетное " + secondNumber);

        }
    }
}

package Module_02HW;
import java.util.Scanner;

public class MaxFromThree {
    public static void main(String args[]) {
        System.out.println("Вычисляем максимум трех чисел");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        double firstNumber = in.nextDouble();
        System.out.println("Введите второе число");
        double secondNumber = in.nextDouble();
        System.out.println("Введите третье число");
        double thirdNumber = in.nextDouble();
        in.close();

        if (firstNumber > secondNumber && firstNumber > thirdNumber){
            System.out.println("Максимальное число " + firstNumber);
        } else if (secondNumber > thirdNumber) {
            System.out.println("Максимальное число " + secondNumber);
        } else {
            System.out.println("Максимальное число " + thirdNumber);
        }


    }
}

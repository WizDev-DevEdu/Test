package Module_01HW;

import java.util.Scanner;

public class MinFromThree {
    public static void main(String args[]) {
        System.out.println("Вычисляем минимальное из трех чисел");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        double firstNumber = in.nextDouble();
        System.out.println("Введите второе число");
        double secondNumber = in.nextDouble();
        System.out.println("Введите третье число");
        double thirdNumber = in.nextDouble();
        in.close();

        if (firstNumber < secondNumber && firstNumber < thirdNumber){
            System.out.println("Минимальное число " + firstNumber);
        } else if (secondNumber < thirdNumber) {
            System.out.println("Минимальное число " + secondNumber);
        } else {
            System.out.println("Минимальное число " + thirdNumber);
        }


    }
}

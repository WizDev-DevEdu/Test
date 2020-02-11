package Module_02HW;
import java.util.Scanner;

public class MultipleOfThree
{
    public static void main(String[] args)
    {
        System.out.println("Введите число ");
        Scanner in = new Scanner(System.in);
        double firstNumber = in.nextDouble();
        in.close();

        if (firstNumber % 3 == 0)
        {
            System.out.println("Ваше число кратно трем ");
        } else
            {
            System.out.println("Остаток от деления на три равен  " + firstNumber % 3);

        }
    }
}


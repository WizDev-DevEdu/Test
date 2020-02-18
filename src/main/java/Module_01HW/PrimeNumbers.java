package Module_01HW;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args)
    {
        System.out.println("Введите число");
        Scanner in = new Scanner(System.in);
        double number = in.nextDouble();
        in.close();
        int amount = 0;

        for (int i = 1; i <= number; i++)
        {
            boolean numPrime = true;
            for (int j = 2; j < i; j++)
            {

                if ((i % j) == 0)
                {
                    numPrime = false;
                }
            }
            if (numPrime)
            {
                amount += i;
                System.out.println("Сумма " + amount);

                System.out.println(i);

                }

            else System.out.print("");


        }
    }
}

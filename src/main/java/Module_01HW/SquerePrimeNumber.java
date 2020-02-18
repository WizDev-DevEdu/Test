package Module_01HW;

import java.util.Scanner;

public class SquerePrimeNumber {
    public static void main(String[] args)
    {
        System.out.println("Введите число");
        Scanner in = new Scanner(System.in);
        double number = in.nextDouble();
        in.close();
        int amount = 0;

        for (double i = 1; i <= number; i++)
        {
            boolean numPrime = true;
            for (double j = 2; j < i; j++)
            {

                if ((i % j) == 0)
                {
                    numPrime = false;
                }
            }
            if (numPrime)
            {


                System.out.println(i);
                double squere = Math.sqrt(i);
                System.out.println("Сумма " + amount);
            }

            else System.out.print("");


        }
    }
}


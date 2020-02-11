package Module_02HW;
import java.util.Scanner;

public class NumberOfDays
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("Введите год: " );
        Scanner sc = new Scanner(System.in);
        int year  = sc.nextInt();
        int days = 366;

        int res1 = year % 4;
        int res2 = year % 100;
        int res3 = year % 400;

        if (res1 == 0){
            if (res2 == 0 && res3 != 0)
                days = 365;
        }else
            days = 365;

        System.out.println("Количество дней в этом году: " + days);
    }
}
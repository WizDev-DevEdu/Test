package Module_02HW;
import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args) {
        int n;
        int f;
        f = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число ");
        if(sc.hasNextInt()) {
            n = sc.nextInt();
            for(int i=1; i<=n; i++) {
                f = f*i;
            }
            System.out.println(n+"! = "+f);
        } else {
            System.out.println("Это не число");
        }
    }
}

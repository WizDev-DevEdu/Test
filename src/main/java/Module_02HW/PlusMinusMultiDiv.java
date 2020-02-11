package Module_02HW;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PlusMinusMultiDiv {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число X ");
        double x = in.nextDouble();
        System.out.print("Введите число Y");
        double y = in.nextDouble();
        System.out.print("Введите число знак +,-,* или / ");
        InputStreamReader scanner = new InputStreamReader(System.in);
        String znak = (String) scanner.toString();

        switch (znak) {

            case '+':
                System.out.println("x + y равно " + (x + y));
                break;
            case '-':
                System.out.println("x - y равно " + (x - y));
                break;
            case '*':
                System.out.println("x * y равно " + (x * y));
                break;
            case '/':
                System.out.println("x / y равно " + (x / y));
                break;
            default:
                System.out.println("Ты не выбрал знак!");
        }
    }
}

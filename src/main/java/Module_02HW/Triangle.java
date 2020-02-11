package Module_02HW;
import java.util.Scanner;

public class Triangle
{
    public static void main(String[] args) {
        System.out.println("Введите стороны предпологаемого треугодьника ");
        Scanner in = new Scanner(System.in);
        System.out.println("Первоя сторона");
        double firstSide = in.nextDouble();
        System.out.println("Вторая сторона");
        double secondSide = in.nextDouble();
        System.out.println("Третья сторона");
        double thirdSide = in.nextDouble();
        in.close();

        if ((firstSide + secondSide) > thirdSide) {
            System.out.println("Выйдет красивый треугольник ");
        } else
            System.out.println("Упс, треугольник не получился ");
    }

}

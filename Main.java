package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//  номер задачи 1.22 a)
        System.out.println("Вычисляем значения функции y=7*x^2-3*x+6");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите x");
        double x = in.nextDouble();
        double y;
        y=7*Math.pow(x,2)-3*x+6;
        System.out.println("Значения функции y= "+y);

    //  номер задачи 1.22 b)
        System.out.println("Вычисляем значения функции x = 12*a^2 + 7*a - 16");
        System.out.println("Введите a");
        double a = in.nextDouble();
        x = 12*Math.pow(a,2)+7*a-16;
        System.out.println("Значения функции x= "+x);

       // номер задачи 1.27
       // Считая, что Земля — идеальная сфера с радиусом R = 6350  км, определить расстояние до линии горизонта от точки с заданной высотой над Землей.
        System.out.println("Введите высоту над землей,км");
          double h = in.nextDouble();
          double distance;
          final int R = 6350;
          distance=Math.sqrt((Math.pow((R+h),2)-Math.pow(R,2)));
        System.out.println("Значения функции y= "+distance);
    }
}

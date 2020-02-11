package Module_02HW;
import java.util.Scanner;

public class FindNumber {
    public static void main(String[] args){

            int a;
            int b;
            int c = 0;
            do{
                a= (int)(Math.random()*200+1)-100;
            }
            while(a==0);
            Scanner scn=new Scanner(System.in);
            System.out.println("Введите целое число из отрезка -100,100");
            if(scn.hasNextInt()){
                do{
                    b=scn.nextInt();
                    if(b < -100 || b == 0 || b > 100 ){
                        System.out.println("Вы ввели число не из-заданного диапазона или 0");
                        System.out.println("Повторите ввод");
                    }
                    else{
                        ++c;
                        if(b == a){
                            System.out.println("Вы угадали с "+c+" попытки");
                        }
                        else{
                            if(b < a ) {
                                System.out.println(" Мое число больше");
                            }
                            else System.out.println("Мое число меньше");
                            if((b < 0 & a > 0) || (b > 0 & a < 0))
                                System.out.println("Число с другим знаком");
                        }
                    }
                }

                while(b!=a);
            }
            else System.out.println("Ошибка. Введено не целое число");

        }
    }


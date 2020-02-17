package Mod_02;

import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        int array[] = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println("Введите число от 1 до 6 индекс которого необходимо узнать");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        in.close();
        while (number!=)//Переменная, которая будет использоваться при обмене элементов
        int temporary;

        for (int i = 0; i < middle / 2; i++) {
            temporary = array[middle - i - 1];
            array[middle - i - 1] = array[i];
            array[i] = temporary;
        }
        //Выводим конечный массив в консоль
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);

        }
    }
}
}

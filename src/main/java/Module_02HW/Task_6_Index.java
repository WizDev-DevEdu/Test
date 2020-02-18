package Module_02HW;

import java.util.Scanner;

public class Task_6_Index {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println("Введите число от 1 до 6 индекс которого необходимо узнать");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        in.close();
        int indexOfElement = 0;
        for (int i = 0; i < array.length; i++) {
            int arrayElement = array[i];
            if (number == arrayElement) {
                indexOfElement = i;
            System.out.println(indexOfElement);
            }
        }
    }
}



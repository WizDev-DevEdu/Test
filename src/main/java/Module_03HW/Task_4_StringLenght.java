package Module_03HW;

import java.util.Scanner;

//Определить длину строки, введенной пользователем.
public class Task_4_StringLenght {
    public static void main(String[] args) {
        System.out.println("Введите строку");
        Scanner in = new Scanner(System.in);
        String enter = in.nextLine();
        int lenghthOfString = enter.length();
        System.out.println("The string length of '" + enter + "' is: " + lenghthOfString);
    }
}



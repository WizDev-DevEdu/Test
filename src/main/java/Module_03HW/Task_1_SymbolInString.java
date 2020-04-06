package Module_03HW;

import java.util.Scanner;

//Определить, как часто встречается определенный символ в строке
public class Task_1_SymbolInString {
    public static void main(String[] args) {
        System.out.println("Введите строку");
        Scanner in = new Scanner(System.in);
        String enter = in.nextLine();
        int N = 256;
        int[]counterOfSymbols = new int[N];
        int l = enter.length();
        for (int i = 0; i < l; i++)
            counterOfSymbols[enter.charAt(i)]++;
        int max = -1;
        char result = ' ';

        for (int i = 0; i < l; i++) {
            if (max < counterOfSymbols[enter.charAt(i)]) {
                max = counterOfSymbols[enter.charAt(i)];
                result = enter.charAt(i);
            }
        }
        System.out.println("The given string is: " + enter);
        System.out.println("Max occurring character in the given string is: " + result);
    }
}

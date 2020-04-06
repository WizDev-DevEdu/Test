package Module_03HW;

import java.util.Scanner;

//Вывести слова в обратном порядке.
//+ применить алгоритм с задачи 2, т.е. слова идут в обратном порядке +они перевернуты.
public class Task_5_WordsOrder {
    public static void main(String[] args) {
        System.out.println("Введите строку");
        Scanner in = new Scanner(System.in);
        String enter = in.nextLine();
        StringBuilder enterReverse = new StringBuilder(enter);
        String StrRev = enterReverse.reverse().toString();

        String[] words = StrRev.split(" ");
        StringBuilder reverse = new StringBuilder();
        for (String tmp : words) {
            enterReverse = new StringBuilder(tmp);
            reverse.append(enterReverse.reverse() + " ");
        }
        reverse.deleteCharAt(reverse.length() - 1);
        System.out.println("The given string is: " + enter);
        System.out.println("The new string after reversed the words: " + reverse.toString());
    }
}


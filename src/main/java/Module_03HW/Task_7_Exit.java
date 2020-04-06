package Module_03HW;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

import java.util.Scanner;

//Пользователь вводит слова по одному. Прервать ввод нужно написав в консоль "EXIT".
//Рандомными образом расставить введенные слова чтобы получилась одна строка-предложение.
public class Task_7_Exit {
    public static void main(String[] args) {
        System.out.println("Введите word");
        Scanner in = new Scanner(System.in);
        String enter = in.nextLine();
        String[] wordList = new String[10];
        if (enter.contains("EXIT")) {
            for (int i = 0; i < wordList.length; i++) {
                System.out.print(wordList[i]);
            }
        } else {
            for (int i = 0; i < wordList.length; i++) {
                wordList[i] = enter;
                System.out.println("Введите word");


            }
        }
    }
}


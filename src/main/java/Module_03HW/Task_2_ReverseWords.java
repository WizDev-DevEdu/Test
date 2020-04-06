package Module_03HW;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
//Перевернуть слова, т.е. последовательность слов остается, но слова написаны задом на перед.
public class Task_2_ReverseWords {
    public static void main(String[] args) {
        System.out.println("Введите строку");
        Scanner in = new Scanner(System.in);
        String enter = in.nextLine();
        String[] enterSplit = enter.split(" ");
//        System.out.println(Arrays.toString(enterSplit));
        String[] each_words = enter.split(" ");
        String revString = "";

        for (int i = 0; i < each_words.length; i++) {
            String word = each_words[i];
            String reverseWord = "";

            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
            }
            revString = revString + reverseWord + " ";
        }
            System.out.println("The given string is: " + enter);
            System.out.println("The string reversed word by word is: " + revString);

        }
    }



//       for(int i = 0; i < (Arrays.toString(enterSplit)).length(); i++ ){
////        Arrays.toString(i);
//////          StringBuilder i = new StringBuilder(i);
//////           i.reverse();
////           System.out.println( i.reverse());
//////           String[] i = i.reverse();
//////           System.out.println((Arrays.toString(i.reverse())));
//           StringBuilder s2 = new StringBuilder(i);
//           s2.reverse();
//           System.out.println(s2.toString());
//       }
//
//
//    }
//}
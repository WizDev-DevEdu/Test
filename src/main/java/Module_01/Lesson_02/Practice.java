package Module_01.Lesson_02;

import java.sql.SQLOutput;

public class Practice {
    public static void main(String[] args) {
//        int a = 20;
//        int b = 555;
//        if(a > b){
//            System.out.println("а меньше b");
//            System.out.println("а равно " + a);
//            System.out.println("b равно " + b);
//        } else if (b % a < a - b) {
//            System.out.println("а % b");
//        }
//        boolean r = true;
//        if(b == false){
//            System.out.println("Hello");
//        } else {
//            System.out.println("Bye");
//        }
//
//    }
//        for (int i = 20; i >= 0; i--) {
//            if (i % 2 != 0){
//                System.out.println(i);}
//        }
//    }
//        for (int i = 20; i >= 0; i--) {
//            System.out.println(i);
//
//            if (i % 2 == 0) {
//                continue;
//            }
//        }
//        int a = 1;
//        int b = 2;
//
//        do {
//            System.out.println("Hello");
//        }
//        while ( a++ < b);
//        System.out.println("Bye....");
//        for (int i = 1; i <= 100; i *=2){
//            System.out.println(i);
//        }
        int oldNum = 1;
        int newNum = 1;
        int F;
        for (int i = 0; i < 100 ; i++) {

            F = oldNum + newNum;
            oldNum = newNum;
            newNum = F;

            System.out.println(F);


        }


    }
}

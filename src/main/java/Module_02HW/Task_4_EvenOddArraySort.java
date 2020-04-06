//package Module_02HW;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//public class Task_4_EvenOddArraySort {
//    public static void main (String[] args) {
//
//        int[] array = new int[]{10, 101, 888, 0, 120, 1020};
//        for (int i = 0; array.length; i++)
//
////
////    {
////        if (array[i] % 2 == 0) {
////            for (int value : array) {
////                System.out.print(value + ", "); // Вывод четных элементов массива на экран.
////            }
////        }
////    }
////        for(
////    int i = 0;
////    i<myList.length;i++)
////
////    {
////        if (myList[i] % 2 != 0) {
////            System.out.print(myList[i] + ", "); // Вывод нечетных элементов массива на экран.
//
//
//            List<Integer> odd = new ArrayList<Integer>();
//        List<Integer> even = new ArrayList<Integer>();
//        for (int i : array) {
//            if ((i & 1) == 1) {
//                odd.add(i);
//            } else {
//                even.add(i);
//            }
//        }
//        Collections.sort(odd);
//        Collections.sort(even);
//        System.out.println("Odd:" + odd);
//        System.out.println("Even:" + even);
//    }

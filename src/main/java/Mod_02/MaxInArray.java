package Module_02HW;

import java.util.Scanner;

public class MaxInArray {
    public static void main(String[] args) {
        int array[] = new int[]{-10, 101, 888, 0, 120, 1020};
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        System.out.println("Maximum Value is: " + maxValue);;
    }
}
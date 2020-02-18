package Module_02HW;

public class Aid {
    public static int bubbleSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temporary = array[i];      // временная переменная для обмена
                    array[i] = array[j];
                    array[j] = temporary;
                }
            }
        }
        return array;
    }
}
//package Module_02HW;
////
////public class Aid {
////    public static int bubbleSort(int[] array) {
////        for (int i = 1; i < array.length; i++) {
////            for (int j = 0; j < array.length - i; j++) {
////                if (array[j] > array[j + 1]) {
////                    int temporary = array[i];      // временная переменная для обмена
////                    array[i] = array[j];
////                    array[j] = temporary;
////                }
////            }
////        }
////        return array;
////    }
////}
//////    public static int concatArray(int[] a, int[] b) {
//////        if (a == null)
//////            return b;
//////        if (b == null)
//////            return a;
//////        int[] r = new int[a.length + b.length];
//////        System.arraycopy(a, 0, r, 0, a.length);
//////        System.arraycopy(b, 0, r, a.length, b.length);
//////        return r;
//////    }
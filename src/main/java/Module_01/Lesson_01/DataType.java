package Module_01.Lesson_01;

public class DataType {
    public static void main(String args[]) {
        //создание переменные всех(!!!) простейших типов
        //создание переменных с инициализацией

        //boolean: хранит значение true или false
        boolean isRed = true;
        boolean isYellow = false;
        boolean isPink = false;
        boolean isGreen = true;

        //float: хранит число с плавающей точкой от -3.4*1038 до 3.4*1038 и занимает 4 байта
        float x = 54.6F;
        float y = 0.093F;
        float s = 78.00000F;
        float d = 100.0933333F;

        //double: хранит число с плавающей точкой от ±4.9*10-324 до ±1.8*10308 и занимает 8 байт
        double q = 81.15;
        double w = 322.73212;
        double e = 94573.5;
        double r = 6.5657;

        //byte: хранит целое число от -128 до 127 и занимает 1 байт
        byte t = 9;
        byte u = 7;
        byte i = 4;
        byte o = 8;

        //short: хранит целое число от -32768 до 32767 и занимает 2 байта
        short p = 5;
        short a = 66;
        short f = 7;
        short g = 96;

        //int: хранит целое число от -2147483648 до 2147483647 и занимает 4 байта
        int h = 666;
        int j = 666;
        int k = 666;
        int z = 666;

        //long: хранит целое число от –9 223 372 036 854 775 808 до 9 223 372 036 854 775 807 и занимает 8 байт
        long c = 565756745;
        long b = 1067457;
        long cc = 5;
        long bc = 10577;

        //char: хранит одиночный символ занимает 2 байта
        char m = 202;
        char n = 'Y';
        char mm = 222;
        char nm = 'g';

        //создание переменных без инициализации для всех простых типов
        boolean isRed1, isYellow1, isPink1;
        float x1, q1, w1;
        double r1, t1, y1;
        byte t2, q2, w2;
        short p1, p2, p3;
        int h1, h2, h3;
        long c1, c2, c3;
        char n1, n2, n3;
        //инициализация переменных результатом (сложения, вычетания...) других переменных
        int x3, y3, z3, r3, t3, q3;      // объявление переменной типа int ТАК НЕ ДЕЛАТЬ!!!
        x3 = 10;     // присвоения значения
        System.out.println(x3);
        y3 = 5 + x3; // присвоения значения сложением
        System.out.println(y3);
        z3 = y3 - 1; // присвоения значения вычитанием
        System.out.println(z3);
        r3 = z3 * 2; // присвоения значения умножением
        System.out.println(r3);
        t3 = r3 / 2; // присвоения значения делением
        System.out.println(t3);
        q3 = t3 % x3; // присвоения значения остатком от деления
        System.out.println(q3);

        // преобразование типов: от типа long -> int
        long a4 = 44552452;
        int b4 = (byte) a;
        System.out.println(b4);
        // преобразование от byte к int
        byte b5 = 7;
        int d5 = b5;
        System.out.println(d5);
        // от типа int к типу float с потерей данных
        int k2 = 2147483647;
        float kk2 = a;
        System.out.println(kk2);

        // константные переменные с инициализацией
        final double Pi = 3.14;
        System.out.println(Pi);
//        LIMIT = 57; // так мы не можем написать выдаст ошибку
    }
}

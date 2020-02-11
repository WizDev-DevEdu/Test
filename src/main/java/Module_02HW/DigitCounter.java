package Module_02HW;

public class DigitCounter
{
    public static void main(String[] args) {
        String number = "123456";
        int counter = evenCounter(number);
        int summ = oddSum(number);

        System.out.println(counter+" "+summ);

    }

    public static int evenCounter(String number) {
        int counter = 0;

        for (int i = 0; i < number.length(); ++i) {
            int x = number.charAt(i) - '0';

            if (x % 2 == 0) {
                ++counter;
            }
        }
        return counter;
    }

    public static int oddSum(String number) {
        int summ = 0;

        for (int i = 0; i < number.length(); ++i) {
            int x = number.charAt(i) - '0';

            if (x % 2 == 1) {
                summ += x;
            }
        }
        return summ;
    }

}



package Module_01HW;

public class ExchangeVariable {
    public static void main(String[] args){
        double firstVariable = 12;
        double secondVariable = 2;
        double thirdVariable;

        thirdVariable = firstVariable;
        firstVariable = secondVariable;
        secondVariable = thirdVariable;
        System.out.println(firstVariable);
        System.out.println(secondVariable);

    }
}

package Module_01HW;

public class ASCII {
    public static void main(String[] args) {
        String allSymbols = "` 1234567890-=qwertyuiop[]asdfghjkl;'\\ zxcvbnm,./йцукенгшщзхъфывапролджэячсмитьбю./ *-";

        int number = 1;

        for (char symbol : allSymbols.toCharArray()) {
            String hexSymbolValue = String.format("%04x", (int) symbol);
            int octalSymbolValue = (int) symbol;

            System.out.println("Symbol: " + number + " " + symbol + " " + hexSymbolValue +  " " + octalSymbolValue);

            number++;
        }
    }
}

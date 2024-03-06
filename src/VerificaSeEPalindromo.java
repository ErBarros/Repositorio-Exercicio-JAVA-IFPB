import java.util.Scanner;

public class VerificaSeEPalindromo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("DIGITE UMA PALAVRA: ");
        String str = teclado.next();

        boolean palindromo = true;

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                palindromo = false;
                break;
            }
        }

        if (palindromo) {
            System.out.println("\nA string é um palíndromo.");
        } else {
            System.out.println("\nA string não é um palíndromo.");
        }
    }
}

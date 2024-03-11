package ListaExtra;

import java.util.Scanner;

public class InverteString {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("DIGITE UMA FRASE : ");

        String frase = teclado.nextLine();

        String invertida = " ";

        for(int i = frase.length()-1; i >= 0; i--){

            invertida += frase.charAt(i);
        }

        System.out.println(invertida);
    }

}

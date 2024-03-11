package ListaExtra;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ContaVogal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("DIGITE UMA FRASE: ");

        String frase = teclado.nextLine().toUpperCase();

        int contVogal = 0;

        String vogais = " ";

        for(char umaLetra : frase.toCharArray()){

            if("AEIOU".indexOf(umaLetra) != -1){
                contVogal++;
                vogais += umaLetra;
            }


        }
        System.out.print("A QUANTIDADES DE VOGAIS É: "+ contVogal);
        System.out.println("\nAS VOGAIS SÃO : " + vogais );

        teclado.close();
    }
}

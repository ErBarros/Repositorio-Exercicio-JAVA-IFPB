package ListaExtra;

import java.util.Scanner;

public class MenorNumero {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[] lista ={14,12,78,45,3,67,9876,4};

        int menor =  lista[0];

        for(int numero : lista){

            if(menor > numero){
                menor = numero;
            }

        }
        System.out.println("O MENOR NPUMERO É: "+menor);

    }
}

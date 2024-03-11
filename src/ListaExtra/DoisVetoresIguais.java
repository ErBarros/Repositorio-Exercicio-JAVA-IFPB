package ListaExtra;

import java.util.Scanner;
public class DoisVetoresIguais {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] listaA = new int[5];

        int[] listaB = new int[5];

        for(int i = 0;i < 5; i++){

            System.out.print("DIGITE UM NUMERO: ");

            listaA[i] = scan.nextInt();

        }
        int cont = 0 ;
        for(int numero : listaA){
            listaB[cont] = numero;
            cont++;
        }
        for(int numero : listaA){
            System.out.print(numero + " ");
        }
        System.out.println("  ");

        for(int numero : listaB){
            System.out.print(numero + " ");
        }
    }
}

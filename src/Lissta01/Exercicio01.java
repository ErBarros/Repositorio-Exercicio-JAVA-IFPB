package Lissta01;

import java.util.Scanner;

public class Exercicio01 {

    /*Crie um programa em que você irá ler 10 números inteiros digitados pelo
    usuário e armazená-los em um vetor. Em seguida, exiba os números digitados
    pelo usuário, na ordem que eles foram fornecidos, na ordem inversa da que eles
    foram fornecidos, apenas o s números pares, apenas os números ímpares, a
    soma dos números dos índices ímpares e qual é o maior e qual é o menor dos
    números.*/

    public static void main(String[] ErivanB) {


        int soma = 0;

        int[] arrayOriginal = new int[10];

        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < arrayOriginal.length; i++){

            System.out.print("DIGTE UM NUMERO: ");

            arrayOriginal[i] = scan.nextInt();

        }

        int maior = arrayOriginal[0];
        int menor = arrayOriginal[0];

        for (int numeros : arrayOriginal){

            if(maior < numeros){
                maior =numeros;
            }

            if(menor > numeros){
                menor =numeros;
            }
        }
        System.out.println("________________________________________________");
        System.out.print("ORDEM ORIGINAL: ");
        for(int numeros : arrayOriginal){
            System.out.print(numeros+" ");
        }

        System.out.print("\nORDEM INVERTIDA: ");
        for(int i = arrayOriginal.length-1; i >= 0; i--){
            System.out.print(arrayOriginal[i]+" ");

        }
        System.out.print("\nTODOS OS PARES: ");
        for(int numeros : arrayOriginal){
            if(numeros%2==0){
                System.out.print(numeros+" ");
            }
        }
        System.out.print("\nTODOS OS IMPARES: ");
        for(int numeros : arrayOriginal){
            if(numeros %2!=0){

                System.out.print(numeros+" ");
            }
        }
        for(int i = 1; i <arrayOriginal.length;i+=2 ) {

            soma += arrayOriginal[i];
        }
        System.out.println("\nA SOMA INDICE IMPAR: "+soma);
        System.out.println("O MAIOR É: "+maior);
        System.out.println("O MENOR É: "+menor);
        System.out.print("________________________________________________");
        scan.close();

    }
}

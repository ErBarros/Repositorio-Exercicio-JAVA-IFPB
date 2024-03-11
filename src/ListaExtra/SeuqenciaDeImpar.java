package ListaExtra;

import java.util.Scanner;

public class SeuqenciaDeImpar {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int  numTeto = teclado.nextInt();


        for(int i = 1; i <= numTeto; i+=2){

            System.out.println("impar:"+ i);
        }
    }
}

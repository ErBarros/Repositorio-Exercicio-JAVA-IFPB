package ListaExtra;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {


        System.out.println("FATORIAL");

        Scanner input = new Scanner(System.in);

        System.out.print("DIGITE UM NUMERO:  ");
        int num = input.nextInt();

        long fatorial = 1;

        for(int i = 1; i <= num; i++){

            fatorial *= i;
        }

        System.out.println("O fatorial de " + num + " é: " + fatorial);

    }
}

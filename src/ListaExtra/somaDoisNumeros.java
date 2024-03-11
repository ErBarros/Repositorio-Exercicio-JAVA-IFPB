package ListaExtra;

import java.util.Scanner;

public class somaDoisNumeros {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double soma = 0;

        System.out.print("Digite um número: ");
        double num = input.nextDouble();

        System.out.print("Digite um número: ");
        double num2 = input.nextDouble();

        soma = num + num2;

        System.out.print("A SOMA DE DOIS NÚMEROS É:  " +soma);

        input.close();

    }

    }

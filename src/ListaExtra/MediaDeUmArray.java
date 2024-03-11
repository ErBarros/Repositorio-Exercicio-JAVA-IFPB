package ListaExtra;

import java.util.Scanner;

public class MediaDeUmArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arrayOrigin = new int[5];

        int soma = 0;

        for (int i = 0; i < 5;i++){

            System.out.print("DIGITE UM NúMERO: ");

            arrayOrigin[i] = scan.nextInt();

        }

        for(int numeros : arrayOrigin){

            soma+= numeros;
            System.out.print(numeros+" ,");
        }
        int divisor = arrayOrigin.length;
        int media = soma/divisor;
        System.out.print("\nA MEDIA DOS NÚMEROS É :"+media);

        scan.close();

}
}

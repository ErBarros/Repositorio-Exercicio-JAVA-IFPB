package ListaExtra;

import java.util.Scanner;

public class BuscaNALista {

    public static void main(String[] args) {

        int [] arrayDeArmazenamento = {73,90,67,8456,3,13,45,67,0,45,111,145,7};

        Scanner scan = new Scanner(System.in);

        System.out.print("DIGITE UM NÚMERO A SER BUSCADO:");

        int numPerdido = scan.nextInt();
        boolean sinal = false;

        for(int numeroArmazenado: arrayDeArmazenamento){

            if(numeroArmazenado == numPerdido){
                sinal = true;
                break;
            }
            else{
                sinal = false;
            }
        }

        if(sinal == true){
            System.out.println("O NÚMERO,"+ numPerdido+" FOI ENCONTRADO:");
        }
        else{
            System.out.println("O NÚMERO,"+ numPerdido+" NÃO FOI ENCONTRADO:");
        }
        scan.close();
    }
}

import java.util.Scanner;

public class TetoFinal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("DIGITE UM NÚMERO: ");

        int teto = input.nextInt();

        int cont = 0;

        boolean primo = true;

        while (teto >= cont){

            System.out.println("O numero é: "+cont);
            cont++;
        }
        input.close();
    }
}

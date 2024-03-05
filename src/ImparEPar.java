import java.util.Scanner;

public class ImparEPar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = input.nextInt();

        if(num%2 == 0){
            System.out.printf("O NÚMEROS %d É PAR",num);
        }
        else{
            System.out.printf("O NÚMEROS %d É IMPAR",num);
        }

    }

}

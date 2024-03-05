import java.util.Collection;
import java.util.Scanner;
public class OrdemAlfabetica {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("DIGITE UMA PALAVRA: ");
        String primeira = input.nextLine();


        System.out.print("DIGITE UMA PALAVRA: ");
        String segunda = input.nextLine();

        if(primeira.equalsIgnoreCase(segunda) == true){

            System.out.print("SÃO IGUAIS... ");
        }
        else {
            System.out.print("NÃO SÃO IGUAIS...\n");
        }

        String palavraMenor = primeira.compareToIgnoreCase(segunda) < 0 ? primeira : segunda;
        String palavraMaior = palavraMenor.equals(primeira) ? segunda : primeira;

        System.out.println("Palavras em ordem alfabética: ");
        System.out.println(": "+palavraMenor);
        System.out.println(": "+palavraMaior);

        input.close();

    }
}

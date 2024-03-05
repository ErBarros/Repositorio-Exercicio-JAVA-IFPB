import java.util.Scanner;

public class NumPrimoTeto {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = input.nextInt();

        boolean primo = true;
        int cont = 0;

        //FUNÇAO NÃO ESTA RESPONDENDO DE FORMA CORRETA;
        while (num > cont){

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    primo = false;

                    if (primo) {
                        System.out.println(i + " é um número primo.");
                    } else {
                        System.out.println(i + " não é um número primo.");
                    }
                }
            }
           cont++;
        }




        input.close();
    }
}

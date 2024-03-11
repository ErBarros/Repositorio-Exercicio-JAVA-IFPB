package Lissta01;

/*5. Escreva um programa onde você lerá os dados de uma Pessoa e usará o
Porteiro para cumprimentá-la.*/

import java.util.Scanner;

public class MainPessoa {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();

        System.out.print("DIGITE SEU NOME: ");
        String nome = scan.nextLine();
        pessoa.setNome(nome);


        System.out.print("DIGITE SEU SEXO : ");
        String sexo = scan.nextLine();
        pessoa.setSexo(sexo);

        System.out.print("DIGITE SUA IDADE:" );
        int idade = scan.nextInt();
        pessoa.setIdade(idade);

        System.out.print("DIGITE SEU PESO: ");
        float peso = scan.nextFloat();
        pessoa.setPeso(peso);

        Porteiro porteiro = new Porteiro();

        String saida = porteiro.boasVindas(pessoa);

        System.out.println("_________________________");
        System.out.println(saida);
        System.out.println("_________________________");

    }
}

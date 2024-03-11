package Lissta01;

import java.util.Scanner;

public class MainCar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Carro carro = new Carro();

        System.out.println("VAMOS CACULAR A QUANTIDADE DE PARADAS DURANTE O PERCURSO");

        System.out.print("DIGITE O MODELO DO SEU AUTOMOVEL: ");
        carro.setModelo(scan.nextLine());

        System.out.print("\nDIGITE A AUTONOMIA NO VEICULO: ");
        carro.setAutonomia(scan.nextFloat());

        System.out.print("\nDIGITE A CAPACIDADE DO TANQUE: ");
        carro.setCapaciadeDoTanque( scan.nextInt());

        System.out.print("\nDIGITE A DISTANCIA DO PERCURSO: ");
        double distancia = scan.nextDouble();

        Planejador plano = new Planejador();

        int resultado = plano.estimarAbastecimentos(carro,distancia);

        System.out.println("_____________________________");
        System.out.println("A QUANTIDADE DE PARADAS : "+resultado);
        System.out.println("_____________________________");

    }
}

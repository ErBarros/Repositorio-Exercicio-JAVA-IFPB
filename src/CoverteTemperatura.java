import java.util.Scanner;

public class CoverteTemperatura {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Celsius para Fahrenheit");

        System.out.print("Digite a temperatura: ");

        float temperaturaCelsius = input.nextFloat();

        float temperaturaFahrenheit = (temperaturaCelsius * 9 / 5) + 32;

        System.out.print("\nO valor em Fahrenheit: " + temperaturaFahrenheit );

        input.close();
    }
}

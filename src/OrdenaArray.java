import java.util.Arrays;

public class OrdenaArray {

    public static void main(String[] args) {

        int[] arrayNumeros = {45,78,1,56,8967,-15,4,4536,678,1334};

        Arrays.sort(arrayNumeros);

        for(int numeros : arrayNumeros){

            System.out.print(numeros+" ");

        }

    }
}

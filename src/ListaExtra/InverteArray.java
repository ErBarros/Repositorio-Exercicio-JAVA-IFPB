package ListaExtra;

public class InverteArray {

    public static void main(String[] args) {


        int[] arrayOriginal = {10,9,8,7,6,5,4,3,2,1,0};

        int[] arrayCopia = new int[10];

        System.out.println("ARRAY INVERTIDO:");
        for(int i = arrayOriginal.length-1; i >= 0; i--){

            System.out.print(arrayOriginal[i]+" ");

        }
        System.out.println("\nARRAY ORIGINAL:");
        for(int i = 0; i < arrayOriginal.length;i++){

            System.out.print( arrayOriginal[i]+" ");
        }
    }
}

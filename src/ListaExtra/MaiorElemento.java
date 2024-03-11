package ListaExtra;

public class MaiorElemento {

    public static void main(String[] args) {

      int[] array = {1,2,3,4,5,6,7,8,90};

      int maior = array[0];

      for(int i = 1; i < array.length; i++){

          if(array[i] > maior){

              maior = array[i];
          }
      }
      System.out.println("O MAIOR NÚMERO É: "+ maior);

    }
}

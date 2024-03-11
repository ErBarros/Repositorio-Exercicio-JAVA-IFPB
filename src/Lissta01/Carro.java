package Lissta01;

/*6. Crie uma classe chamada Carro. Essa classe vai possuir os atributos chamado:
modelo (String), autonomia (do tipo float) e capacidade do tanque (inteiro). A
autonomia de um carro consiste na quantidade de quilômetros que o carro
consegue percorrer com um 1 litro de combustível. A capacidade do tanque
consiste na quantidade de litros de combustível que cabem no tanque do carro.
Respeite as convenções de nomenclatura e visibilidade.*/

public class Carro {

    private String modelo;

    private float autonomia;

    private int capaciadeDoTanque;

 public String getModelo(){
     return modelo;
 }

 public void setModelo(String modelo){
     this.modelo = modelo;
 }
 public float getAutonomia(){
     return autonomia;
 }
 public void setAutonomia(float autonomia){
     this.autonomia= autonomia;
 }
 public int getCapaciadeDoTanque(){
     return capaciadeDoTanque;
 }
 public void setCapaciadeDoTanque(int capaciadeDoTanque){
     this.capaciadeDoTanque = capaciadeDoTanque;
 }
}

package Lissta01;
// Exercicio3- Classe Pessoa com gets e sets.
public class Pessoa {

    private String nome;
    private  String sexo;
    private float peso;
    private int idade;



    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getPeso(){
        return peso;
    }
    public void setPeso(float peso){
        this.peso = peso;
    }
    public  int getIdade(){
        return idade;
    }
    public  void setIdade(int idade){
        this.idade = idade;
    }

}

package Lissta01;

/*4. Crie uma classe chamada Porteiro. Essa classe terá um método chamado
boasVindas que dará boas vindas personalizadas. O retorno do método
boasVindas é uma String. Ele receberá como parâmetro de entrada um objeto
do tipo Pessoa. O método retorna a mensagem de boas-vindas correspondente
combinada com o nome da pessoa, utilizando o padrão a seguir. (utilize switch
case)
a. Sexo masculino: “Bem vindo, Senhor @nome!”
b. Sexo feminino: “Bem vinda, Senhorita @nome!”
c. Menor de idade (se a pessoa tiver menos de 18 anos de idade –
especificamente para esse testes, use um if fora do switch case):
“Olá, Jovem @nome”
d. Se a pessoa for adulta, mas o sexo não estiver atribuído ou for
diferente de masculino/feminino: “Olá @nome, tenha um ótimo dia.”*/

public class Porteiro {

    public static String boasVindas(Pessoa pessoa){

        String saida = " ";

        int idade = pessoa.getIdade();
        String sexo = pessoa.getSexo().toUpperCase();
        String nome = pessoa.getNome().toUpperCase();


        switch (sexo){

            case "MASCULINO":
                saida = "Bem-vindo, Senhor "  +nome;
                break;

            case "FEMININO":
                saida = "Bem-vinda, Senhorita " + nome;
                break;
            case "":
                saida = "Olá " + nome+ ", tenha um ótimo dia";
                break;
        }

        return saida;
    }

    }


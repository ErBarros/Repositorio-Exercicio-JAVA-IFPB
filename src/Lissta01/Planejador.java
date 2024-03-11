package Lissta01;
/*7. Crie uma classe chamada Planejador. A classe Planejador vai ajudar
motoristas a se planejarem para viagens longas. A classe Planejador possui um
método chamado estimarAbastecimentos, que deve receber um Carro e uma
distância ao destino (em quilômetros), como entrada. Este método retornará
uma estimativa da quantidade de abastecimentos que o carro precisará fazer
para chegar ao destino. Por exemplo, um carro com uma autonomia de 10 km/l
e tanque com capacidade para 40 litros precisará fazer 3 abastecimentos para
uma viagem de 1000 km. Sugestão: pesquise como arredondar o resultado
para cima.*/

public class Planejador {

        public int estimarAbastecimentos(Carro car, double distanciaAoDestino) {
            double autonomia = car.getAutonomia() * car.getCapaciadeDoTanque();
            double abastecimentosNecessarios = Math.ceil(distanciaAoDestino / autonomia);

            return (int) abastecimentosNecessarios;
        }
    }

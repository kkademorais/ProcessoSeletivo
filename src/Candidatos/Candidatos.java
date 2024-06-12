package Candidatos;
import java.util.concurrent.ThreadLocalRandom;

public class Candidatos {

    //Atributos
    String candidatos[] = {"Kaike", "Barreto", "Vimieiro", "Pistola", "Vidrado", "Moto Moto", "Toreto", "Ze Vitor", "Piovani", "Leão "};
    double[] propostaCandidatos;

    //Métodos
    public Candidatos(){
        propostaCandidatos = new double[candidatos.length];
    }


    public void gerarProposta(){
        for(int i = 0; i < 10; i++){
            propostaCandidatos[i] = ThreadLocalRandom.current().nextDouble(1800, 2200);
        }
    }

    public void exibirProposta(){
        for(int i = 0; i < 10; i++){
            System.out.printf("\n%s - candidato de número %d - Proposta salarial = R$%.2f", candidatos[i], i+1, propostaCandidatos[i]);
        }
    }

    //Getters
    public String[] nomeCandidatos(){
        return candidatos;
    }

    public double[] propostaCandidatos(){
        return propostaCandidatos;
    }



    /*public static double valorPretendido() {
    //    return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }*/
}



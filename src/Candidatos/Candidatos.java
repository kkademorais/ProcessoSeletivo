package Candidatos;
import java.util.concurrent.ThreadLocalRandom;

public class Candidatos {

    //Atributos
    String candidatos[] = {"Kaike", "Barreto", "Vimieiro", "Pistola", "Vidrado", "Moto Moto", "Toreto", "Ze Vitor", "Piovani", "Leão "};
    double[] propostaCandidatos;

    //Métodos
        //Construtor => inicializa os atributos do objeto
    public Candidatos(){
        propostaCandidatos = new double[candidatos.length]; //Cria um array de tamanho equivalente ao número de candidatos
    }

    //Acessa o array da instância da classe -> Acessa o array do objeto
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

    //Getters -> acessar arrays fora da classe
    public String[] getNomeCandidatos(){
        return candidatos;
    }

    public double[] getPropostaCandidatos(){
        return propostaCandidatos;
    }
}
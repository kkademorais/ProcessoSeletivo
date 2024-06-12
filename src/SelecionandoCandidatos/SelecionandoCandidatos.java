package SelecionandoCandidatos;
import java.util.concurrent.ThreadLocalRandom;

public class SelecionandoCandidatos {
    public static void main(String[] args) {
        String candidatos[] = {"Kaike", "Barreto", "Vimieiro", "Pistola", "Vidrado", "Moto Moto", "Toreto", "Ze Vitor", "Piovani", "Leão "};
        double salarioBase = 2000.00;

        selecionandoCandidatos(candidatos, salarioBase);

    }
    public static void selecionandoCandidatos(String[] candidatos, double salarioBase) {
        int candidatosSelecionados = 0;
        for(int i = 0; i < candidatos.length; i++){
            if(candidatosSelecionados >= 5) {
                System.out.printf("\nProcesso de seleção encerrado!\n");
                break;
            }
            else{
            double valorPretendido = valorPretendido();
            System.out.printf("\n%s, candidato de número %s solicitou R$%.2f de salário", candidatos[i],  i+1, valorPretendido);
            if(valorPretendido <= salarioBase){
                System.out.printf("\n%s selecionado para a vaga!", candidatos[i]);
                System.out.printf("\nSalário requisitado -> R$%.2f\n", valorPretendido);
                candidatosSelecionados++;
            }
            }
        }
    }
    public static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}

package RH;

public class RH {

    private static String[] nomeSelecionados;
    private static double[] propostaSelecionados;
    private static int candidatosSelecionados;


    public static void analisandoCandidatos(String[] candidatos, double salarioPretendido[], double salarioBase){
        for(int i = 0; i < salarioPretendido.length; i++) {
            System.out.printf("\n%s - Candidato número %d", candidatos[i], i+1);
            if (salarioBase > salarioPretendido[i]) {
                System.out.printf("\nSalário base maior que salário pretendido! ");
                System.out.printf("\nSalário pretendido = R$%.2f", salarioPretendido[i]);
                System.out.printf("\nSalário base = R$%.2f", salarioBase);
                System.out.printf("\nLIGAR PARA O CANDIDATO! \n");
            } else if (salarioBase == salarioPretendido[i]) {
                System.out.printf("\nSalário base igual salário pretendido! ");
                System.out.printf("\nAmbos são R$%.2f", salarioPretendido[i]);
                System.out.printf("\nLIGAR PARA O CANDIDATO COM CONTRA PROPOSTA! \n");
            } else {
                System.out.printf("\nSalário pretendido maior que salário base! ");
                System.out.printf("\nSalário base = R$%.2f", salarioBase);
                System.out.printf("\nSalário pretendido = R$%.2f", salarioPretendido[i]);
                System.out.printf("\nAGUARDANDO RESULTADO DEMAIS CANDIDATOS \n");
            }
        }
    }
    public static void selecionandoCandidatos(String[] candidatos, double salarioBase, double propostaCandidatos[]) {
        candidatosSelecionados = 0;
        nomeSelecionados = new String[5];
        propostaSelecionados = new double[5];

        for(int i = 0; i < candidatos.length; i++){
            if(candidatosSelecionados >= 5) {
                System.out.printf("\nProcesso de seleção encerrado!\n");
                break;
            }
            else{
                System.out.printf("\n%s, candidato de número %d solicitou R$%.2f de salário", candidatos[i],  i+1, propostaCandidatos[i]);
                if(propostaCandidatos[i] <= salarioBase){
                    nomeSelecionados[candidatosSelecionados] = candidatos[i];
                    propostaSelecionados[candidatosSelecionados] = propostaCandidatos[i];

                    System.out.printf("\n%s selecionado para a vaga!", candidatos[i]);
                    System.out.printf("\nSalário requisitado -> R$%.2f\n", propostaCandidatos[i]);
                    candidatosSelecionados++;
                }
            }
        }
    }

    public static void exibirSelecionados(){
        System.out.printf("\nCandidatos Selecionados: ");
        for(int i = 0; i < candidatosSelecionados; i++){
            System.out.printf("\n%s - Proposta Salarial = R$%.2f", nomeSelecionados[i], propostaSelecionados[i]);
        }
    }
}

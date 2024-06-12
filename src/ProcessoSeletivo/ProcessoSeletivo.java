package ProcessoSeletivo;

import Candidatos.Candidatos;
import RH.RH;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        RH rh = new RH();
        Candidatos candidatos = new Candidatos();

        double salarioBase = 2000.00;

        candidatos.gerarProposta();
        candidatos.exibirProposta();


        RH.analisandoCandidatos(candidatos.nomeCandidatos(), candidatos.propostaCandidatos(), salarioBase);
        RH.selecionandoCandidatos(candidatos.nomeCandidatos(), salarioBase, candidatos.propostaCandidatos());
        RH.exibirSelecionados();
        RH.ligarSelecionados();
    }
}

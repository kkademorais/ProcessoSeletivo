package AnalisandoCandidatos;
import java.util.Scanner;
import java.util.Locale;

public class AnalisandoCandidatos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double salarioBase = 2000.00;

        analisandoCandidatos(scanner, salarioBase);
    }

    public static void analisandoCandidatos(Scanner scanner, double salarioBase){
        try {
            System.out.println("Digite o salário pretendido pelo candidato: ");
            double salarioPretendido = scanner.nextDouble();

            if (salarioBase > salarioPretendido) {
                System.out.printf("\nSalário base maior que salário pretendido! ");
                System.out.printf("\nSalário pretendido = R$%.2f", salarioPretendido);
                System.out.printf("\nSalário base = R$%.2f", salarioBase);
                System.out.printf("\nLIGAR PARA O CANDIDATO! \n");
            } else if (salarioBase == salarioPretendido) {
                System.out.printf("\nSalário base igual salário pretendido! ");
                System.out.printf("\nAmbos são R$%.2f", salarioPretendido);
                System.out.printf("\nLIGAR PARA O CANDIDATO COM CONTRA PROPOSTA! \n");
            } else {
                System.out.printf("\nSalário pretendido maior que salário base! ");
                System.out.printf("\nSalário base = R$%.2f", salarioBase);
                System.out.printf("\nSalário pretendido = R$%.2f", salarioPretendido);
                System.out.printf("\nAGUARDANDO RESULTADO DEMAIS CANDIDATOS \n");
            }
        }
        catch (Exception InputMismatchException) {
            System.out.println("Insira um valor numérico! ");
        }
    }

}

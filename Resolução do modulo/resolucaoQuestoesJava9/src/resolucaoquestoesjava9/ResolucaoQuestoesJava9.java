package resolucaoquestoesjava9;
import java.util.Scanner;

public class ResolucaoQuestoesJava9 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o valor da hora-aula (em R$): ");
        double valorHoraAula = teclado.nextDouble();

        System.out.print("Informe o número de horas trabalhadas no mês: ");
        int horasTrabalhadas = teclado.nextInt();

        System.out.print("Informe o percentual de desconto do INSS (em %): ");
        double percentualINSS = teclado.nextDouble();

        double salarioBruto = valorHoraAula * horasTrabalhadas;

        double descontoINSS = salarioBruto * (percentualINSS / 100);

        double salarioLiquido = salarioBruto - descontoINSS;

        System.out.printf("Salário bruto: R$ %.2f%n", salarioBruto);
        System.out.printf("Desconto do INSS: R$ %.2f%n", descontoINSS);
        System.out.printf("Salário líquido: R$ %.2f%n", salarioLiquido);

        teclado.close();
    }
    
}

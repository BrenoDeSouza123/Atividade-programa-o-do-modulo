package resolucaoquestoesjava2;
import java.util.Scanner;

public class ResolucaoQuestoesJava2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a distância a ser percorrida (em km): ");
        double distancia = teclado.nextDouble();

        System.out.print("Informe o preço do litro da gasolina (em R$): ");
        double precoPorLitro = teclado.nextDouble();

        final double consumoMedio = 12.0;

        double quantidadeGasolina = distancia / consumoMedio;

        double custoTotal = quantidadeGasolina * precoPorLitro;

        System.out.printf("Quantidade de gasolina necessária: %.2f litros%n", quantidadeGasolina);
        System.out.printf("Custo total da viagem: R$ %.2f%n", custoTotal);

        // Encerrar o Scanner
        teclado.close();
    }
    
}

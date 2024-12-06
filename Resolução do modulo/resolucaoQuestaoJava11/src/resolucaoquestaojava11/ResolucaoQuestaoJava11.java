package resolucaoquestaojava11;
import java.util.Scanner;
public class ResolucaoQuestaoJava11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Informe o primeiro numero: ");
        double num1 = teclado.nextDouble();
        System.out.println("Informe o segundo numero: ");
        double num2 = teclado.nextDouble();
        
        double soma = num1 + num2;
        if (soma > 10){
            soma = soma + 5;
        }
        else {
            soma = soma - 7;
        }
        teclado.close();
    }
    
}

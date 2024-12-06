package resolucaoquestoesjava10;
import java.util.Scanner;

public class ResolucaoQuestoesJava10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Informe um numero: ");
        double num1 = teclado.nextDouble();
        System.out.println("Informe outro numero: ");
        double num2 = teclado.nextDouble();
        
        double soma = num1 + num2;
        
        if (soma > 10){
            System.out.println("O resultado da soma é: " + soma);
        }
        teclado.close();
    }
    
}

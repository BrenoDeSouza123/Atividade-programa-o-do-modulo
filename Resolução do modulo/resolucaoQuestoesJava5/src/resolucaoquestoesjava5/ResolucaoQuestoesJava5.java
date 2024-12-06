package resolucaoquestoesjava5;
import java.util.Scanner;

public class ResolucaoQuestoesJava5 {

    public static void main(String[] args) {
        double num1 , num2;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Informe o primeiro numero: ");
        num1 = teclado.nextDouble();
        System.out.println("Informe o segundo numero: ");
        num2 = teclado.nextDouble();
        if (num1 > num2){
            System.out.println("O primeiro é maior que o segundo");
        }
        else if (num1 < num2){
            System.out.println("O segundo é maior que o primeiro");
        }
        else if (num1 == num2){
            System.out.println("Ambos são iguais");
        }
        teclado.close();
    }
    
}

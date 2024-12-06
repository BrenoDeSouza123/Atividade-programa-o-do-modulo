package resolucaoquestoesjava7;
import java.util.Scanner;

public class ResolucaoQuestoesJava7 {

    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
         System.out.println("Informe o peso da pessoa: ");
         double peso = teclado.nextDouble();
         System.out.println("Informe a altura da pessoa: ");
         double altura = teclado.nextDouble();
         
         double imc = peso / (altura * altura);
         
         if (imc >= 30){
             System.out.println("O paciente está obeso");
         }
         else {
             System.out.println("O paciente está normal");
         }
         teclado.close();
    }
    
}

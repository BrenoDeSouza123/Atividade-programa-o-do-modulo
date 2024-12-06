package resolucaoquestoesjava4;

import java.util.Scanner;
public class ResolucaoQuestoesJava4 {
    public static void main(String[] args) {
        double temperatura = 0;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe a temperatura do(a) paciente: ");
        temperatura = teclado.nextDouble();
        if ((temperatura >= 37.3) && (temperatura <= 37.7)){
            System.out.println("O(A) paciente está febril");
        }
        else if ((temperatura >= 37.8) && (temperatura <= 38.9)){
             System.out.println("O(A) paciente está com febre moderada");
        }
        else if (temperatura >= 39){
             System.out.println("O(A) paciente está com febre alta");
        }
        else {
             System.out.println("O(A) paciente está normal");
        }
        teclado.close();
    }
    
}

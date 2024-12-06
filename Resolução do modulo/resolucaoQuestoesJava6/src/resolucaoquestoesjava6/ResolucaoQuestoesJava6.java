
package resolucaoquestoesjava6;
import java.util.Scanner;
public class ResolucaoQuestoesJava6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Informe a nota da 1a prova: ");
        double nota1 = teclado.nextDouble();
        System.out.println("Informe a nota da 2a prova: ");
        double nota2 = teclado.nextDouble();
        System.out.println("Informe a nota do trabalho: ");
        double trabalho = teclado.nextDouble();
        
        double media = (nota1 + nota2 + trabalho) / 3;
        
        if (media >= 7){
            System.out.println("Aluno(a) aprovado(a)");
        }
        else {
            System.out.println("Aluno(a) reprovado(a)");
        }
        teclado.close();
    }
    
}

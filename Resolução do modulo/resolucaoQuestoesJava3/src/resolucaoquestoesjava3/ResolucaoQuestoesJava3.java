package resolucaoquestoesjava3;

import java.util.Scanner;

public class ResolucaoQuestoesJava3 {

    public static void main(String[] args) {
        int idade = 0;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Informe a idade da pessoa: ");
        idade = teclado.nextInt();
        if (idade <18 ){
            System.out.println("O(A) individuo(a) não pode tirar carteira de motorista");
        }
        else {
            System.out.println("O(A) individuo(a) pode tirar carteira de motorista");
        }
        teclado.close();
    }
    
}

package resolucaoquestaojava8;
import java.util.Scanner;
    
public class ResolucaoQuestaoJava8 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Informe o raio do circulo: ");
        double raio = teclado.nextDouble();
        double pi = 3.14;
        double areaCirc = pi * (raio * raio);
        
        System.out.println("A area da circunferencia é: " + areaCirc);
        teclado.close();
    }
    
}

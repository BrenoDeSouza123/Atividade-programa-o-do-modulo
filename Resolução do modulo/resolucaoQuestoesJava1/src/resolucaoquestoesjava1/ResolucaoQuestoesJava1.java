package resolucaoquestoesjava1;

import java.util.Scanner;

public class ResolucaoQuestoesJava1 {

    double salario = 1200.00;
    
    public int bonus(int horasTrabalhadas){
    return horasTrabalhadas * 20;}
    
    public double calcSalarioFinal(int aumento){
        
    return salario + aumento;}
    
    public static void main(String[] args) {
        int horasTrabalhadas = 0;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Informe a quantidade de horas trabalhadas: ");
        do {
            horasTrabalhadas = teclado.nextInt();
        }while(horasTrabalhadas <= 0);
        System.out.println("O trabalhador trabalha " + horasTrabalhadas + " hora(s)");
        
        ResolucaoQuestoesJava1 acrescimo = new ResolucaoQuestoesJava1();
        ResolucaoQuestoesJava1 calc = new ResolucaoQuestoesJava1();
        
        int aumento = acrescimo.bonus(horasTrabalhadas);
        double salarioFinal = calc.calcSalarioFinal(aumento);
        
        System.out.println("O salário do(a) trabalhador(a) é: " + salarioFinal);
        teclado.close();
        }    
}

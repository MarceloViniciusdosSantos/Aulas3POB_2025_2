//package POB3.Atv1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex06 {
public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#.00");

    System.out.print("Diga o salário bruto do funcionário: ");
    Double salarioB = entrada.nextDouble();
    System.out.print("Diga o sexo do funcioáraio(M/F): ");
    char sexo = entrada.next().charAt(0);

    Double desconto;
    if(sexo == 'M'){
        desconto = salarioB * 0.05;
        double salarioL = salarioB - desconto; 
        
        System.out.println("O desconto do seu salário é de R$" + df.format(desconto));
        System.out.println("O seu salário liquido é de R$" + df.format(salarioL));
    }
    else{
        desconto = salarioB * 0.03;
        double salarioL = salarioB - desconto;
        
        System.out.println("O desconto do seu salário é de R$" + df.format(desconto));
         System.out.println("O seu salário liquido é de R$" + df.format(salarioL));
    }
    entrada.close();
}    
}

/*Salário bruto para líquido */
package POB3.Exercicios01;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex06 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.print("Entre com seu salário: ");
        double sBruto = leitor.nextDouble();

        double desconto = sBruto * 0.075; //Desconto do INSS varia entre 7,5% à 14%/ Considerando o menor valor

        double sLiquido = sBruto - desconto;

        System.out.println("Salário liquido: " + df.format(sLiquido));
        leitor.close();
    }
}

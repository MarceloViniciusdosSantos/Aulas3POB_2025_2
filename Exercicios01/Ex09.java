/*Conversão Real -> Dolar*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex09 {
public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#.00");

    System.out.print("Digite o valor em real: ");
    double real = leitor.nextDouble();

        //Dolár valendo 5,45 reais no momento que o código foi feito
    double dolar = real / 5.45;

    System.out.println("Valor em dolar: " + df.format(dolar));

    leitor.close();
}    
}

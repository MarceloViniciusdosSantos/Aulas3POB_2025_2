/*Conversão de temperatura*/
package POB3.Exercicios01;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.0");

        System.out.print("Diga a temperatura em celsius: ");
        Double celsius = leitor.nextDouble();

        double fahrenheit = (celsius*9/5) + 32;
        
        System.out.print("Conversão: " + df.format(fahrenheit));

        leitor.close();
    }
}

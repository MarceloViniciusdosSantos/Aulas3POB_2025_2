/*Volume de uma esfera*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex08{
public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#.00");

    System.out.print("Entre com o raio: ");
    double raio = leitor.nextInt();
                
    double Rpotencia = Math.pow(raio, 3); //fazendo r³

    double pi = 3.14159;

    double volume = pi * Rpotencia * 4/3;

    System.out.println("Volume da esfera: " + df.format(volume));
    leitor.close();
}
}

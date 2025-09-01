/*Distancia ponto cartesiano*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex10 {
        public static void main(String[] args) {
         
     Scanner leitor = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#.00");

    System.out.print("Digite a primeira coordenada: ");
    double x1 = leitor.nextDouble();
    double y1 = leitor.nextDouble();

    System.out.print("Digite a segunda coordenada: ");
    double x2 = leitor.nextDouble();
    double y2 = leitor.nextDouble();
                
    double d1 = x2 - x1;
    double d2 = y2 - y1;    

    double potencia1 = Math.pow(d1, 2);
    double potencia2 = Math.pow(d2, 2);

    double D = Math.sqrt(potencia1 + potencia2);

    System.out.println("Distancia: " + df.format(D) + " metros");

    leitor.close();
        }
}


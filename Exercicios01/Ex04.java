/*Media Simples*/
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex04 {
 public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#.00");

    System.out.print("Entre com as notas: ");
    double nota1 = leitor.nextDouble();
    double nota2 = leitor.nextDouble();
    double nota3 = leitor.nextDouble();

    double media = (nota1+nota2+nota3) / 3;

    System.out.println("Media: " + df.format(media));

    leitor.close();
 }   
}

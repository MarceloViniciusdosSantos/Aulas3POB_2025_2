/*Área de um círculo */
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.print("Entre com o raio: ");
        Double raio = leitor.nextDouble();

        double area = (raio*raio) * 3.14159;

        System.out.print("Área do círculo: " + df.format(area));

        leitor.close();
    }
}

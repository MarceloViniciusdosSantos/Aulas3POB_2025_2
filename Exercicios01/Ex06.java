/*Salário bruto para líquido */
import java.util.Scanner;
import java.text.DecimalFormat;
public class Ex06 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.print("Entre com seu salário: ");
        double sBruto = leitor.nextDouble();

        double desconto = sBruto * 0.075;

        double sLiquido = sBruto - desconto;

        System.out.println("Salário liquido: " + df.format(sLiquido));
        leitor.close();
    }
}

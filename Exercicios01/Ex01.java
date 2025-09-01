/*Soma de Dois números */
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);
    
    System.out.print("Entre com os 2 valores: ");
    int num1 = leitura.nextInt();
    int num2 = leitura.nextInt();

    int soma = num1 + num2;

    System.out.print("Soma: " + soma);

    leitura.close();
    }
}

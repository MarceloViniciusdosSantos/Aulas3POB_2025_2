/*Soma de Dois números */
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    
    System.out.print("Entre com os 2 valores: ");
    int num1 = leitor.nextInt();
    int num2 = leitor.nextInt();

    int soma = num1 + num2;

    System.out.print("Soma: " + soma);

    leitor.close();
    }
}

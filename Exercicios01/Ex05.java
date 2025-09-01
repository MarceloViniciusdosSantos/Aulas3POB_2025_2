/*Convertor anos pra dia */
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Entre com a sua idade: ");

        int idade = leitor.nextInt();

        int dias = idade * 360;

        System.out.println("Idade em dias: " + dias);

        leitor.close();
    }
}

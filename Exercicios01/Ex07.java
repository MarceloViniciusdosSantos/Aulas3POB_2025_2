/*Perimetro e área de um retângulo*/
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Entre com a base do reatângulo: ");
        int base = leitor.nextInt();
        
        System.out.print("Entre com a altura do reatângulo: ");
        int altura = leitor.nextInt();

        int area = base * altura;
        int perimeto = 2*(base+altura);

        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimeto);
        
        leitor.close();
    }
}

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        Double nota1 = leitor.nextDouble();
        System.out.print("Digite a segunda nota: ");
        Double nota2 = leitor.nextDouble();

        Double media = (nota1+nota2)/2;

        if(media >=7){
            System.out.print("Aprovado!! ");
        }
        else{
            System.out.print("Digite a terceira nota: ");
            Double nota3 = leitor.nextDouble();

            media = (1* (nota1+nota2) + nota3*2)/(1+1+2);
            if(media>=6){
                System.out.print("Aprovado!! ");
            }
            else{
                System.out.print("Reprovado!! ");
            }
        }
        leitor.close();
    }
}

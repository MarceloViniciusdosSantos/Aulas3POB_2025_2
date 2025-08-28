import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número :");
        int num1 = leitor.nextInt();

        System.out.print("Digite outro número :");
        int num2 = leitor.nextInt();

        if(num1>num2){
            System.out.print("O " + num1 + " é maior que o " + num2);
        }else if(num2>num1){
            System.out.print("O " + num2 + " é maior que o " + num1);
        }
        else{
            System.out.print("Os números são iguais!!");
        }
        leitor.close();
    }
}

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número :");
        int num = leitor.nextInt();

       if((num%2) == 0){
        System.out.print("O numero é par!!");
       }
       else{
        System.out.print("O número é ímpar!!");
       }
       leitor.close();
    }
}

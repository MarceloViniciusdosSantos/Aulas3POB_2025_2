package POB3.Atv1;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número :");
        int num1 = leitor.nextInt();

       if((num1%2) == 0){
        System.out.print("O numero é par!!");
       }
       else{
        System.err.print("O número é ímpar!!");
       }
    }
}

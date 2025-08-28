package POB3.Atv1;

import java.util.Scanner;

public class Ex01{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Qual sua idade? ");
        int idade = leitor.nextInt();
        
        if(idade >= 18){
        System.out.print("Maior de idade!");
        }
    }
}

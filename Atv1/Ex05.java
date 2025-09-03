package POB3.Atv1;

import java.util.Scanner;
public class Ex05 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Qual o seu ano de nascimento? \nR: ");
        int ano = leitor.nextInt();
        
        if((2025 - ano) >= 16){
        System.out.println("Apto a ser eleito!! ");
        } else{
            System.out.println("Inapto a ser eleito!!");
        }
        leitor.close();
    }
}

/*Soma dos N primeiros números naturais*/

package Exercícios03;

import java.util.Scanner;

public class Ex01{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite até qual número será feita a soma: ");
        int N = leitor.nextInt();

        int soma = 0;

        for (int i = 0; i<=N; i++){
                soma += i;
        }

        System.out.println("A soma dos primeiros " + N + " numeros naturais é " + soma);
        leitor.close();
    }
}
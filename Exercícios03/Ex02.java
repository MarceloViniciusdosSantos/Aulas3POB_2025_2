/*Tabuada de um número*/

package Exercícios03;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite com o numero: ");

        int N = leitor.nextInt();

        System.out.println("\n     TABUADA DE " + N + "\n");

        int i = 0, mult = 0;

        while (i<=10){
            mult = N * i;

            System.out.println( i + "x" + N + "= " + mult);

            i++;
        }

        leitor.close();
    }
}

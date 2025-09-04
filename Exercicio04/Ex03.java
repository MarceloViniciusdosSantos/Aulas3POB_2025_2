/*Inversão de Elementos de um Array*/

package Exercicio04;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int [] elementos = new int[6];

        for(int i =0;i<6;i++){
            System.out.print("\nDigite o número: ");
            int num = leitor.nextInt();

            elementos[i] = num;
        }
            System.out.println("Exibindo o Array de trás para frente");
        
            for(int i = 5; i>=0; i--){
                System.out.print(" " + elementos[i] + " ");
            }
        leitor.close();
    }
}

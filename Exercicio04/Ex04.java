/*Contagem de Números Pares em um Array*/

package Exercicio04;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int [] Array = new int[8];

        for(int i = 0;i<8;i++){
            System.out.print("\nDigite o valor: ");
            int valor = leitor.nextInt();

            Array[i] = valor;
        }

        int quant=0;

        for(int i = 0;i<8;i++){
           if(Array[i]%2 == 0){
            quant++;
           }
        }

        System.out.print("\nExistem " + quant + " numeros pares no Array");
        leitor.close();
    }
}

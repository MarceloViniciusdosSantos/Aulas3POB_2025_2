/*Busca de Elemento em um Array*/

package Exercicio04;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int [] Array = new int[10];

         for(int i = 0;i<10;i++){
            System.out.print("\nDigite o valor: ");
            int valor = leitor.nextInt();

            Array[i] = valor;
        }

            System.out.print("\nDigite o valor a ser procurado: ");
            int numero = leitor.nextInt();
            int pos=-1;


         for(int i = 0;i<10;i++){
            if(Array[i] == numero){
                pos = i;
            }
        }
        if(pos==-1){
            System.out.println("Numero não encontrado no Array");
        }
        else{
            System.out.println("Numero encontrado na posição " + pos);
        }

        leitor.close();
    }
}

/*Maior e Menor Valor em um Array*/
package Exercicio04;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int [] numeros = new int [5];

        for(int i = 0; i<5; i++){
        System.out.println("Digite os valores do Array: ");
        int num = leitor.nextInt();

        numeros[i] = num;
        }

        int maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;

        for(int i = 0; i<5; i++){
            if(i==0){
                maior = numeros[0];
                menor = numeros[0];
            }
            else{
                if(maior<numeros[i]){
                    maior = numeros[i];
                }
                if(menor>numeros[i]){
                    menor = numeros[i];
                }
            }
        }

        System.out.println("Maior valor: " + maior + "\nMenor valor: " + menor);

        leitor.close();
    }
}

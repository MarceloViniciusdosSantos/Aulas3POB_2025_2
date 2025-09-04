/*Cálculo da Média de Notas*/

package Exercicio04;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int [] notas = new int[4];

        Double soma = 0.0;

        for(int i = 0; i<4;i++){
            System.out.print("\nDiga as notas: ");
            int num = leitor.nextInt();
            notas[i] = num;
            soma += num;
        }

        double media = soma/4;

        if(media>=7){
        System.out.println("APROVADO!!");
}else{
        System.out.println("REPROVADO!!");
}

        leitor.close();
    }
}

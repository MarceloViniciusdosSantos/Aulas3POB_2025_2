/*Média de notas de uma turma*/

package Exercícios03;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe a quantidade de aluno na turma: ");
        Double Aluno = leitor.nextDouble();
        Double soma = 0.0;
        
        for(int i = 1; i<=Aluno; i++){
            System.out.print("\nNota" + i + "= ");
            soma += leitor.nextDouble();
        }
        Double media = soma/Aluno ;

        System.out.print("Média da turma: " + media);

        leitor.close();
    }
}

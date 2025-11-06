package Ex4.controle;

import Ex4.dominio.Aluno;
import java.util.Scanner;

public class GerenciadorAluno {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Boolean validade = false;
        double nota = 0;
       

        System.out.println("Insira o nome do aluno");
        String nome = leitor.nextLine();
        
         Aluno aluno = new Aluno(nome, nota);

        do{
        System.out.println("Insira a nota do aluno");
        nota = leitor.nextDouble();

        validade = aluno.validarNota(nota);
    } while(validade == false);

    aluno.exibirAluno();
    
    leitor.close();
    }

}
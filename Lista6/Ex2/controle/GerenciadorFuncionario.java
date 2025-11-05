package controle;

import dominio.Funcionario;
import java.util.Scanner;

public class GerenciadorFuncionario{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("\nInsira o nome do funcinário: ");
        String nome = leitor.nextLine();
        System.out.print("\nInsira o salario base do funcinário: ");
        Double salarioB = leitor.nextDouble();

        Funcionario funcionario = new Funcionario(nome, salarioB);

        int op;
        do{
            System.out.println("\n=== MENU ===");
            System.out.println("[1] Acresentar Bônus de 20%");
            System.out.println("[2] Acresentar Bônus de 10%");
            System.out.println("[3] Não Acresentar Bônus");
            System.out.println("[4] Exibir Funcionário");
            System.out.println("[5] Sair");
            System.out.print("Escolha uma opção: ");
            op = leitor.nextInt();

            switch (op) {
                case 1:
                funcionario.calcularSalarioFinal("A");
                break;
                case 2:
                funcionario.calcularSalarioFinal("B");
                break;
                case 3:
                funcionario.calcularSalarioFinal("C");
                break;
                case 4:
                funcionario.exibirFuncionario();
                break;
                case 5:
                System.out.print("Saindo...");
                break;
                default:
                System.out.println("Opção inválida!!");
                break;
            }
         } while(op != 5);

        leitor.close();
    }
}
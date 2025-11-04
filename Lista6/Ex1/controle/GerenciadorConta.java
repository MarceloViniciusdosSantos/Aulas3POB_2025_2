package Ex1.controle; 

import Ex1.dominio.ContaBancaria; // As pastas ficaram uma bagunça o VScode não aceitava o package de outra forma
import java.util.Scanner;

public class GerenciadorConta{
    public static void main (String[] args){
        Scanner leitor = new Scanner(System.in);

         System.out.print("Digite o nome do titular da conta: ");
        String nome = leitor.nextLine();

        ContaBancaria conta = new ContaBancaria(nome);

        int opcao;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("[1] Depositar");
            System.out.println("[2] Sacar");
            System.out.println("[3] Exibir Saldo");
            System.out.println("[4] Sair");
            System.out.print("Escolha uma opção: ");
            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor do depósito: ");
                    double deposito = leitor.nextDouble();
                    conta.depositar(deposito);
                    break;

                case 2:
                    System.out.print("Digite o valor do saque: ");
                    double saque = leitor.nextDouble();
                    conta.sacar(saque);
                    break;

                case 3:
                    conta.exibirSaldo();
                    break;

                case 4:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 4);

        leitor.close();
    }
}
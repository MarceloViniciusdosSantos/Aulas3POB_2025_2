package Ex5.controle;

import Ex5.dominio.CaixaEletronico;
import java.util.Scanner;

public class SimuladorCaixa{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int valor;

        CaixaEletronico contaAtual = new CaixaEletronico();

        contaAtual.conta(10000.0); //Saldo atual

        int op;
        do{
            System.out.println("\n=== MENU ===");
            System.out.println("[1] Realizar saque");
            System.out.println("[2] Exibir Saldo atual");
            System.out.println("[3] Sair");
            System.out.print("Escolha uma opção: ");
            op = leitor.nextInt();

            switch (op) {
                case 1:
                System.out.print("Quanto deseja sacar: ");
                valor = leitor.nextInt();
                contaAtual.sacarValor(valor);
                break;
                case 2:
                contaAtual.exibirSaldo();
                break;
                case 3:
                System.out.print("Saindo...");
                break;
                default:
                System.out.println("Opção inválida!!");
                break;
            }
         } while(op != 4);

        leitor.close();
    }
}
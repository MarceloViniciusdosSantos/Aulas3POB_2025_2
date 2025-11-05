package Lista6.Ex3.controle;

import Lista6.Ex3.dominio.controleElevador;
import java.util.Scanner;

public class simuladorElevador{

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira o total de andares: ");
        int total = leitor.nextInt();
        System.out.println("Insira o andar atual: ");
        int atual = leitor.nextInt();

        controleElevador Elevador = new controleElevador(atual, total);

        int op, qtd;
        do{
            System.out.println("\n=== MENU ===");
            System.out.println("[1] Subir");
            System.out.println("[2] Descer");
            System.out.println("[3] Exibir andar atual");
            System.out.println("[4] Sair");
            System.out.print("Escolha uma opção: ");
            op = leitor.nextInt();

            switch (op) {
                case 1:
                System.out.print("Quantos andares deseja subir? ");
                qtd = leitor.nextInt();
                Elevador.subir(qtd);
                break;
                case 2:
                System.out.print("Quantos andares deseja subir? ");
                qtd = leitor.nextInt();
                Elevador.descer(qtd);
                break;
                case 3:
                Elevador.exibirAndar();
                break;
                case 4:
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
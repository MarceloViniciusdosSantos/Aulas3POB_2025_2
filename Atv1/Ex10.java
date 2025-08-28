package POB3.Atv1;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    
    System.out.print("Digite o seu ano de nascimento: ");
    int ano = leitor.nextInt();
    System.out.print("Digite o seu sexo(M/F): ");
    char sexo = leitor.next().charAt(0);

    int idade = 2025 - ano;

    if((sexo == 'M') && (idade >= 18)){
        System.out.print("Serviço Militar Obrigatório");
    }
    else{
        System.out.print("Isento de serviço militar");
    }
    leitor.close();
    }
}

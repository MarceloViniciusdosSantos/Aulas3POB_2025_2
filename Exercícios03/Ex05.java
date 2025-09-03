/*Números primos em um intervalo*/

package Exercícios03;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o intervalo: ");
        int num1 = leitor.nextInt();
        int num2 = leitor.nextInt();

        int maior, menor;
        //Verificando qual o maior numero informado pelo usuario
        if(num1>num2){
            maior = num1;
            menor = num2;
        }
        else{
            maior = num2;
            menor = num1;
        }

        System.out.print("Números primos: \n\n");
        for(int i = menor; i <= maior; i++){
            boolean primo = true;
            for(int j = 2; j < i; j++){
                if(i%j == 0){
                    primo = false;
                }
            }
            if(primo){
                System.out.print(i + "\n");
            }
        }
        leitor.close();
    }
}

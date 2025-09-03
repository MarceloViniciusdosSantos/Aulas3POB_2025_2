/*Contagem regressiva usando do-while*/

package Exercícios03;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Por qual número devemos começar a contagem?\nN: ");
        int N = leitor.nextInt();

        int contador = N;

        do{
            System.out.println(contador);

            contador--;
        } while(contador>=0);
        
        leitor.close();
    }
}

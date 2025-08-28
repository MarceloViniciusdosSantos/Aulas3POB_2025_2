package POB3.Atv1;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o tamanho 1° lado: ");
        int lado1 = leitor.nextInt();
        System.out.print("Digite o tamanho 2° lado: ");
        int lado2 = leitor.nextInt();
        System.out.print("Digite o tamanho 3° lado: ");
        int lado3 = leitor.nextInt();

        if((lado1 >=(lado2+lado3)) || (lado2>=(lado1+lado3)) || (lado3>=(lado1+lado2))){
            System.out.print("Não forma um triângulo! ");
        }
        else if((lado1 == lado2) && (lado2== lado3)){
            System.out.print("Forma um triângulo Equilatéro!");

        } else if ((lado1 == lado2) || (lado2 == lado3) || (lado1 == lado3)){
            System.out.print("Forma um triângulo Isóceles");
        } else{
            System.out.print("Forma um triângulo Escaleno");
        }
        
    leitor.close();
        }
  }

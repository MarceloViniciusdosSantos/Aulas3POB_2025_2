import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Lista5Ex5 {
    public static void main(String[] args) {
         Scanner leitor = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int valor, op;

        do{
            System.out.println("        MENU:   ");
            System.out.println("[1] Adicionar ");
            System.out.println("[2] Sair");

            System.out.print("\nEscolha uma opção: ");
            op = leitor.nextInt();
            if(op == 1){
                System.out.print("Digite o valor: ");
                valor = leitor.nextInt();
                numeros.add(valor);
            }
        } while(op!=2);
        if(numeros.isEmpty()) System.out.println(" Array vazio! ");
        else{
        Collections.sort(numeros);
        System.out.println("Array ordenado: " + numeros);
    }
        leitor.close();
    }
}

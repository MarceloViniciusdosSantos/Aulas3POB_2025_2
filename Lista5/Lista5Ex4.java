import java.util.ArrayList;
import java.util.Scanner;
//import java.util.Collections;

public class Lista5Ex4 {
    public static void main(String[] args) {
         Scanner leitor = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int valor, contador=0;

        for(int j=0; j<10; j++){
            System.out.println("Digite o valor: ");
            valor = leitor.nextInt();
            numeros.add(valor);
        }
        System.out.println("Qual valor deseja buscar: ");
        valor = leitor.nextInt();

        for(int j=0; j<numeros.size(); j++){
            if(valor == numeros.get(j)) contador++;
        }
        if(contador==0)
            System.out.println("O número não existe no Array!");
            else System.out.println("O número aparece " + contador + " vezes no Array");

            //Utilizando Java Colecctions:
            /* int qtd = Collections.frequency(numeros, valor); 
              if(qtd==0)
            System.out.println("O número não existe no Array!");
            else System.out.println("O número aparece " + qtd + " vezes no Array"); */
        
            leitor.close();
    }
}

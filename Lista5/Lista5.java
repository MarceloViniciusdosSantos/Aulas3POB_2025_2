import java.util.ArrayList;
import java.util.Scanner;

//Exercício 1: Adicionar e Exibir Números
public class Lista5 {
    
   public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        ArrayList<Integer> vetor = new ArrayList<>();
        int numero;
        char escolha;
        boolean parada = false;

        do{
            System.out.print("Digite o numero a ser adicionado no vetor: ");
            numero = leitor.nextInt();
            vetor.add(numero);

            leitor.nextLine();
            
            System.out.print("Deseja continuar?(S/N): ");
            escolha = leitor.nextLine().toUpperCase().charAt(0);

            if(escolha == 'N'){
                parada = true;
            }

        } while(parada == false);

        System.out.println("Numeros adicionados: " + vetor);
        leitor.close();
    }

    
}

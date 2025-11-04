import java.util.ArrayList;
import java.util.Scanner;

public class Lista5Ex2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        int i;
        String nome;

        System.out.println("Informe os nomes: ");
        for(i = 0; i<5; i++){
            
            nome = leitor.nextLine();
            nome = nome.toUpperCase();

            nomes.add(nome);
        }

            System.out.println("Digite o nome a ser excluido no vetor: ");
            nome = leitor.nextLine();
            nome = nome.toUpperCase();

            System.out.println("- Vetor antes da remoção: " + nomes);

            nomes.remove(nome);

            System.out.print("- Vetor após da remoção: " + nomes);

        leitor.close();
    }
}

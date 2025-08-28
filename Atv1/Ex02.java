import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Qual sua idade? ");
        int idade = leitor.nextInt();
        
        if(idade >= 18){
        System.out.println("Maior de idade!!");
        } else{
            System.out.println("Menor idade!!");
        }
        leitor.close();
    }
}

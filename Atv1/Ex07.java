import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número :");
        int num = leitor.nextInt();

       if(num<0){
        System.out.print("Negativo!!");
       }
       else if(num>0){
        System.out.print("Positivo!!");
       }
       else{
        System.out.print("NULO");
       }
       leitor.close();
    }
}

package POB3.Atv1;

import java.util.Scanner;

public class Ex08 {
 public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
 
     System.out.print("Em quantas disciplinas o aluno ficou abaico da média? \nR:");
     int medias = leitor.nextInt();
    
     if(medias == 0){
        System.out.print("Aprovado!!");
     } else if(medias<5){
        System.out.print("Em recuperação!!");
     }
     else{
        System.out.print("Reprovado!!");
     }
     leitor.close();
 }
    }

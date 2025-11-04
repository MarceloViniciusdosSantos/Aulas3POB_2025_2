import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Lista5Ex3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<Double> numeros = new ArrayList<>();
        DecimalFormat df = new DecimalFormat("#.00");
        double i = 0, soma = 0, media;

        while(true){
            System.out.println("Digite o valor: ");
            i = leitor.nextDouble();
            if(i==-1) break;
            numeros.add(i);
        }
        for(int j=0; j<numeros.size();j++){
            soma+=numeros.get(j);
        }
        if (numeros.size() > 0) {
            media = soma / numeros.size();
        } else {
            media = 0;
        }

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + df.format(media));
        leitor.close();
    }
}

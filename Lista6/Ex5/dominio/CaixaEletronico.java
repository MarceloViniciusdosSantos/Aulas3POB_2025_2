package Ex5.dominio;

public class CaixaEletronico{
    double Saldo;

    public void conta (double Saldo){
        this.Saldo = Saldo;
    }

    public void sacarValor(int valor){
        if(valor%10 == 0){
            if(Saldo - valor >= 0){
                Saldo -= valor;
                System.out.println("Saque realizado!!");
            }
            else System.out.println("Saldo insuficiente!!");
        }else System.out.println("Apenas valores multiplos de 10!!");
    }
    public void exibirSaldo(){
        System.out.println("Saldo atual: R$" + Saldo);
    }
}
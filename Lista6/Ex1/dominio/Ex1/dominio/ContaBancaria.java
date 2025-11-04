package Ex1.dominio; // As pastas ficaram uma bagunça o VScode não aceitava o package de outra forma

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular){
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void depositar(double valor){
        if(valor > 0){
            saldo += valor;
            System.out.print("Depósito realizado com sucesso!!");
        }
        else System.out.print("Nenhum valor inserido!!");
    }

    public void sacar(double valor){
        if((saldo-valor) > 0){
            saldo-=valor;
            System.out.print("Saque realizado com sucesso!!");
        }
        else System.out.print("Saldo insuficiente!!");
    }

    public void exibirSaldo(){
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }
}

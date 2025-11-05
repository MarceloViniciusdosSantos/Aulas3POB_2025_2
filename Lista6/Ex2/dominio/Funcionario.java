package dominio;

public class Funcionario{
    private String nome;
    private double salarioBase;

public Funcionario(String nome, double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public void calcularSalarioFinal(String categoria){
        if(categoria == "A") {
        this.salarioBase = this.salarioBase + (this.salarioBase*0.2);
        System.out.println("Bônus adicionado ao salario!! ");}
        else if(categoria == "B") {
        this.salarioBase = this.salarioBase + (this.salarioBase*0.1);
        System.out.println("Bônus adicionado ao salario!! ");}
        else{
            System.out.print("Sem bônus para ser adicionado!! ");
        }
    }

    public void exibirFuncionario(){
        System.out.println("Funcionário: " + this.nome);
        System.out.print("Salário: R$" + this.salarioBase);
    }
}
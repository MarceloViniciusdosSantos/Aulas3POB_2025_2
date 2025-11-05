package Lista6.Ex3.dominio;

public class controleElevador {

    private int andarAtual;
    private int totalAndares;
    
    public controleElevador(int andarAtual, int totalAndares){
        this.andarAtual = andarAtual;
        this.totalAndares = totalAndares;
    }

    public void subir(int qtd){
        if(andarAtual < totalAndares)
        this.andarAtual = this.andarAtual+=qtd;
        else System.out.println("Estamos no último andar!!");
    }

    public void descer(int qtd){
        if(andarAtual > 0)
        this.andarAtual = this.andarAtual-=qtd;
        else System.out.println("Estamos no Térreo!!");
    }

    public void exibirAndar(){
        System.out.print("Andar atual: " + this.andarAtual + "°");
    }
}
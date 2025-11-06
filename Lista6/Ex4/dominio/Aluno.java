package Ex4.dominio;

public class Aluno{
    private String nome;
    private double nota;

    public Aluno(String nome, double nota){
        this.nome = nome;
        this.nota = nota;
    }

    public boolean validarNota(double nota){
        if((nota > 0) && (nota < 10)){
            return true; // nota valida
        }
        return false; //nota invalida
    }

    public String classificarAluno(double nota){
        if(nota < 5) return "Reprovado";
        else if(nota>=7) return "Aprovado";
        else return "Em recuperação";
    }

    public void exibirAluno(){
        System.out.println("Aluno: " + nome);
        System.out.println("Situação: " + classificarAluno(nota));
    }
}

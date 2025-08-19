package src;

public abstract class Contribuinte {
    String nome;
    double renda_anual;

    public abstract double calcularImposto();
    public Contribuinte(String nome, double renda_anual){
        this.nome = nome;
        this.renda_anual = renda_anual;

    }
}




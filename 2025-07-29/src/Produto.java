public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    @Override
    public String toString() {
        return "Informações do produto: "
                + nome
                + ", R$ " + String.format("%.2f", preco)
                + ", " + quantidade + " unidades"
                + ", Total: R$ " + String.format("%.2f", ValorEstoque());
    }

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public double ValorEstoque(){
        return preco * quantidade;
    }
    public void adicionarEstoque(int quantidade){
        this.quantidade += quantidade;
    }
    public void removerEstoque(int quantidade){
       this.quantidade -= quantidade;
    }
    public int getQuantidade() {
        return quantidade;
    }
}
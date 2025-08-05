import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Cadastro de produto: ");
        System.out.println("Nome: ");
        String nome = input.nextLine();

        System.out.println("Preço: ");
        double preco = input.nextDouble();

        System.out.println("Quantidade: ");
        int quantidade = input.nextInt();

        Produto produto = new Produto(nome, preco, quantidade);

        System.out.println(produto.toString());

        System.out.println("Quantidade de produtos que será adicionada ao estoque: ");
        int adiciona = input.nextInt();

        System.out.println("Cadastro atualizado!");
        produto.adicionarEstoque(adiciona);
        System.out.println(produto.toString());


        System.out.println("Quantidade de produtos que será removida do estoque: ");
        int removida = input.nextInt();
        produto.removerEstoque(removida);

        System.out.println(produto.toString());
    }
}
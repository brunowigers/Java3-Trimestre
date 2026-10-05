public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    // 1. Construtor
    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    // 2. Getters para todos os atributos
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    // 3. Setter para preco com validação
    public void setPreco(double preco) {
        if (preco < 0) {
            System.out.println("Erro: O preço não pode ser negativo.");
        } else {
            this.preco = preco;
        }
    }

    // 4. Métodos para estoque
    public void adicionarEstoque(int quantidade) {
        this.quantidadeEstoque += quantidade;
    }

    public void removerEstoque(int quantidade) {
        if (quantidade <= this.quantidadeEstoque) {
            this.quantidadeEstoque -= quantidade;
        } else {
            System.out.println("Erro: Estoque insuficiente.");
        }
    }
}
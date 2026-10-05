public class Carro extends Veiculo {
    private int quantidadePortas;

    // Construtor chamando super()
    public Carro(String marca, String modelo, int quantidadePortas) {
        super(marca, modelo);
        this.quantidadePortas = quantidadePortas;
    }

    // Método para exibir informações
    public void exibirInfo() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Quantidade de portas: " + this.quantidadePortas);
    }
}
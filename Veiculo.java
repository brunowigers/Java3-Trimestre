public class Veiculo {
    protected String marca;
    protected String modelo;

    // Construtor
    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Método buzinar
    public void buzinar() {
        System.out.println("Bi bi!");
    }
}
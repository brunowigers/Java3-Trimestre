public class main4 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Bruno", 6000.00, "TI");

        gerente.gerenciar();

        gerente.aumentarSalario(10);
        System.out.println("Novo salário de " + gerente.getNome() + ": R$ " + gerente.getSalario());
    }
}
public class main2 {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.setTitular("Ana");
        conta.setSaldo(500.00);

        conta.depositar(200.00);
        System.out.println("Saldo após depósito: R$ " + conta.getSaldo());

        conta.sacar(150.00);
        System.out.println("Saldo após saque: R$ " + conta.getSaldo());

        conta.sacar(1000.00); 
    }
}
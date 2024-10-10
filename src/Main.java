public class Main {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Felipe Martins");

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Carla Maria");

        Conta ccFelipe = new ContaCorrente(cliente1);
        Conta poupancaMaria = new ContaPoupanca(cliente2);

        ccFelipe.depositar(300);
        ccFelipe.sacar(50);
        ccFelipe.imprimirExtrato();
        ccFelipe.transferir(100, poupancaMaria);

        System.out.println("\n Saldos após a transferência: \n");
        ccFelipe.imprimirExtrato();
        poupancaMaria.imprimirExtrato();
    }
}

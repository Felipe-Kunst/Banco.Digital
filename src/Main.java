public class Main {

    public static void main(String[] args) {
        Cliente felipe = new Cliente();
        felipe.setNome("Felipe");

        Conta cc = new ContaCorrente(felipe);

        cc.depositar(200);
        cc.imprimirExtrato();
        cc.sacar(50);
        cc.imprimirExtrato();
    }
}

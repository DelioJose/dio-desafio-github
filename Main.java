public class Main {
    public static void main(String[] args){
        Cliente delio = new Cliente();
        delio.setNome("Delio");

        Conta cc = new ContaCorrente(delio);
        Conta poupanca = new ContaPoupança(delio);

        cc.depositar(100);
        cc.tranferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}

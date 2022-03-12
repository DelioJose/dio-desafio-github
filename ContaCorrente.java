public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente){
        super(cliente);
    }

    @Override
    public void tranferir(double valor, Conta contaDestino) {

    }

    @Override
    public void imprimirExtrato(){
        System.out.println("===Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
    }


}



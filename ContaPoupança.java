public class ContaPoupança extends Conta{

    public ContaPoupança(Cliente cliente){
        super(cliente);
    }

    @Override
    public void tranferir(double valor, Conta contaDestino) {

    }

    @Override
    public void imprimirExtrato(){
        System.out.println("===Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
    }


}


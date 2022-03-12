package subsistema2.cep;

import projetojavanovo.gof.SingletonEager;

public class CepApi {
    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }
    public static CepApi getInstancia() {
        return  instancia;
    }
    public String recuperarCidade(String cep){
        return "Chefe";
    }
    public String recuperarEstado(String cep){
        return "DJ";
    }
}


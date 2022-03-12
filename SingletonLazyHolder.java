package projetojavanovo.gof;

/**
 * Singleton "apressado"
 *
 * @author deliojose
 */
public class SingletonLazyHolder {

        private static  SingletonLazyHolder instancia = new  SingletonLazyHolder();

        private  SingletonLazyHolder() {
            super();
        }
        public static  SingletonLazyHolder getInstancia() {
            return instancia;
        }

    }



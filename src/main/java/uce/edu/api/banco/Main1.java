package uce.edu.api.banco;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main1 {
    public static void main(String[] args) {

      Quarkus.run(App.class,args);

    }

    public static class App implements QuarkusApplication{

        @Inject
        private CuentaService service;

        @Override
        public int run(String... args) throws Exception {
            
        Cuenta cuenta = new Cuenta(
            "Lore Muenala", "1234567890", "lore@gmail.com", 1000.00);
            this.service.registrar(cuenta);

        return 0;
        }
    }

}

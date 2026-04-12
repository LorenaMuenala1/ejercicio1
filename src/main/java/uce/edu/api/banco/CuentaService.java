package uce.edu.api.banco;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class CuentaService {
    
    @Inject
    private NotificadorCuenta notificador;

    public void registrar(Cuenta cuenta) {

        System.out.println("Registrando cuenta...");
        System.out.println("Nombre: " + cuenta.getNombreCliente());
        System.out.println("Cedula: " + cuenta.getCedula());

        System.out.println("Guardando en base de datos...");

        // Inyección 
        notificador.enviarBienvenida(cuenta.getCorreo());
    }



}

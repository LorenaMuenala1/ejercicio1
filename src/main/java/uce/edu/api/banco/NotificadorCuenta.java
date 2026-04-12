package uce.edu.api.banco;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class NotificadorCuenta {

     public void enviarBienvenida(String correo) {
        System.out.println("Enviando correo de bienvenida a: " + correo);
        System.out.println("Cuenta creada exitosamente y bienvenida enviada");

    }

}

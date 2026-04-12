package uce.edu.api.banco;

public class Cuenta {
    private String nombreCliente;
    private String cedula;
    private String correo;
    private double saldo;

    public Cuenta() {}

    public Cuenta(String nombreCliente,String cedula, String correo, double saldo) {
        this.nombreCliente = nombreCliente;
        this.cedula = cedula;
        this.correo = correo;
        this.saldo = saldo;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

   

}

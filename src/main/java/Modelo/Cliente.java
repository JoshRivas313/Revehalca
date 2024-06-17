package Modelo;

public class Cliente {
    

    private int DNICliente;
    private String nombreCliente, apellidoCliente;

    public Cliente() {
    }

    public Cliente(int DNICliente, String nombreCliente, String apellidoCliente) {
        this.DNICliente = DNICliente;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
    }

    public int getDNICliente() {
        return DNICliente;
    }

    public void setDNICliente(int dNICliente) {
        DNICliente = dNICliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    

}

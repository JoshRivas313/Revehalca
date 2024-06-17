package Modelo;

import java.time.LocalTime;
import java.util.*;

public class Comprobante {
 
    private int idComprobante;
    private Pedido pedido;
    private MetodoPago metodoPago;


    public Comprobante() {
    }

    public Comprobante(int idComprobante, Pedido pedido, MetodoPago metodoPago) {
        this.idComprobante = idComprobante;
        this.pedido = pedido;
        this.metodoPago = metodoPago;
    }


    


    //Falta Metodo Calcular TotalComprobante

    public Date FechaIngreso(){
        Date fecha = new Date();
        return fecha;
    }

     public LocalTime HoraPedido() {
    LocalTime hora = LocalTime.now();
    
    return hora;
}



    public int getIdComprobante() {
        return idComprobante;
    }

    public void setIdComprobante(int idComprobante) {
        this.idComprobante = idComprobante;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }




}

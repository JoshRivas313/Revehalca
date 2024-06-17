package Modelo;

import java.time.*;
import java.util.*;

public class Pedido {
    private int idPedido;
    private Cliente cliente;
    private Usuario usuario;
    private Mesa mesa;
    private EstadoPedido estadoPedido;


    public Pedido() {
    }

    public Pedido(int idPedido, Cliente cliente, Usuario usuario, Mesa mesa, EstadoPedido estadoPedido) {
        this.idPedido = idPedido;
        this.cliente = cliente;
        this.usuario = usuario;
        this.mesa = mesa;
        this.estadoPedido = estadoPedido;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public EstadoPedido getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(EstadoPedido estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    
    public Date FechaPedido(){
        Date fecha = new Date();
        return fecha;
    }

    public LocalTime HoraPedido() {
    LocalTime hora = LocalTime.now();
    return hora;
}




 




    

}

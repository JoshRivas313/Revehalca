package Modelo;

import java.util.*;

public class Inventario {
    private int idInventario;

    private List<Producto> producto;

    private int cantidadDisponible;
    

    public Inventario() {
    }

   
    public Inventario(int idInventario, List<Producto> producto, int cantidadDisponible) {
        this.idInventario = idInventario;
        this.producto = producto;
        this.cantidadDisponible = cantidadDisponible;
    }


    public int getIdInventario() {
        return idInventario;
    }


    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }


    public List<Producto> getProducto() {
        return producto;
    }


    public int getCantidadDisponible() {
        return cantidadDisponible;
    }


    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }


    public void setProducto(List<Producto> producto) {
        this.producto = producto;
    }


    


    
}

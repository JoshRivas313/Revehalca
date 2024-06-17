package Modelo;

public class Inventario {
    private int idInventario;
    private Producto producto;
    private int cantidadDisponible;
    

    public Inventario() {
    }

   
    public Inventario(int idInventario, Producto producto, int cantidadDisponible) {
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


    public Producto getProducto() {
        return producto;
    }


    public void setProducto(Producto producto) {
        this.producto = producto;
    }


    public int getCantidadDisponible() {
        return cantidadDisponible;
    }


    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }


    


    
}

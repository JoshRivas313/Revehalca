package Modelo;

public class Producto {

    private int idProducto;
    private CategoriaProduco categoriaProduco;
    private String nombreProducto;
    private EstadoProducto estadoProducto;
    private double precioProducto;

    public Producto() {
    }

    public Producto(int idProducto, CategoriaProduco categoriaProduco, String nombreProducto,
            EstadoProducto estadoProducto, double precioProducto) {
        this.idProducto = idProducto;
        this.categoriaProduco = categoriaProduco;
        this.nombreProducto = nombreProducto;
        this.estadoProducto = estadoProducto;
        this.precioProducto = precioProducto;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public CategoriaProduco getCategoriaProduco() {
        return categoriaProduco;
    }

    public void setCategoriaProduco(CategoriaProduco categoriaProduco) {
        this.categoriaProduco = categoriaProduco;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public EstadoProducto getEstadoProducto() {
        return estadoProducto;
    }

    public void setEstadoProducto(EstadoProducto estadoProducto) {
        this.estadoProducto = estadoProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    
    
 



    
}

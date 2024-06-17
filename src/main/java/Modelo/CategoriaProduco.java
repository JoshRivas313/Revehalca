package Modelo;

public class CategoriaProduco {
    private int idCategoriaProducto;
    private String nombreCategoria;

    public CategoriaProduco() {
    }

    public CategoriaProduco(int idCategoriaProducto, String nombreCategoria) {
        this.idCategoriaProducto = idCategoriaProducto;
        this.nombreCategoria = nombreCategoria;
    }

    public int getIdCategoriaProducto() {
        return idCategoriaProducto;
    }

    public void setIdCategoriaProducto(int idCategoriaProducto) {
        this.idCategoriaProducto = idCategoriaProducto;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    
}

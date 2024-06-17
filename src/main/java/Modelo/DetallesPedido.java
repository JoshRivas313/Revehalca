package Modelo;

public class DetallesPedido {
    private int idDetallesPedido;
    private Pedido pedido;
    private Producto producto;
    private int cantidadPedido;
    
    public DetallesPedido() {
    }

    public DetallesPedido(int idDetallesPedido, Pedido pedido, Producto producto, int cantidadPedido) {
        this.idDetallesPedido = idDetallesPedido;
        this.pedido = pedido;
        this.producto = producto;
        this.cantidadPedido = cantidadPedido;
    }

    public int getIdDetallesPedido() {
        return idDetallesPedido;
    }

    public void setIdDetallesPedido(int idDetallesPedido) {
        this.idDetallesPedido = idDetallesPedido;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidadPedido() {
        return cantidadPedido;
    }

    public void setCantidadPedido(int cantidadPedido) {
        this.cantidadPedido = cantidadPedido;
    }


    public double CalcularCantidadPedido(){

        double precioTotalPedidoElemento = this.cantidadPedido * this.producto.getPrecioProducto();

        return precioTotalPedidoElemento;
    }
    



    
}

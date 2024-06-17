package Modelo;

import java.util.*;


public class Ingreso {
    private int idIngreso;
    private Comprobante comprobante;

    
    public Ingreso() {
    }

    public Ingreso(int idIngreso, Comprobante comprobante) {
        this.idIngreso = idIngreso;
        this.comprobante = comprobante;
    }

    
    public int getIdIngreso() {
        return idIngreso;
    }

    public void setIdIngreso(int idIngreso) {
        this.idIngreso = idIngreso;
    }

    

    public Comprobante getComprobante() {
        return comprobante;
    }

    public void setComprobante(Comprobante comprobante) {
        this.comprobante = comprobante;
    }

    public Date FechaIngreso(){
        Date fecha = new Date();
        return fecha;
    }


    public double MontoIngreso(){
        double monto = 0;
        monto = comprobante.PrecioTotal();
        return monto;
    }


   
}

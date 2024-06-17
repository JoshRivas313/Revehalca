package Modelo;

public class Egreso {
    private int idEgreso;
    private String tipoEgreso;
    private String descripcionEgreso;
    private double montoEgreso;

    public Egreso() {
    }

    public Egreso(int idEgreso, String tipoEgreso, String descripcionEgreso, double montoEgreso) {
        this.idEgreso = idEgreso;
        this.tipoEgreso = tipoEgreso;
        this.descripcionEgreso = descripcionEgreso;
        this.montoEgreso = montoEgreso;
    }
    

    public int getIdEgreso() {
        return idEgreso;
    }

    public void setIdEgreso(int idEgreso) {
        this.idEgreso = idEgreso;
    }

    public String getTipoEgreso() {
        return tipoEgreso;
    }

    public void setTipoEgreso(String tipoEgreso) {
        this.tipoEgreso = tipoEgreso;
    }

    public String getDescripcionEgreso() {
        return descripcionEgreso;
    }

    public void setDescripcionEgreso(String descripcionEgreso) {
        this.descripcionEgreso = descripcionEgreso;
    }

    public double getMontoEgreso() {
        return montoEgreso;
    }

    public void setMontoEgreso(double montoEgreso) {
        this.montoEgreso = montoEgreso;
    }


    
}

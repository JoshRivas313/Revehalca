package Modelo;

public class Mesa {
    
    private int idMesa;
    private int CapacidadMesa;
    private String EstadoMesa;


    public Mesa() {
    }

    public Mesa(int idMesa, int CapacidadMesa, String EstadoMesa) {
        this.idMesa = idMesa;
        this.CapacidadMesa = CapacidadMesa;
        this.EstadoMesa = EstadoMesa;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public int getCapacidadMesa() {
        return CapacidadMesa;
    }

    public void setCapacidadMesa(int capacidadMesa) {
        CapacidadMesa = capacidadMesa;
    }

    public String getEstadoMesa() {
        return EstadoMesa;
    }

    public void setEstadoMesa(String estadoMesa) {
        EstadoMesa = estadoMesa;
    }

    
}

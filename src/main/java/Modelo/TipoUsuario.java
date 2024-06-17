
package Modelo;


public class TipoUsuario {
    private int idTipoUsuario;
    private String nombreUsuario,deescripcionUsuario;

    public TipoUsuario() {
    }

    
    public TipoUsuario(int idTipoUsuario, String nombreUsuario, String deescripcionUsuario) {
        this.idTipoUsuario = idTipoUsuario;
        this.nombreUsuario = nombreUsuario;
        this.deescripcionUsuario = deescripcionUsuario;
    }

    public int getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(int idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getDeescripcionUsuario() {
        return deescripcionUsuario;
    }

    public void setDeescripcionUsuario(String deescripcionUsuario) {
        this.deescripcionUsuario = deescripcionUsuario;
    }
    
    
    
    
}

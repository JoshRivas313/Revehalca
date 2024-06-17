
package Modelo;


public class Usuario {
    private int idUsuario;
    private String password, nombreUsuario;
    private TipoUsuario tipoUsuario;

    public Usuario() {
    }

    
    public Usuario(int idUsuario, String password, String nombreUsuario, TipoUsuario tipoUsuario) {
        this.idUsuario = idUsuario;
        this.password = password;
        this.nombreUsuario = nombreUsuario;
        this.tipoUsuario = tipoUsuario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
   
   
    

   
    
    
}

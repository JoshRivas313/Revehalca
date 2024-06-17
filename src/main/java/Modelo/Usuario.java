
package Modelo;


public class Usuario {
    private int idUsuario;
    private TipoUsuario tipoUsuario;
    private String password, nombreUsuario;
  

    public Usuario() {
    }


    public Usuario(int idUsuario, TipoUsuario tipoUsuario, String password, String nombreUsuario) {
        this.idUsuario = idUsuario;
        this.tipoUsuario = tipoUsuario;
        this.password = password;
        this.nombreUsuario = nombreUsuario;
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

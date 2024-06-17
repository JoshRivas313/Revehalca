package Modelo;

public class PerfilUsuario {
    private int idPerfilUsuario , DNI;
    private String nombrePerfil , apellidoPerfil, correoUsuario,nacionalidad,distrito, direccion;
    private Usuario usuario;

    public PerfilUsuario() {
    }

    public PerfilUsuario(int idPerfilUsuario, int DNI, String nombrePerfil, String apellidoPerfil, String correoUsuario, String nacionalidad, String distrito, String direccion, Usuario usuario) {
        this.idPerfilUsuario = idPerfilUsuario;
        this.DNI = DNI;
        this.nombrePerfil = nombrePerfil;
        this.apellidoPerfil = apellidoPerfil;
        this.correoUsuario = correoUsuario;
        this.nacionalidad = nacionalidad;
        this.distrito = distrito;
        this.direccion = direccion;
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }


    public int getIdPerfilUsuario() {
        return idPerfilUsuario;
    }

    public void setIdPerfilUsuario(int idPerfilUsuario) {
        this.idPerfilUsuario = idPerfilUsuario;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getNombrePerfil() {
        return nombrePerfil;
    }

    public void setNombrePerfil(String nombrePerfil) {
        this.nombrePerfil = nombrePerfil;
    }

    public String getApellidoPerfil() {
        return apellidoPerfil;
    }

    public void setApellidoPerfil(String apellidoPerfil) {
        this.apellidoPerfil = apellidoPerfil;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    

    

}


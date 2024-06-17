package Controlador;

import Modelo.*;
import jakarta.faces.bean.*;
import java.io.*;
import java.util.*;

@ManagedBean(name = "beanperfilusuario")
@ViewScoped

public class BeanPerfilUsuario implements Serializable {

    private static final long serialVersionUID = 1L;
    private List<PerfilUsuario> lstPerfilUsuario;

    public BeanPerfilUsuario() {
       
        lstPerfilUsuario = new ArrayList<>();
        
       
    }


    public List<PerfilUsuario> getLstPerfilUsuario() {
        return lstPerfilUsuario;
    }


    public PerfilUsuario buscarPerfilUsuario(int id) {
        for (PerfilUsuario perfilUsuario : lstPerfilUsuario) {
            if (perfilUsuario.getIdPerfilUsuario() == id) {
                return perfilUsuario;
            }
        }
        return null;
    }

    public void eliminarPerfilUsuario(int id) {
        PerfilUsuario perfilUsuario = buscarPerfilUsuario(id);
        if (perfilUsuario != null) {
            lstPerfilUsuario.remove(perfilUsuario);
        }
    }



    public void agregarPerfilUsuario(int idPerfilUsuario, int DNI, String nombrePerfil, String apellidoPerfil, String correoUsuario, String nacionalidad, String distrito, String direccion, Usuario usuario) {
        PerfilUsuario perfilUsuario = new PerfilUsuario(idPerfilUsuario, DNI, nombrePerfil, apellidoPerfil, correoUsuario, nacionalidad, distrito, direccion, usuario);
        lstPerfilUsuario.add(perfilUsuario);
    }



  




}

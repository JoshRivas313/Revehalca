package Controlador;

import Modelo.*;
import jakarta.faces.bean.*;
import java.io.*;
import java.util.*;

@ManagedBean(name = "beantipousuario")  
@ViewScoped

public class BeanTipoUsuario implements Serializable {
     private static final long serialVersionUID = 1L;
     private  List<TipoUsuario> lstTipoUsuario;

    public BeanTipoUsuario() {
        lstTipoUsuario = new ArrayList<>();
        
        lstTipoUsuario.add(new TipoUsuario(1, "Administador", ""));
        lstTipoUsuario.add(new TipoUsuario(2, "Gerente", ""));
        lstTipoUsuario.add(new TipoUsuario(3, "Cajero", ""));
        lstTipoUsuario.add(new TipoUsuario(4, "Mozo", ""));
    }



    public List<TipoUsuario> getLstTipoUsuario() {
        return lstTipoUsuario;
    }
    

    public TipoUsuario buscarTipoUsuario(int id) {
        for (TipoUsuario tipoUsuario : lstTipoUsuario) {
            if (tipoUsuario.getIdTipoUsuario() == id) {
                return tipoUsuario;
            }
        }
        return null;
    }
     


     
}

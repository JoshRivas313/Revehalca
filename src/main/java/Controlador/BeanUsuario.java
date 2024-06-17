package Controlador;

import Modelo.*;
import jakarta.faces.bean.*;
import java.io.*;
import java.util.*;


@ManagedBean(name = "beanusuario")  
@ViewScoped
public class BeanUsuario implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    
    private List<Usuario> lstUsuario ;
    
    
            
    public BeanUsuario() {
       lstUsuario = new ArrayList<>();

    }

    



    
}

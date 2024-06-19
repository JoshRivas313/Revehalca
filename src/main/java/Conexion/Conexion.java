package Conexion;

import java.sql.*;

public class Conexion {
    private static Conexion instancia;
    
    private Connection cx;
    
    private final String bd = "utp";
    private final String url = "jdbc:mysql://localhost:3306/";
    private final String user = "root";
    private final String password = "";
    private final String driver = "com.mysql.cj.jdbc.Driver";

    // Constructor privado para evitar la creación de instancias directamente
    private Conexion() {
    }

    // Método estático para obtener la única instancia de la clase
    public static Conexion getInstancia() {
        if (instancia == null) {
            instancia = new Conexion();
        }
        return instancia;
    }
    
    

    public Connection conectar() {
        if (cx == null) {
            try {
                Class.forName(driver);
                cx = DriverManager.getConnection(url + bd, user, password);
                System.out.println("SE CONECTÓ A BD " + bd);
            } catch (ClassNotFoundException | SQLException ex) {
                System.out.println("NO SE CONECTÓ A BD " + bd);
                // Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return cx;
    }

    public void desconectar() {
        if (cx != null) {
            try {
                cx.close();
                cx = null;
                System.out.println("SE DESCONECTÓ DE BD " + bd);
            } catch (SQLException ex) {
                System.out.println("ERROR AL DESCONECTAR DE BD " + bd);
                // Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    // Método main para probar la conexión
    public static void main(String[] args) {
        Conexion conexion = Conexion.getInstancia();
        Connection conn = conexion.conectar();
        
        if (conn != null) {
            System.out.println("CONEXIÓN ESTABLECIDA");
            conexion.desconectar();
        } else {
            System.out.println("FALLO AL ESTABLECER CONEXIÓN");
        }
    }
}

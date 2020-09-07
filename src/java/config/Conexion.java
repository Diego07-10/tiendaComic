
package config;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {
    Connection con;
    String url="jdbc:mysql://localhost:3306/tienda";
    String usuario="usuariobd";
    String password="educacion";
    public Connection Conexion(){
    try {
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection(url,usuario,password);    
    } catch (Exception e){
    
    }
    return con;
    }
}

package Modulo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class UsuarioDao {
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public Usuario validar(String usuario, String password){
        Usuario us=new Usuario();
        String sql= "select * from usuario where usuario=? and password=?";
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setString(2, password);
            rs=ps.executeQuery();
            while (rs.next()){
                us.setId(rs.getInt("id"));
                us.setUsuario(rs.getString("usuario"));
                us.setPassword(rs.getString("password"));
            }
        } catch (Exception e){
        }
        return us;
    }
    
     
}

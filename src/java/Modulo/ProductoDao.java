
package Modulo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class ProductoDao {
    Conexion cn= new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int p;
    
 
    //*operaciones CRUD*//

  public List listar(){
      String sql="select * from juego";
      List<Producto>lista=new ArrayList<>();
      try {
          con=cn.Conexion();
          ps=con.prepareStatement(sql);
          rs=ps.executeQuery();
          while (rs.next()) {
                Producto pr=new Producto();
                pr.setId(rs.getInt(1));
                pr.setCodigo(rs.getString(2));
                pr.setTitulo(rs.getString(3));
                pr.setProtagonista(rs.getString(4));
                pr.setDirector(rs.getString(5));
                pr.setMarca(rs.getString(6));
                pr.setConsola(rs.getString(7));
                pr.setCantidad(rs.getString(8));
                pr.setPrecio(rs.getString(9));
                lista.add(pr);
          }
      } catch (Exception e) {
      }
      return lista;
  }
    
    public int agregar(Producto pr){
        String sql="insert into juego(codigo, titulo, protagonista, director, marca, consola, cantidad, precio) values (?,?,?,?,?,?,?,?)";
          try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, pr.getCodigo());
            ps.setString(2, pr.getTitulo());
            ps.setString(3, pr.getProtagonista());
            ps.setString(4, pr.getDirector());
            ps.setString(5, pr.getMarca());
            ps.setString(6, pr.getConsola());
            ps.setString(7, pr.getCantidad());
            ps.setString(8, pr.getPrecio());
            ps.executeUpdate();
          } catch (Exception e) {
          }
          return p;
    }
    public Producto listarId (int id){
        
        Producto pro=new Producto();
        String sql="select * from juego where id="+id;
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
                pro.setId(rs.getInt(1));
                pro.setCodigo(rs.getString(2));
                pro.setTitulo(rs.getString(3));
                pro.setProtagonista(rs.getString(4));
                pro.setDirector(rs.getString(5));
                pro.setMarca(rs.getString(6));
                pro.setConsola(rs.getString(7));
                pro.setCantidad(rs.getString(8));
                pro.setPrecio(rs.getString(9));
            }
        } catch (Exception e){
        }
        return pro;
    }
    
    public int actualizar(Producto pr){
           String sql="update juego set codigo=?, titulo=?, protagonista=?, director=?, marca=?, consola=?, cantidad=?, precio=? where id=?";
          try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, pr.getCodigo());
            ps.setString(2, pr.getTitulo());
            ps.setString(3, pr.getProtagonista());
            ps.setString(4, pr.getDirector());
            ps.setString(5, pr.getMarca());
            ps.setString(6, pr.getConsola());
            ps.setString(7, pr.getCantidad());
            ps.setString(8, pr.getPrecio());
            ps.setInt(9, pr.getId());
            ps.executeUpdate();
          } catch (Exception e) {
          }
          return p;
    }
    
    public void delete(int id){
         String sql="delete from juego where id="+id;
          try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
          } catch (Exception e) {
          }
    }
}

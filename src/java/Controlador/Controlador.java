
package Controlador;

import Modulo.Alquiler;
import Modulo.Cliente;
import Modulo.ClienteDao;
import Modulo.Producto;
import Modulo.ProductoDao;
import Modulo.Usuario;
import Modulo.UsuarioDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Controlador extends HttpServlet {
    
        Usuario us=new Usuario();
        UsuarioDao udao=new UsuarioDao();
        Cliente cl=new Cliente();
        ClienteDao cdao=new ClienteDao();
        Producto pr=new Producto();
        ProductoDao pdao=new ProductoDao();
        int ide;
        int pde;
        
        Alquiler al=new Alquiler();
        List<Alquiler>lista=new ArrayList<>();
        int codCliente;
        int codJuego;
        String nombreCliente;
        String Consola;
        String titulo;
        double precio;
        
        
        
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String menu = request.getParameter("menu");
            String accion=request.getParameter("accion");
             if(menu.equals("principal")){
                 request.getRequestDispatcher("principal.jsp").forward(request, response);
            }
            
            if(menu.equals("clientes")){
                /***************CLIENTE*********************/
            /*********************************************************/
                    switch(accion){
                        case "Listar":
                           List lista=cdao.listar();
                          request.setAttribute("cliente", lista);
                        break;
                        case "Agregar":
                            String cedula=request.getParameter("txtced");
                            String nombre=request.getParameter("txtnom");
                            String telefono=request.getParameter("txttel");
                            String correo=request.getParameter("txtcor");
                            String edad=request.getParameter("txtedad");
                            String direccion=request.getParameter("txtdir");
                            cl.setCedula(cedula);
                            cl.setNombre(nombre);
                            cl.setTelefono(telefono);
                            cl.setCorreo(correo);
                            cl.setEdad(edad);
                            cl.setDireccion(direccion);
                            cdao.agregar(cl);
                            request.getRequestDispatcher("Controlador?menu=clientes&accion=Listar").forward(request, response);
                        break;
                        case "Editar":
                            ide=Integer.parseInt(request.getParameter("id"));
                            Cliente e=cdao.listarId(ide);
                            request.setAttribute("clientes", e);
                            request.getRequestDispatcher("Controlador?menu=clientes&accion=Listar").forward(request, response);
                          break;
                        case "Actualizar":
                            String cedula1=request.getParameter("txtced");
                            String nombre1=request.getParameter("txtnom");
                            String telefono1=request.getParameter("txttel");
                            String correo1=request.getParameter("txtcor");
                            String edad1=request.getParameter("txtedad");
                            String direccion1=request.getParameter("txtdir");
                            cl.setCedula(cedula1);
                            cl.setNombre(nombre1);
                            cl.setTelefono(telefono1);
                            cl.setCorreo(correo1);
                            cl.setEdad(edad1);
                            cl.setDireccion(direccion1);
                            cl.setId(ide);
                            cdao.actualizar(cl);
                            request.getRequestDispatcher("Controlador?menu=clientes&accion=Listar").forward(request, response);
                        break;
                        case "Delete":
                            ide=Integer.parseInt(request.getParameter("id"));
                            cdao.delete(ide);
                            request.getRequestDispatcher("Controlador?menu=clientes&accion=Listar").forward(request, response);
                          break;
                            default:
                               throw new AssertionError();
                    }

                request.getRequestDispatcher("clientes.jsp").forward(request, response);
            } 
            
            /***************VIDEOJUEGO*********************/
            /*********************************************************/
            
            if(menu.equals("productos")){
                    switch(accion){
                        case "Listar":
                           List lista=pdao.listar();
                           request.setAttribute("producto", lista);
                        break;
                        case "Agregar":
                            String codigo=request.getParameter("txtcod");
                            String titulo=request.getParameter("txttit");
                            String protagonista=request.getParameter("txtpro");
                            String director=request.getParameter("txtdir");
                            String marca=request.getParameter("txtmar");
                            String consola=request.getParameter("txtcon");
                            String cantidad=request.getParameter("txtcan");
                            String precio=request.getParameter("txtpre");
                            pr.setCodigo(codigo);
                            pr.setTitulo(titulo);
                            pr.setProtagonista(protagonista);
                            pr.setDirector(director);
                            pr.setMarca(marca);
                            pr.setConsola(consola);
                            pr.setCantidad(cantidad);
                            pr.setPrecio(precio);
                            pdao.agregar(pr);
                            request.getRequestDispatcher("Controlador?menu=productos&accion=Listar").forward(request, response);
                        break;
                        case "Editar":
                            pde=Integer.parseInt(request.getParameter("id"));
                            Producto p=pdao.listarId(pde);
                            request.setAttribute("productos", p);
                            request.getRequestDispatcher("Controlador?menu=productos&accion=Listar").forward(request, response);
                          break;
                        case "Actualizar":
                            String codigo2=request.getParameter("txtcod");
                            String titulo2=request.getParameter("txttit");
                            String protagonista2=request.getParameter("txtpro");
                            String director2=request.getParameter("txtdir");
                            String marca2=request.getParameter("txtmar");
                            String consola2=request.getParameter("txtcon");
                            String cantidad2=request.getParameter("txtcan");
                            String precio2=request.getParameter("txtpre");
                            pr.setCodigo(codigo2);
                            pr.setTitulo(titulo2);
                            pr.setProtagonista(protagonista2);
                            pr.setDirector(director2);
                            pr.setMarca(marca2);
                            pr.setConsola(consola2);
                            pr.setCantidad(cantidad2);
                            pr.setPrecio(precio2);
                            pr.setId(pde);
                            pdao.actualizar(pr);
                            request.getRequestDispatcher("Controlador?menu=productos&accion=Listar").forward(request, response);
                        break;
                        case "Delete":
                            pde=Integer.parseInt(request.getParameter("id"));
                            pdao.delete(pde);
                            request.getRequestDispatcher("Controlador?menu=productos&accion=Listar").forward(request, response);
                          break;
                            default:
                               throw new AssertionError();
                    }
                request.getRequestDispatcher("productos.jsp").forward(request, response);
            }
            
            if(menu.equals("alquiler")){
               /***************ALQUILER*********************/
            /*********************************************************/
                switch(accion){
                   case "BuscarCliente":
                   String cedula=request.getParameter("codigocliente");
                     cl.setCedula(cedula);
                     cl=cdao.buscar(cedula);
                     request.setAttribute("c", cl);
                     break;
                   case "BuscarProducto":
                      int id=Integer.parseInt(request.getParameter("codigoproducto"));
                      pr=pdao.listarId(id);
                      request.setAttribute("pro", pr);
                   break;
                   case "Agregar":
                       codCliente=cl.getId();
                       codJuego=pr.getId();
                       nombreCliente=request.getParameter("nombrecliente");
                       Consola=request.getParameter("consola");
                       titulo=request.getParameter("nombreproducto");
                       precio=Double.parseDouble(request.getParameter("precio"));
                       al.setId_cliente(codCliente);
                       al.setId_juego(codJuego);
                       al.setNombreCliente(nombreCliente);
                       al.setTipoConsola(Consola);
                       al.setTituloJuego(titulo);
                       al.setPrecioAlquiler(precio);
                       lista.add(al);
                       request.setAttribute("lista", lista);
                    break;
                         default:
                              // throw new AssertionError();
                }
                request.getRequestDispatcher("alquiler.jsp").forward(request, response);
            } 
            
            if(menu.equals("consultas")){
                
                request.getRequestDispatcher("consultas.jsp").forward(request, response);
            }
         
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

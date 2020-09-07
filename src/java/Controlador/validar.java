
package Controlador;

import Modulo.Cliente;
import Modulo.ClienteDao;
import Modulo.Producto;
import Modulo.ProductoDao;
import Modulo.Usuario;
import Modulo.UsuarioDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class validar extends HttpServlet {
    
    UsuarioDao udao=new UsuarioDao();
    Usuario  us=new Usuario(); 
    Cliente cl=new Cliente();
    ClienteDao cdao=new ClienteDao();
    Producto pr=new Producto();
    ProductoDao pdao=new ProductoDao();
  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet validar</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet validar at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String accion=request.getParameter("accion");
            if(accion.equalsIgnoreCase("Ingresar")){
               String usuario=request.getParameter("txtuser");
               String password=request.getParameter("txtpassword");
               us=udao.validar(usuario, password);
               if (us.getUsuario()!=null){
                   request.setAttribute("usuario", us);
                   request.getRequestDispatcher("Controlador?menu=principal").forward(request, response);
               }else {
                   request.getRequestDispatcher("index.jsp").forward(request, response);
               }
            }else {
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

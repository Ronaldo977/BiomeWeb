package Controlador;


import Modelo.ConexMysql;
import Modelo.Empleado;
import Modelo.EmpleadoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ronaldo
 */
public class Validar extends HttpServlet {

   
    EmpleadoDAO dao =new EmpleadoDAO();
    Empleado p= new Empleado();
    ConexMysql no= new ConexMysql();


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Validar</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Validar at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        
        String accion=request.getParameter("accion");
        
        if (accion.equalsIgnoreCase("Ingresar"))
        {
            String user=request.getParameter("txtdpi");
            String pass=request.getParameter("txtnom");
            p=dao.validare(user, pass); 
            if(p.getDpi()!=null)
            {
                request.getRequestDispatcher("Mostrar.jsp").forward(request,response); 
             
            }else
            {
                request.getRequestDispatcher("index.jsp").forward(request,response); 
                
            } 
        }
        
        
        if (accion.equalsIgnoreCase("Huella"))
        {
            request.getRequestDispatcher("Huella.jsp").forward(request, response);
        }
        
        if (accion.equalsIgnoreCase("Listar"))
        {
                 List<Empleado>datos=dao.listar();
                 request.setAttribute("datos",datos);
                 request.getRequestDispatcher("Mostrar.jsp").forward(request,response); 
        }
        
        if (accion.equalsIgnoreCase("Nuevo"))
        {
            request.getRequestDispatcher("Agregar.jsp").forward(request, response);
        }
        if (accion.equalsIgnoreCase("Guardar"))
        {
            String dpi=request.getParameter("txtdpi");
                 String nombre=request.getParameter("txtnom");
                 String apellido=request.getParameter("txtape");
                 String telefono=request.getParameter("txttel");
                 String correo=request.getParameter("txtcorreo");
                 p.setDpi(dpi);
                 p.setNom(nombre);
                 p.setApe(apellido);
                 p.setTel(telefono);
                 p.setCorreo(correo);
                 dao.Agregar(p);
                 request.getRequestDispatcher("Validar?accion=Listar").forward(request, response);
        }
        
        if (accion.equalsIgnoreCase("Editar"))
        {
                String dp=request.getParameter("dpi");
                Empleado pe=dao.listarDpi(dp);
                request.setAttribute("empleado", p);
                request.getRequestDispatcher("Editar.jsp").forward(request, response);
        }
        
        if (accion.equalsIgnoreCase("Actualizar"))
        {
            String dpi1=request.getParameter("txtdpi");
                String nom1=request.getParameter("txtnom");
                String ape1=request.getParameter("txtape");
                String tel1=request.getParameter("txttel");
                String correo1=request.getParameter("txtcorreo");
                p.setDpi(dpi1);
                p.setNom(nom1);
                p.setApe(ape1);
                p.setTel(tel1);
                p.setCorreo(correo1);
                dao.Actualizar(p);
                request.getRequestDispatcher("Validar?accion=Listar").forward(request, response);
        }
        
         if (accion.equalsIgnoreCase("Eliminar"))
        {
                String dpi2=request.getParameter("dpi");
                dao.eliminar(dpi2);
                request.getRequestDispatcher("Validar?accion=Listar").forward(request, response);
        }
        
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

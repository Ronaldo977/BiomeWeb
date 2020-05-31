/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

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
public class controlador extends HttpServlet {

  
    EmpleadoDAO dao= new EmpleadoDAO();
    Empleado p = new Empleado();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accionn=request.getParameter("accion2");
        
       
        
        switch(accionn)
        {
            case "Huella":
                request.getRequestDispatcher("RegistroHuella.html").forward(request, response);
            break;
            case "Listar":
                 List<Empleado>datos=dao.listar();
                 request.setAttribute("datos",datos);
                 request.getRequestDispatcher("Mostrar.jsp").forward(request,response); 
                break;
            case "Nuevo":
                 request.getRequestDispatcher("Agregar.jsp").forward(request, response);
                break;   
            case "Guardar":
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
                 request.getRequestDispatcher("controlador?accion2=Listar").forward(request, response);
                break;
            case "Editar":
                String dp=request.getParameter("dpi");
                Empleado pe=dao.listarDpi(dp);
                request.setAttribute("empleado", p);
                request.getRequestDispatcher("Editar.jsp").forward(request, response);
                break;
            case "Actualizar":
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
                request.getRequestDispatcher("controlador?accion2=Listar").forward(request, response);
                    break;
            case "Eliminar":
                String dpi2=request.getParameter("dpi");
                dao.eliminar(dpi2);
                request.getRequestDispatcher("controlador?accion2=Listar").forward(request, response);
                break;
         
            default:
                throw new AssertionError();
            
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


package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class EmpleadoDAO {
    
    
    PreparedStatement ps;
    ResultSet rs;
    ConexMysql c= new ConexMysql();
    Connection con;
    Empleado p = new Empleado();
    
    public Empleado validare(String dpi, String nom)
    {
      
       
       
        String sql="SELECT * FROM registro WHERE Dpi=? AND Nombre=?";
        try
        {
           
            con=c.Conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, dpi);
            ps.setString(2, nom);
            rs=ps.executeQuery();
            
            while(rs.next())
            {
           
                p.setDpi(rs.getString("Dpi"));
                p.setNom(rs.getString("Nombre"));
             
            }
                    
            
        }catch(Exception e)
        {
       
        }
        return p;
    }
    
    
    public List listar()
    {
        List<Empleado>lista= new ArrayList<>();
        String sql="select * from registro";
        
        try{
            con=c.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            Empleado pp = new Empleado();
            while (rs.next()){
                pp.setDpi(rs.getString(1));
                pp.setNom(rs.getString(2));
                pp.setApe(rs.getString(3));
                pp.setTel(rs.getString(4));
                pp.setCorreo(rs.getString(5));
                lista.add(pp);
            }
        }catch(Exception e)
        {
            
        }
        return lista;
    }
    
    public int Agregar(Empleado p)
    {
        int r=0;
        String sql="INSERT INTO registro(Dpi,Nombre,Apellido,Telefono,Correo) VALUES(?,?,?,?,?)";
        try{
            con=c.Conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, p.getDpi());
            ps.setString(2, p.getNom());
            ps.setString(3, p.getApe());
            ps.setString(4, p.getTel());
            ps.setString(5, p.getCorreo());
            r=ps.executeUpdate();
            if(r==1)
            {
                JOptionPane.showMessageDialog(null,     "Conectado Perro");
                r=1;
            }
            else
            {
                JOptionPane.showMessageDialog(null,     "No Conectado Perro");
                r=0;
            }
        }catch(Exception e)
        {
            
        }
        return r;
    }
    
    public Empleado listarDpi(String dpi)
    {
        String sql="select * from registro where dpi="+dpi;
        try
        {
            con=c.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next())
            {
                p.setDpi(rs.getString(1));
                p.setNom(rs.getString(2));
                p.setApe(rs.getString(3));
                p.setTel(rs.getString(4));
                p.setCorreo(rs.getString(5));
            }
        }catch(Exception e){
            
        }
        return p;
    }
    
    public int Actualizar(Empleado p){
      String sql="update registro set Nombre=?, Apellido=?, Telefono=?, Correo=? where Dpi=?";  
      int r=0;
      try
      {
          con=c.Conexion();
          ps=con.prepareStatement(sql);
          ps.setString(1, p.getNom());
          ps.setString(2, p.getApe());
          ps.setString(3, p.getTel());
          ps.setString(4, p.getCorreo());
         
          r=ps.executeUpdate();
          if(r==1)
          {
              r=1;
          }else
          {
              r=0; 
          }
      }catch(Exception e)
      {
          
      }
      return r;
    }
    
    public void eliminar(String dpi)
    {
        String sql="delete from registro where Dpi="+dpi;
        try{
            con=c.Conexion();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        }catch(Exception e)
        {
            
        }
    }
}

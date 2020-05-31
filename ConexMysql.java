
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class ConexMysql {
    Connection con;
    String url="jdbc:mysql://localhost:3306/proyectobio";
    String user="root";
    String password="jr1234";
     
    public Connection Conexion()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,user,password);
            JOptionPane.showMessageDialog(null,     "Conectado Perro");
            
        }catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null,     "NO Conectado");
                    
                }
        
        return con;
    }
    
    
    public static void main(String[] args)
        {
            ConexMysql m = new ConexMysql();
           m.Conexion();
        }
    
    }


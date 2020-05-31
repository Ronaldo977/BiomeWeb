<%@page import="java.sql.SQLException" %>
<%@page import="Modelo.ConexMysql"%>
<%@page import="Modelo.EmpleadoDAO"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>   
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <title>New Milenium Corporation S.A  | Contacto (502) 41143322</title>
    <link href="css/estilo.css" ref="stylesheet" type="text/css"/>
    </head> 
    <body background="imagenes/Fondo.jpg" > 
       
        <div class="container mt-8 col-lg-4"  >
       
            <div class="card">
                
                
                <div class="card-body col-sm-15">
                    
                    <form class="form-sign" action="Validar" method="POST">
                        
                        <div class ="form-group text-center">
                            
                            <h3>Login</h3>
                            <img src="imagenes/HomeroUsu.jpg"/>
                            
                            <label>Welcome to the System</label>
                        </div>
                        <div class ="form-group">
                            <label>Usuario: </label>
                            <input type="text" name="txtdpi" class="form-control">
                        </div>
                        <div class ="form-group">
                            
                            <label>Password: </label>
                            <input type="password" name="txtnom" class="form-control">
                            
                        </div>
                        <center>
                            
                        <input type="submit" name="accion" value="Ingresar" class="btn btn-primary btn-blog" >
                        </center>
                    </form>
                    
                    
                </div>
                
                
            </div>
            
            
            
        </div>
        
        
        
    <div  class="p-3 mb-2 bg-dark text-white">
        
        <center> <p><font color="white" face="arial" size="4">New Milenium Corporation S.A || Contacto (502) 41143322</font></p></center>
    </div>
      <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
      
    </body>

</html>
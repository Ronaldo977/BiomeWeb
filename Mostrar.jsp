<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page import="java.sql.*"%>
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
    <center>
        <div class="container mt-8 col-lg-4">
            <h3>Registro</h3>
            <form action="Validar" method="POST">
                <input type="submit" name="accion" value="Listar">
                <input type="submit" name="accion" value="Nuevo">
                <input type="submit" name="accion" value="Huella">
            </form>
        </div>
        <div>
            <table border="1">
                <thead>
                    <tr>
                        <th>DPI</th>
                        <th>NOMBRE</th>
                        <th>APELLIDO</th>
                        <th>TELEFONO</th>
                        <th>CORREO</th>
                        <th>ACCION</th>
                    </tr>
                </thead>
                <tbody>
                  
                <c:forEach var="dato" items="${datos}" >
                    <tr>
                        <td>${dato.getDpi()}></td>
                        <td>${dato.getNom()}</td>
                        <td>${dato.getApe()}</td>
                        <td>${dato.getTel()}</td>
                        <td>${dato.getCorreo()}</td>
                        <td>
                            <form action="Validar" method="POST">
                                <input type="hidden" name="dpi" value="${dato.getDpi()}">
                                <input type="submit" value="Editar">
                                <input type="submit" value="Eliminar">
                            </form>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>

        </div>
    </center>
<div  class="p-3 mb-2 bg-dark text-white">
        
        <center> <p><font color="white" face="arial" size="4">New Milenium Corporation S.A || Contacto (502) 41143322</font></p></center>
    </div>
      <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

    
    </body>
</html>

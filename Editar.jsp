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
        <div>
            <h3>Agregar Empleados</h3>
        </div>
        <div>
            <form action="Validar" method="POST">
                
            DPI:<br>
            <input type="text" name="txtdpi" value="${empleado.getDpi()}"> <br>
            NOMBRE:<br>
            <input type="text" name="txtnom" value="${empleado.getNom()}"><br>
            APELLIDO:<br>
            <input type="text" name="txtape" value="${empleado.getApe()}"><br>
            TELEFONO:<br>
            <input type="text" name="txttel" value="${empleado.getTel()}"><br>
            CORREO:<br>
            <input type="email" name="txtcorreo" value="${empleado.getCorreo()}"><br>
            <input type="submit" name="accion" value="Actualizar" >
            </form>
        </div>
    </center>
    </body>
</html>

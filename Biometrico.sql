create database proyectobio;

CREATE TABLE proyectobio.registro (
  Dpi varchar(20) NOT NULL,
  Nombre varchar(30) not NULL,
  Apellido varchar(30) not NULL,
  Telefono varchar(115),
  Correo nvarchar(30),
CONSTRAINT pk_Dpi
PRIMARY KEY(Dpi)  
)

INSERT INTO proyectobio.registro (Dpi, Nombre, Apellido, Telefono, Correo) VALUES
('2200945200101', 'Jose', 'Rodas', '30823080', 'nose@gmail.com'),
('3052152200101', 'Chapo', 'Guzman', '32531566', 'prueba@gmail.com');

CREATE TABLE proyectobio.huella (
  Dpi varchar(20) NOT NULL,
  huenombre varchar(30) not NULL,
  huehuella blob not NULL,
  CONSTRAINT pk_Dpi
PRIMARY KEY(Dpi)
)
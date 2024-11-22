DROP DATABASE IF EXISTS practica1;
DROP USER IF EXISTS "usuario_practica"; 
CREATE DATABASE practica1; 

CREATE USER 'usuario_practica'@'localhost' IDENTIFIED BY 'la_Clave.';
GRANT ALL PRIVILEGES ON practica1.* TO 'usuario_practica'@'localhost';
FLUSH PRIVILEGES;


USE practica1;

CREATE TABLE arbol(
	Id BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    ImagePath VARCHAR(250) NOT NULL,
    Nombre VARCHAR(100) NOT NULL,
    Tipo VARCHAR(50) NOT NULL,
    GradoDureza INT NOT NULL,
	Activo BOOL NOT NULL DEFAULT(TRUE),
	CHECK(GradoDureza BETWEEN 1 AND 10)
);

INSERT INTO arbol(
	ImagePath,
    Nombre,
    Tipo,
    GradoDureza)
VALUES (
	"https://i.pinimg.com/736x/d0/a6/3e/d0a63ea0c03beed8ef57b10c71d9ab3b.jpg", 
    "Arbol1",
    "Tipo2",
    10
),
("https://c.files.bbci.co.uk/11628/production/_93780217_mediaitem93780216.jpg", "Arbol2", "Tipo2", 5);

SELECT * 
FROM practica1.arbol;

DESCRIBE arbol;

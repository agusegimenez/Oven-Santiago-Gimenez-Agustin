DROP TABLE IF EXISTS ODONTOLOGOS; CREATE TABLE ODONTOLOGOS (ID INT AUTO_INCREMENT PRIMARY KEY, MATRICULA INT NOT NULL, NOMBRE VARCHAR(100) NOT NULL, APELLIDO VARCHAR(100) NOT NULL);

INSERT INTO ODONTOLOGOS (MATRICULA, NOMBRE, APELLIDO) VALUES (1111, 'Duki', 'SSJ'), (2222, 'Emilia', 'Mernes');

CREATE DATABASE bd_medicamentos;
USE bd_medicamentos;


CREATE TABLE medicamento (
    idMedicamento INT PRIMARY KEY,
    nombre VARCHAR(255),
    descripcion TEXT,
    categoria VARCHAR(50),
    precio DECIMAL(10, 2),
    stock INT,
    fechaVencimiento DATE,
    proveedor VARCHAR(100)
);



INSERT INTO medicamento (idMedicamento, nombre, descripcion, categoria, precio, stock, fechaVencimiento, proveedor)
VALUES
    (1, 'Paracetamol', 'Analgesico y antipiretico', 'Analgésico', 5.99, 100, '2024-09-30', 'Proveedor A'),
    (2, 'Ibuprofeno', 'Antiinflamatorio no esteroideo', 'Antiinflamatorio', 7.50, 75, '2024-08-31', 'Proveedor B'),
    (3, 'Omeprazol', 'Inhibidor de la bomba de protones', 'Gastritis', 9.25, 50, '2024-10-15', 'Proveedor C'),
    (4, 'Amoxicilina', 'Antibiótico de amplio espectro', 'Antibiótico', 12.99, 30, '2024-11-20', 'Proveedor D'),
    (5, 'Loratadina', 'Antihistamínico no sedante', 'Antialérgico', 8.75, 60, '2024-09-25', 'Proveedor E');


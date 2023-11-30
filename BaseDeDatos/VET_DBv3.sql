CREATE DATABASE VET_DB
GO

USE VET_DB
GO

CREATE TABLE CLIENTE(
	id_cliente CHAR(5) NOT NULL PRIMARY KEY,
	nombres VARCHAR(60) NOT NULL,
	dni CHAR(8) NOT NULL,
	sexo CHAR(1) NULL,
		CONSTRAINT chk_sexo CHECK (sexo IN ('F','M')),
	correo VARCHAR(30) NOT NULL,
	telefono VARCHAR(12) NOT NULL,
	direccion VARCHAR(120) NOT NULL
)
GO

CREATE TABLE MASCOTA(
	id_mascota CHAR(5) NOT NULL PRIMARY KEY,
	nombre VARCHAR(30) NOT NULL,
	especie VARCHAR(5) NOT NULL,
		CONSTRAINT chk_especie CHECK (especie IN ('gato', 'perro')),
	sexo CHAR(1) NULL,
		CONSTRAINT chk_sexo_mascota CHECK (sexo IN ('M','F','C')),
	raza VARCHAR(40) NULL,
	fecha_nac DATE NOT NULL,
	id_cliente CHAR(5) NOT NULL REFERENCES CLIENTE (id_cliente)
)
GO

CREATE TABLE EMPLEADO(
	id_empleado CHAR(5) NOT NULL PRIMARY KEY,
	nombres VARCHAR(60) NOT NULL,
	dni CHAR(8) NOT NULL,
	sexo CHAR(1) NULL,
		CONSTRAINT chk_sexo_empleado CHECK (sexo IN ('F','M')),
	correo VARCHAR(30) NOT NULL,
	telefono VARCHAR(12) NOT NULL,
	tipo VARCHAR(20) NOT NULL,
		CONSTRAINT chk_tipo CHECK (tipo IN ('Veterinario','Cajero','Administrador')),
	usuario VARCHAR(20) NOT NULL,
	contrasenia VARCHAR(20) NOT NULL
)
GO

CREATE TABLE SERVICIO(
	id_servicio CHAR(5) NOT NULL PRIMARY KEY,
	descripcion VARCHAR(100) NOT NULL,
	costo MONEY NOT NULL
)
GO

CREATE TABLE CATEGORIA_PROD(
	id_categoria INT NOT NULL PRIMARY KEY, 
	nombre_cat VARCHAR(30) NOT NULL
)
GO

CREATE TABLE PRODUCTO(
	id_producto CHAR(5) NOT NULL PRIMARY KEY,
	descripcion VARCHAR(80) NOT NULL,
	unidad VARCHAR(10) NOT NULL,
	stock INT NOT NULL,
	costoUnitario MONEY NOT NULL,
	margenPorcentual INT NOT NULL,
	margenGanancia MONEY NOT NULL,
	precioVenta MONEY NOT NULL,
	id_categoria INT REFERENCES CATEGORIA_PROD (id_categoria)
)
GO

CREATE TABLE FACTURA(
	id_factura INT NOT NULL PRIMARY KEY,
	id_cliente CHAR(5) NOT NULL REFERENCES CLIENTE (id_cliente),
	id_empleado CHAR(5) NOT NULL REFERENCES EMPLEADO (id_empleado),
	fecha_factura DATETIME NOT NULL,
	importe MONEY NOT NULL
)
GO

CREATE TABLE DETALLE_FACTURA_SERVICIO(
	id_factura INT NOT NULL REFERENCES FACTURA (id_factura),
	id_servicio CHAR(5) NOT NULL REFERENCES SERVICIO (id_servicio),
	cantidad INT NOT NULL,
	monto MONEY NOT NULL,
	PRIMARY KEY (id_factura, id_servicio)
)
GO

CREATE TABLE DETALLE_FACTURA_PRODUCTO(
	id_factura INT NOT NULL REFERENCES FACTURA (id_factura),
	id_producto CHAR(5) NOT NULL REFERENCES PRODUCTO (id_producto),
	cantidad INT NOT NULL,
	monto MONEY NOT NULL,
	PRIMARY KEY (id_factura, id_producto)
)
GO

CREATE TABLE CONSULTA_MEDICA(
	id_consulta INT NOT NULL PRIMARY KEY,
	id_cliente CHAR(5) NOT NULL REFERENCES CLIENTE (id_cliente),
	id_empleado CHAR(5) NOT NULL REFERENCES EMPLEADO (id_empleado),
	fechaConsulta DATETIME NOT NULL,
	id_factura INT NULL REFERENCES FACTURA (id_factura)
)
GO

CREATE TABLE DETALLE_CONSULTA_MEDICA(
	id_consulta INT NOT NULL REFERENCES CONSULTA_MEDICA (id_consulta),
	id_mascota CHAR(5) NOT NULL REFERENCES MASCOTA (id_mascota),
	motivo VARCHAR(200) NOT NULL,
	diagnostico VARCHAR(200) NOT NULL,
	notasMedicas VARCHAR(300) NOT NULL,
	PRIMARY KEY (id_consulta, id_mascota)
)
GO


---

-- PARA LA TABLA: Cliente

CREATE PROCEDURE sp_GuardarNuevoCliente(
	@nombres VARCHAR(50),
	@dni CHAR(8),
	@sexo CHAR(1),
	@correo VARCHAR(30),
	@telefono VARCHAR(12),
	@direccion VARCHAR(120)
)
AS
BEGIN
DECLARE @ID NVARCHAR(5)
	SELECT @ID = ISNULL(MAX(SUBSTRING(id_cliente, 3, 3)), 0) + 1
	FROM Cliente
	SET @ID = 'CL' + RIGHT('00' + CAST(@ID AS NVARCHAR(3)), 3)

	INSERT INTO Cliente (id_cliente, nombres, dni, sexo, correo, telefono, direccion) 
	VALUES (@ID, @nombres, @dni, @sexo, @correo, @telefono, @direccion);
END
GO


CREATE PROCEDURE sp_BuscarCliente(
	@id_cliente CHAR(5)
)
AS
BEGIN
	SELECT * FROM CLIENTE
	WHERE id_cliente = @id_cliente
END
GO


CREATE PROCEDURE sp_ActualizarCliente(
	@id_cliente CHAR(5),
	@nombres VARCHAR(50),
	@dni CHAR(8),
	@sexo CHAR(1),
	@correo VARCHAR(30),
	@telefono VARCHAR(12),
	@direccion VARCHAR(120)
)
AS
BEGIN
	UPDATE Cliente SET nombres = @nombres,
					   dni = @dni,
					   sexo = @sexo,
					   correo = @correo,
					   telefono = @telefono,
					   direccion = @direccion
	WHERE id_cliente = @id_cliente
END
GO


CREATE PROCEDURE sp_EliminarCliente(
	@id_cliente CHAR(5)
)
AS
BEGIN
	DELETE FROM Cliente WHERE id_cliente = @id_cliente
END
GO


CREATE PROCEDURE sp_ListarClientes
AS
BEGIN
	SELECT TOP 20 * FROM CLIENTE
END
GO


CREATE PROCEDURE sp_ListarClientesPorNombre(
	@nombre VARCHAR(50)
)
AS
BEGIN
	SELECT TOP 20 * FROM CLIENTE 
	WHERE nombres LIKE '%'+@nombre+'%'
END
GO


CREATE PROCEDURE sp_ListarClientesPorRecienAgregado
AS
BEGIN
	SELECT TOP 20 * FROM CLIENTE
	ORDER BY id_cliente DESC
END
GO


CREATE PROCEDURE sp_ListarClientesPorDNI(
	@dni CHAR(8)
)
AS
BEGIN
	SELECT * FROM CLIENTE
	WHERE dni = @dni
END
GO


-- PARA LA TABLA: Mascota

CREATE PROCEDURE sp_GuardarNuevaMascota(
	@nombre VARCHAR(30),
	@especie VARCHAR(5),
	@sexo CHAR(1),
	@raza VARCHAR(40),
	@fecha_nac DATE,
	@id_cliente CHAR(5)
)
AS
BEGIN
	DECLARE @ID NVARCHAR(5)
	SELECT @ID = ISNULL(MAX(SUBSTRING(id_mascota, 3, 3)), 0) + 1
	FROM MASCOTA
	SET @ID = 'MC' + RIGHT('00' + CAST(@ID AS NVARCHAR(3)), 3)

	INSERT INTO MASCOTA (id_mascota, nombre, especie, sexo, raza, fecha_nac, id_cliente)
	VALUES (@ID, @nombre, @especie, @sexo, @raza, @fecha_nac, @id_cliente)
END
GO


CREATE PROCEDURE sp_BuscarMascota(
	@id_mascota CHAR(5)
)
AS
BEGIN
	SELECT * FROM MASCOTA
	WHERE id_mascota = @id_mascota
END
GO


CREATE PROCEDURE sp_ActualizarMascota(
	@id_mascota CHAR(5),
	@nombre VARCHAR(30),
	@especie VARCHAR(5),
	@sexo CHAR(1),
	@raza VARCHAR(40),
	@fecha_nac DATE,
	@id_cliente CHAR(5)
)
AS
BEGIN
	UPDATE MASCOTA SET nombre = @nombre,
					   especie = @especie,
					   sexo = @sexo,
					   raza = @raza,
					   fecha_nac = @fecha_nac,
					   id_cliente = @id_cliente
	WHERE id_mascota = @id_mascota
END
GO


CREATE PROCEDURE sp_EliminarMascota(
	@id_mascota CHAR(5)
)
AS
BEGIN
	DELETE FROM MASCOTA WHERE id_mascota = @id_mascota
END
GO


CREATE PROCEDURE sp_ListarMascotas
AS
BEGIN
	SELECT TOP 20 M.id_mascota, M.nombre, M.especie, M.sexo, M.raza, M.fecha_nac, C.id_cliente, C.nombres AS cliente
	FROM MASCOTA M INNER JOIN CLIENTE C ON (M.id_cliente = C.id_cliente)
END
GO


CREATE PROCEDURE sp_ListarMascotasPorNombre(
	@nombre VARCHAR(30)
)
AS
BEGIN
	SELECT TOP 20 M.id_mascota, M.nombre, M.especie, M.sexo, M.raza, M.fecha_nac, C.id_cliente, C.nombres AS cliente
	FROM MASCOTA M INNER JOIN CLIENTE C ON (M.id_cliente = C.id_cliente)
	WHERE M.nombre LIKE '%'+@nombre+'%'
END
GO


CREATE PROCEDURE sp_ListarMascotasPorRecienAgregado
AS
BEGIN
	SELECT TOP 20 M.id_mascota, M.nombre, M.especie, M.sexo, M.raza, M.fecha_nac, C.id_cliente, C.nombres AS cliente
	FROM MASCOTA M INNER JOIN CLIENTE C ON (M.id_cliente = C.id_cliente)
	ORDER BY M.id_mascota DESC
END
GO


CREATE PROCEDURE sp_ListarMascotasPorIDCliente(
	@id_cliente CHAR(5)
)
AS
BEGIN
	SELECT TOP 20 M.id_mascota, M.nombre, M.especie, M.sexo, M.raza, M.fecha_nac, C.id_cliente, C.nombres AS cliente
	FROM MASCOTA M INNER JOIN CLIENTE C ON (M.id_cliente = C.id_cliente)
	WHERE M.id_cliente = @id_cliente
END
GO



-- PARA LA TABLA: Servicio

CREATE PROCEDURE sp_GuardarNuevoServicio(
	@descripcion VARCHAR(100),
	@costo MONEY
)
AS
BEGIN
DECLARE @ID NVARCHAR(5)
	SELECT @ID = ISNULL(MAX(SUBSTRING(id_servicio, 3, 3)), 0) + 1
	FROM SERVICIO
	SET @ID = 'SV' + RIGHT('00' + CAST(@ID AS NVARCHAR(3)), 3)

	INSERT INTO SERVICIO (id_servicio, descripcion, costo) 
	VALUES (@ID, @descripcion, @costo);
END
GO



CREATE PROCEDURE sp_BuscarServicio(
	@id_servicio CHAR(5)
)
AS
BEGIN
	SELECT * FROM SERVICIO
	WHERE id_servicio = @id_servicio
END
GO


CREATE PROCEDURE sp_ActualizarServicio(
	@id_servicio CHAR(5),
	@descripcion VARCHAR(100),
	@costo MONEY
)
AS
BEGIN
	UPDATE SERVICIO SET descripcion = @descripcion,
			    costo = @costo
	WHERE id_servicio = @id_servicio
END
GO


CREATE PROCEDURE sp_EliminarServicio(
	@id_servicio CHAR(5)
)
AS
BEGIN
	DELETE FROM SERVICIO WHERE id_servicio = @id_servicio
END
GO


CREATE PROCEDURE sp_ListarServicios
AS
BEGIN
	SELECT TOP 20 * FROM SERVICIO
END
GO


CREATE PROCEDURE sp_ListarServiciosPorNombre(
	@nombre VARCHAR(100)
)
AS
BEGIN
	SELECT TOP 20 * FROM SERVICIO 
	WHERE descripcion LIKE '%'+@nombre+'%'
END
GO


CREATE PROCEDURE sp_ListarServiciosPorRecienAgregado
AS
BEGIN
	SELECT TOP 20 * FROM SERVICIO 
	ORDER BY id_servicio DESC
END
GO


CREATE PROCEDURE sp_ListarServicioAlfabetico
AS
BEGIN
	SELECT * FROM SERVICIO
	ORDER BY descripcion ASC
END
GO


-- PARA LA TABLA: Producto


CREATE PROCEDURE sp_GuardarNuevoProducto(
	@descripcion VARCHAR(80),
	@unidad VARCHAR(10),
	@stock INT,
	@costoUnitario MONEY,
	@margenPorcentual INT,
	@margenGanancia MONEY,
	@precioVenta MONEY,
	@categoria VARCHAR(30)
)
AS
BEGIN
DECLARE @ID NVARCHAR(5)
	SELECT @ID = ISNULL(MAX(SUBSTRING(id_producto, 3, 3)), 0) + 1
	FROM PRODUCTO
	SET @ID = 'PR' + RIGHT('00' + CAST(@ID AS NVARCHAR(3)), 3)

DECLARE @ID_CAT INT
	SELECT @ID_CAT = id_categoria FROM CATEGORIA_PROD WHERE nombre_cat = @categoria

    INSERT INTO PRODUCTO (id_producto, descripcion, unidad, stock, costoUnitario, margenPorcentual, margenGanancia, precioVenta, id_categoria)
    VALUES (@ID, @descripcion, @unidad, @stock, @costoUnitario, @margenPorcentual, @margenGanancia, @precioVenta, @ID_CAT)
END
GO


CREATE PROCEDURE sp_BuscarProducto(
	@id_producto CHAR(5)
)
AS
BEGIN
    SELECT P.id_producto, P.descripcion, P.unidad, P.stock, P.costoUnitario, P.margenPorcentual, P.margenGanancia, P.precioVenta, C.nombre_cat 
    FROM PRODUCTO P INNER JOIN CATEGORIA_PROD C ON (P.id_categoria = C.id_categoria)
    WHERE id_producto = @id_producto
END
GO


CREATE PROCEDURE sp_ActualizarProducto(
	@id_producto CHAR(5),
	@descripcion VARCHAR(80),
	@unidad VARCHAR(10),
	@stock INT,
	@costoUnitario MONEY,
	@margenPorcentual INT,
	@margenGanancia MONEY,
	@precioVenta MONEY,
	@categoria VARCHAR(30)
)
AS
BEGIN
    DECLARE @ID_CAT INT
    SELECT @ID_CAT = id_categoria FROM CATEGORIA_PROD WHERE nombre_cat = @categoria

    UPDATE PRODUCTO
    SET descripcion = @descripcion, unidad = @unidad, stock = @stock, costoUnitario = @costoUnitario, 
        margenPorcentual = @margenPorcentual, margenGanancia = @margenGanancia, 
        precioVenta = @precioVenta, id_categoria = @ID_CAT
    WHERE id_producto = @id_producto
END
GO


CREATE PROCEDURE sp_EliminarProducto(
	@id_producto CHAR(5)
)
AS
BEGIN
    DELETE FROM PRODUCTO
    WHERE id_producto = @id_producto
END
GO


CREATE PROCEDURE sp_ListarProductos
AS 
BEGIN
    SELECT TOP 20 P.id_producto, P.descripcion, P.unidad, P.stock, P.costoUnitario, P.margenPorcentual, P.margenGanancia, P.precioVenta, C.nombre_cat 
    FROM PRODUCTO P INNER JOIN CATEGORIA_PROD C ON (P.id_categoria = C.id_categoria)
END
GO


CREATE PROCEDURE sp_ListarProductosPorNombre(
	@nombre VARCHAR(80)
)
AS
BEGIN
    SELECT TOP 20 P.id_producto, P.descripcion, P.unidad, P.stock, P.costoUnitario, P.margenPorcentual, P.margenGanancia, P.precioVenta, C.nombre_cat 
    FROM PRODUCTO P INNER JOIN CATEGORIA_PROD C ON (P.id_categoria = C.id_categoria)
    WHERE P.descripcion LIKE '%'+@nombre+'%'
END
GO


CREATE PROCEDURE sp_ListarProductosPorRecienAgregado
AS
BEGIN
	SELECT TOP 20 P.id_producto, P.descripcion, P.unidad, P.stock, P.costoUnitario, P.margenPorcentual, P.margenGanancia, P.precioVenta, C.nombre_cat 
    FROM PRODUCTO P INNER JOIN CATEGORIA_PROD C ON (P.id_categoria = C.id_categoria)
    ORDER BY P.id_producto DESC
END
GO


CREATE PROCEDURE sp_ListarProductosPorCategoria(
	@categoria VARCHAR(30)
)
AS
BEGIN
	SELECT TOP 20 P.id_producto, P.descripcion, P.unidad, P.stock, P.costoUnitario, P.margenPorcentual, P.margenGanancia, P.precioVenta, C.nombre_cat 
    FROM PRODUCTO P INNER JOIN CATEGORIA_PROD C ON (P.id_categoria = C.id_categoria)
    WHERE C.nombre_cat LIKE '%'+@categoria+'%'
END
GO


CREATE PROCEDURE sp_ListarProductosAlfabetico
AS 
BEGIN
    SELECT P.id_producto, P.descripcion, P.unidad, P.stock, P.costoUnitario, P.margenPorcentual, P.margenGanancia, P.precioVenta, C.nombre_cat 
    FROM PRODUCTO P INNER JOIN CATEGORIA_PROD C ON (P.id_categoria = C.id_categoria)
	ORDER BY P.descripcion ASC
END
GO


-- PARA LA TABLA: Categoria Producto


CREATE PROCEDURE sp_GuardarNuevaCategoriaProducto(
	@nombre_cat VARCHAR(30)
)
AS
BEGIN
    DECLARE @ID INT;

    SELECT @ID = ISNULL(MAX(id_categoria), 0) + 1
    FROM CATEGORIA_PROD;

    INSERT INTO CATEGORIA_PROD (id_categoria, nombre_cat)
    VALUES (@ID, @nombre_cat)
END
GO


CREATE PROCEDURE sp_BuscarCategoriaProducto(
	@id_categoria INT
)
AS
BEGIN
    SELECT * FROM CATEGORIA_PROD
    WHERE id_categoria = @id_categoria
END
GO


CREATE PROCEDURE sp_ActualizarCategoriaProducto(
	@id_categoria INT,
	@nombre_cat VARCHAR(30)
)
AS
BEGIN
    UPDATE CATEGORIA_PROD
    SET nombre_cat = @nombre_cat
    WHERE id_categoria = @id_categoria
END
GO


CREATE PROCEDURE sp_EliminarCategoriaProducto(
	@id_categoria INT
)
AS
BEGIN
    DELETE FROM CATEGORIA_PROD
    WHERE id_categoria = @id_categoria
END
GO


-- PARA LA TABLA: Empleado


CREATE PROCEDURE sp_GuardarNuevoEmpleado(
	@nombres VARCHAR(60),
	@dni CHAR(8),
	@sexo CHAR(1),
	@correo VARCHAR(30),
	@telefono VARCHAR(12),
	@tipo VARCHAR(20),
	@usuario VARCHAR(20),
	@contrasenia VARCHAR(20)
)
AS
BEGIN
	DECLARE @ID NVARCHAR(5)
	SELECT @ID = ISNULL(MAX(SUBSTRING(id_empleado, 3, 3)), 0) + 1
	FROM EMPLEADO
	SET @ID = 'EM' + RIGHT('00' + CAST(@ID AS NVARCHAR(3)), 3)

	INSERT INTO EMPLEADO (id_empleado, nombres, dni, sexo, correo, telefono, tipo, usuario, contrasenia)
	VALUES (@ID, @nombres, @dni, @sexo, @correo, @telefono, @tipo, @usuario, @contrasenia);
END
GO


CREATE PROCEDURE sp_BuscarEmpleado(
	@id_empleado CHAR(5)
)
AS
BEGIN
	SELECT * FROM EMPLEADO
	WHERE id_empleado = @id_empleado
END
GO


CREATE PROCEDURE sp_ActualizarEmpleado(
	@id_empleado CHAR(5),
	@nombres VARCHAR(60),
	@dni CHAR(8),
	@sexo CHAR(1),
	@correo VARCHAR(30),
	@telefono VARCHAR(12),
	@tipo VARCHAR(20),
	@usuario VARCHAR(20),
	@contrasenia VARCHAR(20)
)
AS
BEGIN
	UPDATE EMPLEADO
	SET nombres = @nombres,
	    dni = @dni,
	    sexo = @sexo,
	    correo = @correo,
	    telefono = @telefono,
	    tipo = @tipo,
	    usuario = @usuario,
	    contrasenia = @contrasenia
	WHERE id_empleado = @id_empleado
END
GO


CREATE PROCEDURE sp_EliminarEmpleado(
	@id_empleado CHAR(5)
)
AS
BEGIN
	DELETE FROM EMPLEADO
	WHERE id_empleado = @id_empleado
END
GO


CREATE PROCEDURE sp_LoginEmpleado(
	@usuario VARCHAR(20),
	@contrasenia VARCHAR(20)
)
AS
BEGIN
	SELECT id_empleado, nombres, dni, sexo, correo, telefono, tipo
	FROM EMPLEADO
	WHERE usuario = @usuario AND contrasenia = @contrasenia
END
GO


CREATE PROCEDURE sp_ListarEmpleados
AS
BEGIN
	SELECT id_empleado, nombres, dni, sexo, correo, telefono, tipo
	FROM EMPLEADO
END
GO


CREATE PROCEDURE sp_ListarEmpleadosPorDNI(
	@dni CHAR(8)
)
AS
BEGIN
	SELECT id_empleado, nombres, dni, sexo, correo, telefono, tipo
	FROM EMPLEADO
	WHERE dni = @dni
END
GO


CREATE PROCEDURE sp_ListarEmpleadosPorNombre(
	@nombres VARCHAR(60)
)
AS
BEGIN
	SELECT id_empleado, nombres, dni, sexo, correo, telefono, tipo
	FROM EMPLEADO
	WHERE nombres LIKE '%'+@nombres+'%'
END
GO


CREATE PROCEDURE sp_ListarEmpleadosPorRecienAgregado
AS
BEGIN
	SELECT id_empleado, nombres, dni, sexo, correo, telefono, tipo
	FROM EMPLEADO
	ORDER BY id_empleado DESC
END
GO


EXEC sp_GuardarNuevoEmpleado 'Renzo Anacleto', '87651234', 'M', 'renzo@gmail.com', '987456321', 'Administrador', 'renzo', '1234'
GO


-- PARA LAS TABLAS: FACTURA, DETALLE_FACTURA_PROD, DETALLE_FACTURA_SERV

CREATE PROCEDURE sp_VerificarStock(
	@id_producto CHAR(5)
)
AS
BEGIN
	SELECT stock FROM PRODUCTO
	WHERE id_producto = @id_producto
END
GO


CREATE PROCEDURE sp_RegistrarVenta(
	@id_cliente CHAR(5),
	@id_empleado CHAR(5),
	@importe MONEY
)
AS
BEGIN
	DECLARE @ID INT;

    SELECT @ID = ISNULL(MAX(id_factura), 0) + 1
    FROM FACTURA;

	INSERT INTO FACTURA (id_factura, id_cliente, id_empleado, fecha_factura, importe)
	VALUES (@ID, @id_cliente, @id_empleado, GETDATE(), @importe);

	SELECT ISNULL(MAX(id_factura), 0) AS id_factura FROM FACTURA;
END
GO


CREATE PROCEDURE sp_VenderProducto(
	@id_factura INT,
	@id_producto CHAR(5),
	@cantidad INT,
	@monto MONEY
)
AS
BEGIN
	INSERT INTO DETALLE_FACTURA_PRODUCTO (id_factura, id_producto, cantidad, monto)
	VALUES (@id_factura, @id_producto, @cantidad, @monto)

	UPDATE PRODUCTO SET	stock = stock - @cantidad
	WHERE id_producto = @id_producto
END
GO


CREATE PROCEDURE sp_VenderServicio(
	@id_factura INT,
	@id_servicio CHAR(5),
	@cantidad INT,
	@monto MONEY
)
AS
BEGIN
	INSERT INTO DETALLE_FACTURA_SERVICIO (id_factura, id_servicio, cantidad, monto)
	VALUES (@id_factura, @id_servicio, @cantidad, @monto)
END
GO


CREATE PROCEDURE sp_obtenerUltimaFactura
AS
BEGIN
	SELECT * FROM FACTURA
	WHERE id_factura = (SELECT MAX(id_factura) FROM FACTURA)
END
GO


CREATE PROCEDURE sp_ListarVentas
AS
BEGIN
	SELECT TOP 20 F.id_factura, C.nombres AS cliente, E.nombres AS empleado, F.fecha_factura, F.importe
	FROM FACTURA F INNER JOIN CLIENTE C ON (F.id_cliente = C.id_cliente)
				   INNER JOIN EMPLEADO E ON (F.id_empleado = E.id_empleado)
END
GO


CREATE PROCEDURE sp_ListarVentasPorClienteDNI(
	@dni CHAR(8)
)
AS
BEGIN
	SELECT F.id_factura, C.nombres AS cliente, E.nombres AS empleado, F.fecha_factura, F.importe
	FROM FACTURA F INNER JOIN CLIENTE C ON (F.id_cliente = C.id_cliente)
				   INNER JOIN EMPLEADO E ON (F.id_empleado = E.id_empleado)
	WHERE C.dni = @dni
END
GO


CREATE PROCEDURE sp_ListarVentasPorClienteID(
	@id_cliente VARCHAR(60)
)
AS
BEGIN
	SELECT F.id_factura, C.nombres AS cliente, E.nombres AS empleado, F.fecha_factura, F.importe
	FROM FACTURA F INNER JOIN CLIENTE C ON (F.id_cliente = C.id_cliente)
				   INNER JOIN EMPLEADO E ON (F.id_empleado = E.id_empleado)
	WHERE C.id_cliente = @id_cliente
END
GO


CREATE PROCEDURE sp_ListarVentasPorEmpleadoID(
	@id_empleado VARCHAR(60)
)
AS
BEGIN
	SELECT F.id_factura, C.nombres AS cliente, E.nombres AS empleado, F.fecha_factura, F.importe
	FROM FACTURA F INNER JOIN CLIENTE C ON (F.id_cliente = C.id_cliente)
				   INNER JOIN EMPLEADO E ON (F.id_empleado = E.id_empleado)
	WHERE E.id_empleado = @id_empleado
END
GO


CREATE PROCEDURE sp_ListarVentasPorRecienAgregado
AS
BEGIN
	SELECT TOP 20 F.id_factura, C.nombres AS cliente, E.nombres AS empleado, F.fecha_factura, F.importe
	FROM FACTURA F INNER JOIN CLIENTE C ON (F.id_cliente = C.id_cliente)
				   INNER JOIN EMPLEADO E ON (F.id_empleado = E.id_empleado)
	ORDER BY F.id_factura DESC
END
GO


-- PARA LAS TABLAS: CONSULTA_MEDICA, DETALLE_CONSULTA_MEDICA

CREATE PROCEDURE sp_GuardarNuevaConsulta(
	@id_cliente CHAR(5),
	@id_empleado CHAR(5)
)
AS
BEGIN
	DECLARE @ID INT;
    SELECT @ID = ISNULL(MAX(id_consulta), 0) + 1
    FROM CONSULTA_MEDICA;
	
	INSERT INTO CONSULTA_MEDICA (id_consulta, id_cliente, id_empleado, fechaConsulta, id_factura)
	VALUES (@ID, @id_cliente, @id_empleado, GETDATE(), NULL)
END
GO


CREATE PROCEDURE sp_ObtenerUltimaConsultaDeCliente(
	@id_cliente CHAR(5)
)
AS
BEGIN
	SELECT TOP 1 M.id_consulta, M.id_cliente, C.nombres AS cliente, 
				 M.id_empleado, E.nombres AS empleado, fechaConsulta, id_factura
	FROM CONSULTA_MEDICA M INNER JOIN CLIENTE C ON (M.id_cliente = C.id_cliente)
						   INNER JOIN EMPLEADO E ON (M.id_empleado = E.id_empleado)
	WHERE M.id_cliente = @id_cliente
	ORDER BY id_consulta DESC
END
GO


CREATE PROCEDURE sp_GuardarDetalleConsulta(
	@id_consulta INT,
	@id_mascota CHAR(5),
	@motivo VARCHAR(200),
	@diagnostico VARCHAR(200),
	@notasMedicas VARCHAR(300)
)
AS
BEGIN
	INSERT INTO DETALLE_CONSULTA_MEDICA (id_consulta, id_mascota, motivo, diagnostico, notasMedicas)
	VALUES (@id_consulta, @id_mascota, @motivo, @diagnostico, @notasMedicas)
END
GO


CREATE PROCEDURE sp_ListarFacturasPendientes
AS
BEGIN
	SELECT M.id_consulta, M.id_cliente, C.nombres AS cliente, 
				 M.id_empleado, E.nombres AS empleado, fechaConsulta, id_factura
	FROM CONSULTA_MEDICA M INNER JOIN CLIENTE C ON (M.id_cliente = C.id_cliente)
						   INNER JOIN EMPLEADO E ON (M.id_empleado = E.id_empleado)
	WHERE id_factura IS NULL
	ORDER BY id_consulta DESC
END
GO


CREATE PROCEDURE sp_ActualizarFacturaDeConsulta(
	@id_consulta INT,
	@id_factura INT
)
AS
BEGIN
	UPDATE CONSULTA_MEDICA SET id_factura = @id_factura
	WHERE id_consulta = @id_consulta
END
GO


CREATE PROCEDURE sp_ConsultarFacturaPendiente(
	@id_consulta INT
)
AS
BEGIN
	SELECT id_consulta FROM CONSULTA_MEDICA
	WHERE id_consulta = @id_consulta AND id_factura IS NULL
END
GO


CREATE PROCEDURE sp_BuscarConsultaPorID(
	@id_consulta INT
)
AS
BEGIN
	SELECT M.id_consulta, M.id_cliente, C.nombres AS cliente, 
				 M.id_empleado, E.nombres AS empleado, fechaConsulta, id_factura
	FROM CONSULTA_MEDICA M INNER JOIN CLIENTE C ON (M.id_cliente = C.id_cliente)
						   INNER JOIN EMPLEADO E ON (M.id_empleado = E.id_empleado)
	WHERE M.id_consulta = @id_consulta
END
GO


CREATE PROCEDURE sp_BuscarDetalleConsultaPorID(
	@id_consulta INT,
	@id_mascota CHAR(5)
)
AS
BEGIN
	SELECT * FROM DETALLE_CONSULTA_MEDICA
	WHERE id_consulta = @id_consulta AND id_mascota = @id_mascota
END
GO


CREATE PROCEDURE sp_ActualizarDetalleConsulta(
	@id_consulta INT,
	@id_mascota CHAR(5),
	@motivo VARCHAR(200),
	@diagnostico VARCHAR(200),
	@notasMedicas VARCHAR(300)
)
AS
BEGIN
	UPDATE DETALLE_CONSULTA_MEDICA SET motivo = @motivo,
			diagnostico = @diagnostico, notasMedicas = @notasMedicas
	WHERE id_consulta = @id_consulta AND id_mascota = @id_mascota
END
GO


CREATE PROCEDURE sp_EliminarConsulta(
	@id_consulta INT
)
AS
BEGIN
	DELETE FROM DETALLE_CONSULTA_MEDICA 
	WHERE id_consulta = @id_consulta
	
	DELETE FROM CONSULTA_MEDICA
	WHERE id_consulta = @id_consulta
END
GO


CREATE PROCEDURE sp_ListarConsultas
AS
BEGIN
	SELECT TOP 10 M.id_consulta, M.id_cliente, C.nombres AS cliente, 
				 M.id_empleado, E.nombres AS empleado, M.fechaConsulta, M.id_factura
	FROM CONSULTA_MEDICA M INNER JOIN CLIENTE C ON (M.id_cliente = C.id_cliente)
						   INNER JOIN EMPLEADO E ON (M.id_empleado = E.id_empleado)
END
GO


CREATE PROCEDURE sp_ListarConsultasPorIDCliente(
	@id_cliente CHAR(5)
)
AS
BEGIN
	SELECT TOP 10 M.id_consulta, M.id_cliente, C.nombres AS cliente, 
				 M.id_empleado, E.nombres AS empleado, M.fechaConsulta, M.id_factura
	FROM CONSULTA_MEDICA M INNER JOIN CLIENTE C ON (M.id_cliente = C.id_cliente)
						   INNER JOIN EMPLEADO E ON (M.id_empleado = E.id_empleado)
	WHERE M.id_cliente = @id_cliente
END
GO


CREATE PROCEDURE sp_ListarConsultasPorIDEmpleado(
	@id_empleado CHAR(5)
)
AS
BEGIN
	SELECT TOP 10 M.id_consulta, M.id_cliente, C.nombres AS cliente, 
				 M.id_empleado, E.nombres AS empleado, M.fechaConsulta, M.id_factura
	FROM CONSULTA_MEDICA M INNER JOIN CLIENTE C ON (M.id_cliente = C.id_cliente)
						   INNER JOIN EMPLEADO E ON (M.id_empleado = E.id_empleado)
	WHERE M.id_empleado = @id_empleado
END
GO


CREATE PROCEDURE sp_ListarConsultasPorRecienAgregado
AS
BEGIN
	SELECT TOP 10 M.id_consulta, M.id_cliente, C.nombres AS cliente, 
				 M.id_empleado, E.nombres AS empleado, M.fechaConsulta, M.id_factura
	FROM CONSULTA_MEDICA M INNER JOIN CLIENTE C ON (M.id_cliente = C.id_cliente)
						   INNER JOIN EMPLEADO E ON (M.id_empleado = E.id_empleado)
	ORDER BY M.id_consulta DESC
END
GO


CREATE PROCEDURE sp_ObtenerRegistroMedicoPorIDMascota(
	@id_mascota CHAR(5)
)
AS
BEGIN
	SELECT M.id_consulta, M.id_cliente, C.nombres AS cliente, M.id_empleado, E.nombres AS empleado,
	       M.fechaConsulta, DC.motivo, DC.diagnostico, DC.notasMedicas
	FROM CONSULTA_MEDICA M INNER JOIN DETALLE_CONSULTA_MEDICA DC ON (M.id_consulta = DC.id_consulta)
		INNER JOIN CLIENTE C ON (M.id_cliente = C.id_cliente)
		INNER JOIN EMPLEADO E ON (M.id_empleado = E.id_empleado)
	WHERE DC.id_mascota = @id_mascota
END
GO


CREATE PROCEDURE sp_ObtenerMascotasPorIDConsulta(
	@id_consulta INT
)
AS
BEGIN
	SELECT M.id_mascota, M.nombre
	FROM DETALLE_CONSULTA_MEDICA DC INNER JOIN MASCOTA M ON (DC.id_mascota = M.id_mascota)
	WHERE id_consulta = @id_consulta
END
GO




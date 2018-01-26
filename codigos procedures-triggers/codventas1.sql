use ventas
go
truncate table temporal

go
CREATE PROCEDURE sp_del_detped
@cod	char(6)
AS
BEGIN
DELETE temporal WHERE idprod=@cod
END

select * from productos
select * from clientes
select * from empleados
go
create procedure sp_buscarCliente(@idcli char(4))
as
select * from clientes WHERE idcli=@idcli

go
--clientes mant
create procedure sp_insCliente(@idcli varchar(8),
								@razon varchar(30),
								@ruc varchar(11),
								@direccion varchar(30)
								)
as
INSERT INTO clientes(idcli,razon,ruc,direccion) VALUES(@idcli,@razon,@ruc,@direccion)
go
create procedure sp_modcliente(@idcli varchar(8),
								@razon varchar(30),
								@ruc varchar(11),
								@direccion varchar(30)
								)
as
UPDATE clientes SET razon=@razon,ruc=@ruc,direccion=@direccion
WHERE idcli=@idcli
GO

create procedure sp_elicliente(@idcli char(4))
AS
DELETE clientes WHERE idcli=@idcli
GO
--empleados mant
create procedure sp_buscarEmp(@id char(4))
as
select * from empleados WHERE idemp=@id
go

create procedure sp_insEmp(@id varchar(8),
								@ape varchar(30),
								@dir varchar(30)
								)
as
INSERT INTO empleados(idemp,apeemp,diremp) VALUES(@id,@ape,@dir)
go
create procedure sp_modEmp(@id char(4),
								@ape varchar(30),
								@dir varchar(30)
								)
as
UPDATE empleados SET apeemp=@ape,diremp=@dir
WHERE idemp=@id
GO

create procedure sp_eliEmp(@id char(4))
AS
DELETE empleados WHERE idemp=@id
GO
SELECT * FROM empleados
--productos
SELECT * FROM productos
go
create procedure sp_buscarPro(@id char(4))
as
select * from productos WHERE idprod=@id
go

create procedure sp_insPro(@id varchar(8),
								@des varchar(30),
								@pre int,
								@stock int
								)
as
INSERT INTO productos(idprod,descrip,precio,stock) VALUES(@id,@des,@pre,@stock)
go
create procedure sp_modPro(@id varchar(8),
								@des varchar(30),
								@pre int,
								@stock int
								)
as
UPDATE productos SET descrip=@des,precio=@pre, stock=@stock
WHERE idprod=@id
GO

create procedure sp_eliPro(@id char(6))
AS
DELETE productos WHERE idprod=@id
GO

select * from temporal
truncate table temporal

SELECT * FROM temporal WHERE idprod='PROD08'
use ventas
go
-----
/*SELECT f.idfact,DATEPART(DD,F.fecha_fact) AS DIA,DATEPART(MM,f.fecha_fact) AS MES ,DATEPART(YYYY,f.fecha_fact) AS AÑO,
c.razon,c.ruc,c.direccion,df.cantidad,pr.descrip,df.precio,df.subtotal,f.subtotal,f.igv,f.total
FROM facturas f inner join pedidos p
ON f.idped=p.idped inner join clientes c
ON c.idcli=p.idcli inner join detafact df
ON df.idfact=f.idfact inner join productos pr
ON pr.idprod=df.idprod
WHERE f.idfact='fac02'*/
GO
--FILTRO1

CREATE procedure sp_filped_cli(@par1 varchar(30))
AS
select p.* from pedidos p inner join clientes c
ON p.idcli=c.idcli
WHERE c.idcli=@par1 or c.razon=@par1 or c.ruc=@par1
--filtro1b
go
CREATE procedure sp_filped_emp(@par1 varchar(30))
AS
select p.* from pedidos p inner join empleados e
ON p.idemp=e.idemp
WHERE e.idemp=@par1 or e.apeemp=@par1 or e.diremp=@par1
--detailped
GO
CREATE procedure  sp_det1(@ped varchar(30))
as
SELECT pr.descrip,dp.pre_venta,dp.cantidad,dp.subtot FROM detaped dp inner join productos pr
ON dp.idprod=pr.idprod
WHERE dp.idped= @ped
----------
select dp.* from detaped dp inner join productos pr
ON dp.idprod=pr.idprod inner join pedidos p
ON p.idped=dp.idped
where pr.descrip='cpu' and p.idped='p001'

---
GO
CREATE PROCEDURE sp_ped_fec(@mes1 char(2),@mes2 char(2),@año char(4))
AS
SELECT * FROM pedidos 
WHERE DATEPART(MM,fecha) BETWEEN @mes1 AND @mes2
AND DATEPART(YYYY,fecha)=@año

select * from clientes
select * from pedidos
select * from detaped
select * from facturas
select * from detafact
select * from temporal
delete from temporal

SELECT idprod FROM detaped
WHERE idped='P001'
select * from facturas
select * from empleados
GO
CREATE PROCEDURE sp_dp_pro(@nompro varchar(30))
AS
SELECT DISTINCT p.* FROM detaped dp inner join productos pr
ON dp.idprod= pr.idprod inner join pedidos p
ON p.idped=dp.idped
WHERE pr.descrip =@nompro
------------
go
create view v_ped_det_pro
as
SELECT DISTINCT pr.descrip FROM detaped dp inner join productos pr
ON dp.idprod= pr.idprod inner join pedidos p
ON p.idped=dp.idped
GO
----------------
create PROCEDURE sp_cons_fac(@par2 VARCHAR(30))
AS
SELECT f.* FROM detafact df inner join productos pr
ON df.idprod=pr.idprod INNER JOIN facturas f
ON f.idfact=df.idfact INNER JOIN pedidos p
ON p.idped=f.idped INNER JOIN clientes c
ON c.idcli=p.idcli INNER JOIN empleados e
ON e.idemp=p.idemp
WHERE c.razon=@par2 or e.apeemp=@par2 or pr.descrip=@par2
go
-------------
CREATE PROCEDURE sp_ped(@cod varchar(8))
AS
SELECT c.idcli,c.razon,e.idemp,e.apeemp FROM PEDIDOS p INNER JOIN clientes c
on p.idcli=c.idcli inner join empleados e
ON e.idemp=p.idemp
WHERE p.idped=@cod
go
----------------------
CREATE PROCEDURE sp_detped(@cod varchar(8))
as
select idprod,pre_venta,cantidad,subtot from detaped
WHERE idped=@cod
go
---------------------
create PROCEDURE sp_insfac(@cod varchar(8),@ped varchar(8),@fec varchar(50),@subt float,@igv float,@tot float)
as
INSERT INTO facturas values(@cod,@ped,@fec,@subt,@igv,@tot)
go
-----------------------
create PROCEDURE sp_detfac(@cf varchar(8),@cpr varchar(8),@pre int,@cant int ,@subt float)
as
INSERT INTO detafact values(@cf,@cpr,@pre,@cant,@subt)
select * from detafact
select * from facturas

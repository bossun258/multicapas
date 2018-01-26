use ventas 
go
create PROCEDURE sp_instemp(@coddoc varchar(8),@codpro varchar(8),@preu int,@cant int)
as
INSERT INTO temporal VALUES(@coddoc,@codpro,@preu,@cant)
go
-----------------
create PROCEDURE sp_insdetaped(@coddoc varchar(8),@codpro varchar(8),@preu int,@cant int)
as
INSERT INTO detaped VALUES(@coddoc,@codpro,@preu,@cant,'')
go
-----------
create PROCEDURE sp_insped(@codped varchar(8),@fec varchar(30),@codcli varchar(8),@codemp varchar(8))
as
INSERT INTO pedidos VALUES(@codped,@fec,@codcli,@codemp,'')
go
------------------------
CREATE PROCEDURE [dbo].[sp_df_pro](@nompro varchar(30))
AS
SELECT DISTINCT f.* FROM detafact df inner join productos pr
ON df.idprod= pr.idprod inner join facturas f
ON f.idfact=df.idfact
WHERE pr.descrip =@nompro
go
----------------------
create procedure  [dbo].[sp_v_detfac](@fac varchar(30))
as
SELECT pr.descrip,df.precio,df.cantidad,df.subtotal FROM detafact df inner join productos pr
ON df.idprod=pr.idprod
WHERE df.idfact= @fac
go
-------------------
CREATE procedure [dbo].[sp_fac_cli](@par1 varchar(30))
AS
select f.* from facturas f inner join pedidos p
ON f.idped=p.idped inner join clientes c
ON p.idcli=c.idcli
WHERE c.idcli=@par1 or c.razon=@par1 or c.ruc=@par1
go
-------------------------
create procedure [dbo].[sp_fac_emp](@par1 varchar(30))
AS
select f.* from facturas f inner join pedidos p 
ON f.idped=p.idped inner join empleados e
ON p.idemp=e.idemp
WHERE e.idemp=@par1 or e.apeemp=@par1 or e.diremp=@par1
go
--------------------
create PROCEDURE [dbo].[sp_fac_fec](@mes1 char(2),@mes2 char(2),@año char(4))
AS
SELECT * FROM facturas 
WHERE DATEPART(MM,fecha_fact) BETWEEN @mes1 AND @mes2
AND DATEPART(YYYY,fecha_fact)=@año
------------
select * from usuario
SELECT * FROM usuario WHERE usu='dueño'
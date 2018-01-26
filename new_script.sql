CREATE TABLE proforma(
idprof varchar(8) not null primary key,
nameprof varchar(50) not null,
fecha varchar(50) null,
idcli varchar(8) references clientes(idcli),
nomcliente varchar(50),
total float 
)


CREATE TABLE detproforma(
iddetprof varchar(8) primary key,
idprof varchar(8) references proforma(idprof),
idprod varchar(8) references productos(idprod),
nomprod varchar(50) null,
precio float null,
cantidad int null
)


CREATE TABLE boleta(
idbol varchar(8) not null primary key, 
idped varchar(8) not null,
fecha_fact varchar(50),
total float
)


CREATE TABLE detboleta(
iddetbol varchar(8) primary key,
idbol varchar(8) references boleta(idbol),
idprod varchar(8) references productos (idprod),
precio int,
cantidad int,
subtotal float
)


CREATE TABLE temp_proforma(
idtempprof VARCHAR(8) null,
idprodc VARCHAR(8) NULL,
nomprod VARCHAR(50) not null,
precio FLOAT NULL,
cantidad INT
)


CREATE PROCEDURE sp_setProforma(@cod varchar(8),@name varchar(50),  @fech varchar(50),@idcli varchar(8),@nomcli varchar(50), @total float)
as
INSERT INTO proforma values(@cod,@name, @fech,@idcli,@nomcli,@total)
go
-----------------------
CREATE PROCEDURE sp_setDetProforma(@iddetprof varchar(8),@idprof varchar(8),@idprod varchar(8),@nomprod varchar(50),@pre int,@cant int )
as
INSERT INTO detproforma values(@iddetprof,@idprof,@idprod,@nomprod,@pre,@cant)
GO
-----------------------
CREATE PROCEDURE sp_setTempProf(@cod varchar(8), @codprod varchar(8),@nomprod varchar(50), @precio float, @cant int)
as 
INSERT INTO temp_proforma VALUES(@cod,@codprod,@nomprod,@precio,@cant)
GO
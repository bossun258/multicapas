use master
go
create database ventas
go
use ventas
go
create table clientes
(
 idcli varchar (8) not null primary key,
razon varchar (30) null,
ruc varchar (11) null,
direccion varchar(30) null,
)
go

create table empleados
(
idemp varchar(8) not null primary key,
apeemp varchar(30) null,
diremp varchar (30) null,
)
go

create table productos
(
idprod varchar (8) not null primary key,
descrip varchar(30) null,
precio int null,
stock int null,
)
go

create table pedidos(
idped varchar (8)not null primary key,
fecha varchar(50),
idcli varchar (8) null references clientes(idcli),
idemp varchar (8) null references empleados(idemp),
Total float null,
)
------------------------
create table detaped(
idped varchar (8)null references pedidos(idped),
idprod varchar (8)null references productos(idprod),
pre_venta int null,
cantidad int null,
subtot float null,
)
go
-----------------
create table facturas(
idfact varchar(8) not null primary key, 
idped varchar(8) not null,
fecha_fact varchar(50),
subtotal float,
igv float,
total float
)

CREATE table detafact(
idfact varchar(8) references facturas(idfact),
idprod varchar(8) references productos (idprod),
precio int,
cantidad int,
subtotal float
)


insert into clientes (idcli, razon,ruc,direccion)
values ('C001','WONG','45698745214','LINCE')
insert into clientes (idcli, razon,ruc,direccion)
values ('C002','METRO','25478963214','BREÑA')
insert into clientes (idcli, razon,ruc,direccion)
values ('C003','TOTUS','57896541236','SURCO')
insert into clientes (idcli, razon,ruc,direccion)
values ('C004','PLAZA VEA','78912545789','MIRAFLORES')
insert into clientes (idcli, razon,ruc,direccion)
values ('C005','SAGA','36954785214','SAN ISIDRO')
insert into clientes (idcli, razon,ruc,direccion)
values ('C006','PIPLEY','37682416985','SAN MIGUEL')
insert into clientes (idcli, razon,ruc,direccion)
values ('C007','YOMPIAN','58963214785','SURCO')
insert into clientes (idcli, razon,ruc,direccion)
values ('C008','CARSA','58693265987','SURQUILLO')
insert into clientes (idcli, razon,ruc,direccion)
values ('C009','MINISOL','58691948753','SAN MIGUEL')
insert into clientes (idcli, razon,ruc,direccion)
values ('C010','MINISOL','58691948753','SAN BORJA')
insert into clientes (idcli, razon,ruc,direccion)
values ('C011','MINISOL','58691948753','SAN LUIS')
insert into clientes (idcli, razon,ruc,direccion)
values ('C012','MINISOL','58691948753','SANTA ANITA')
insert into clientes (idcli, razon,ruc,direccion)
values ('C013','PARTES','58691948753','SAN MIGUEL')
insert into clientes (idcli, razon,ruc,direccion)
values ('C014','SPWIES','58691948753','SAN BROJA')
insert into clientes (idcli, razon,ruc,direccion)
values ('C015','MINKA','58691948753','SAN ROQUE')
insert into clientes (idcli, razon,ruc,direccion)
values ('C016','SOLDIAC','58691948753','SAN LUIS')
insert into clientes (idcli, razon,ruc,direccion)
values ('C017','SOLDOC','58691948753','SAN MIGUEL')
insert into clientes (idcli, razon,ruc,direccion)
values ('C018','FRUTIS','58691948753','SAN MIGUEL')
insert into clientes (idcli, razon,ruc,direccion)
values ('C019','MANC','58691948753','SAN MIGUEL')
insert into clientes (idcli, razon,ruc,direccion)
values ('C020','MINISOL','58691948753','SAN MIGUEL')
go








INSERT into empleados(idemp,apeemp,diremp)
values ('E001','FLORES','SURCO')
INSERT into empleados(idemp,apeemp,diremp)
values ('E002','QUISPE','BREÑA')
INSERT into empleados(idemp,apeemp,diremp)
values ('E003','RAMIREZ','LINCE')
INSERT into empleados(idemp,apeemp,diremp)
values ('E004','OSCANOA','JESUS MARIA')
INSERT into empleados(idemp,apeemp,diremp)
values ('E005','MARTINES','SURQUILLO')
INSERT into empleados(idemp,apeemp,diremp)
values ('E006','CAYCHO','SAN JUAN DE MIRAFLORES')
INSERT into empleados(idemp,apeemp,diremp)
values ('E007','MONTENEGRO','VILLA EL SALVADOR')
INSERT into empleados(idemp,apeemp,diremp)
values ('E008','OLIVERA','SURQUILLO')
INSERT into empleados(idemp,apeemp,diremp)
values ('E009','CAYCHO','PACHACAMAC')
INSERT into empleados(idemp,apeemp,diremp)
values ('E010','AVALOS','VILLA MARIA')
INSERT into empleados(idemp,apeemp,diremp)
values ('E011','CAMPOS','LINCE')
INSERT into empleados(idemp,apeemp,diremp)
values ('E012','ALEJOS','COMAS')
INSERT into empleados(idemp,apeemp,diremp)
values ('E013','SANTOS','ATE VITARTE')
INSERT into empleados(idemp,apeemp,diremp)
values ('E014','FERNANDEZ','CANADA')
INSERT into empleados(idemp,apeemp,diremp)
values ('E015','CARHUAMACA','LA MOLINA')
INSERT into empleados(idemp,apeemp,diremp)
values ('E016','URBANO','LOS OLIVOS')
INSERT into empleados(idemp,apeemp,diremp)
values ('E017','MELCHERT','SURCO')
INSERT into empleados(idemp,apeemp,diremp)
values ('E018','ROJAS','SAN BORJA')
INSERT into empleados(idemp,apeemp,diremp)
values ('E019','SALVATIERRA','SAN JUAN DE LURIGANCHO')
INSERT into empleados(idemp,apeemp,diremp)
values ('E020','LINEO','AGUSTINO')
go






insert into productos(idprod,descrip,precio,stock)
values ('PROD01','TV','1000','30')
insert into productos(idprod,descrip,precio,stock)
values ('PROD02','DVD','500','50')
insert into productos(idprod,descrip,precio,stock)
values ('PROD03','IMPRESORAS','750','25')
insert into productos(idprod,descrip,precio,stock)
values ('PROD04','QUEMADOR','600','35')
insert into productos(idprod,descrip,precio,stock)
values ('PROD05','LECTORA','100','100')
insert into productos(idprod,descrip,precio,stock)
values ('PROD06','TV/BLACO Y NEGRO','500','20')
insert into productos(idprod,descrip,precio,stock)
values ('PROD07','CASETTE','80','50')
insert into productos(idprod,descrip,precio,stock)
values ('PROD08','IMPRESORAS','750','25')
insert into productos(idprod,descrip,precio,stock)
values ('PROD09','QUEMADOR','600','35')
insert into productos(idprod,descrip,precio,stock)
values ('PROD10','CD','100','100')
insert into productos(idprod,descrip,precio,stock)
values ('PROD11','DVD','100','100')
insert into productos(idprod,descrip,precio,stock)
values ('PROD12','HDD','100','100')
insert into productos(idprod,descrip,precio,stock)
values ('PROD13','IMPRESORA EPSOON','350','30')
insert into productos(idprod,descrip,precio,stock)
values ('PROD14','SCANERR','150','25')
insert into productos(idprod,descrip,precio,stock)
values ('PROD15','CD','100','15')
insert into productos(idprod,descrip,precio,stock)
values ('PROD16','QUEMADORA','100','20')
insert into productos(idprod,descrip,precio,stock)
values ('PROD17','CPU','100','10')
insert into productos(idprod,descrip,precio,stock)
values ('PROD18','JOISTIK','100','15')
insert into productos(idprod,descrip,precio,stock)
values ('PROD19','USB','15','34')
go



INSERT INTO PEDIDOS(IDPED,FECHA,IDCLI,IDEMP)
VALUES ('P001','05/04/05','C001','E003')
INSERT INTO PEDIDOS(IDPED,FECHA,IDCLI,IDEMP)
VALUES ('P002','06/04/05','C003','E003')
INSERT INTO PEDIDOS(IDPED,FECHA,IDCLI,IDEMP)
VALUES ('P003','07/04/05','C002','E001')
INSERT INTO PEDIDOS(IDPED,FECHA,IDCLI,IDEMP)
VALUES ('P004','05/05/05','C003','E002')
INSERT INTO PEDIDOS(IDPED,FECHA,IDCLI,IDEMP)
VALUES ('P005','06/04/05','C002','E002')
INSERT INTO PEDIDOS(IDPED,FECHA,IDCLI,IDEMP)
VALUES ('P006','05/05/05','C003','E001')
INSERT INTO PEDIDOS(IDPED,FECHA,IDCLI,IDEMP)
VALUES ('P007','06/05/06','C002','E001')
INSERT INTO PEDIDOS(IDPED,FECHA,IDCLI,IDEMP)
VALUES ('P008','06/06/06','C004','E001')
INSERT INTO PEDIDOS(IDPED,FECHA,IDCLI,IDEMP)
VALUES ('P009','06/07/06','C005','E001')
INSERT INTO PEDIDOS(IDPED,FECHA,IDCLI,IDEMP)
VALUES ('P010','06/08/06','C001','E001')
INSERT INTO PEDIDOS(IDPED,FECHA,IDCLI,IDEMP)
VALUES ('P011','06/05/08','C008','E006')
INSERT INTO PEDIDOS(IDPED,FECHA,IDCLI,IDEMP)
VALUES ('P012','06/09/08','C008','E006')
INSERT INTO PEDIDOS(IDPED,FECHA,IDCLI,IDEMP)
VALUES ('P013','06/06/08','C009','E006')
INSERT INTO PEDIDOS(IDPED,FECHA,IDCLI,IDEMP)
VALUES ('P014','06/07/08','C010','E006')
INSERT INTO PEDIDOS(IDPED,FECHA,IDCLI,IDEMP)
VALUES ('P015','03/05/09','C010','E008')
INSERT INTO PEDIDOS(IDPED,FECHA,IDCLI,IDEMP)
VALUES ('P016','06/05/09','C010','E008')
INSERT INTO PEDIDOS(IDPED,FECHA,IDCLI,IDEMP)
VALUES ('P017','09/02/09','C011','E008')
INSERT INTO PEDIDOS(IDPED,FECHA,IDCLI,IDEMP)
VALUES ('P018','07/05/09','C011','E005')
INSERT INTO PEDIDOS(IDPED,FECHA,IDCLI,IDEMP)
VALUES ('P019','06/06/09','C011','E005')
INSERT INTO PEDIDOS(IDPED,FECHA,IDCLI,IDEMP)
VALUES ('P020','06/08/09','C011','E005')
go


INSERT INTO DETAPED(IDPED,IDPROD,PRE_VENTA,CANTIDAD)
VALUES ('P001','PROD02','600','2')
INSERT INTO DETAPED(IDPED,IDPROD,PRE_VENTA,CANTIDAD)
VALUES ('P001','PROD01','1200','1')
INSERT INTO DETAPED(IDPED,IDPROD,PRE_VENTA,CANTIDAD)
VALUES ('P001','PROD03','800','2')
INSERT INTO DETAPED(IDPED,IDPROD,PRE_VENTA,CANTIDAD)
VALUES ('P002','PROD02','600','1')
INSERT INTO DETAPED(IDPED,IDPROD,PRE_VENTA,CANTIDAD)
VALUES ('P002','PROD01','1200','2')
INSERT INTO DETAPED(IDPED,IDPROD,PRE_VENTA,CANTIDAD)
VALUES ('P003','PROD04','600','2')
INSERT INTO DETAPED(IDPED,IDPROD,PRE_VENTA,CANTIDAD)
VALUES ('P003','PROD05','150','3')
INSERT INTO DETAPED(IDPED,IDPROD,PRE_VENTA,CANTIDAD)
VALUES ('P004','PROD04',951,15)
INSERT INTO DETAPED(IDPED,IDPROD,PRE_VENTA,CANTIDAD)
VALUES ('P006','PROD03',365,10)
INSERT INTO DETAPED(IDPED,IDPROD,PRE_VENTA,CANTIDAD)
VALUES ('P006','PROD09',258,20)
INSERT INTO DETAPED(IDPED,IDPROD,PRE_VENTA,CANTIDAD)
VALUES ('P006','PROD06',158,13)
INSERT INTO DETAPED(IDPED,IDPROD,PRE_VENTA,CANTIDAD)
VALUES ('P005','PROD08',350,85)
INSERT INTO DETAPED(IDPED,IDPROD,PRE_VENTA,CANTIDAD)
VALUES ('P005','PROD07',200,3)
INSERT INTO DETAPED(IDPED,IDPROD,PRE_VENTA,CANTIDAD)
VALUES ('P008','PROD05',150,9)
INSERT INTO DETAPED(IDPED,IDPROD,PRE_VENTA,CANTIDAD)
VALUES ('P008','PROD06',150,7)
INSERT INTO DETAPED(IDPED,IDPROD,PRE_VENTA,CANTIDAD)
VALUES ('P008','PROD03',200,2)
go
select * from pedidos
go
select * from detaped
go


Create trigger trg_ins_dp
on detaped
for insert
as
update detaped set subtot=pre_venta*cantidad
go

Create trigger tg_act_Totales
on detaped
for insert
as
update pedidos set total=(select sum(dp.subtot)
from detaped dp 
where Pedidos.IdPed=dp.Idped)
go

Create trigger act_subtot_detafact
on detafact
for insert
as
update detafact set subtotal=precio*cantidad
go
create trigger act_subtot_fact
on detafact
for insert
as
update facturas set total=(select sum(subtotal)
from detafact 
where facturas.idfact=detafact.idfact )
go
Create trigger act_igv_fact
on detafact
for insert
as
update facturas set igv=subtotal*0.18
go
Create trigger act_total_fact
on detafact
for insert
as
update facturas set total=subtotal+igv
go

--delete from detaped
--ALTER TABLE detaped
--enable TRIGGER trg_ins_dp

--ALTER TABLE detaped
--disable TRIGGER trg_ins_dp

create table temporal(
idped varchar (8)null,
idprod varchar (8)null,
pre_venta int null,
cantidad int null,
)
go

create view listado
as
select p.idped,p.fecha,p.idcli,p.idemp,c.razon,e.apeemp,
dp.idprod,pr.descrip,dp.pre_venta,dp.cantidad,dp.subtot,
p.total from pedidos p,clientes c, empleados e,
detaped dp,productos pr  where
p.idped=dp.idped and p.idcli=c.idcli and p.idemp=e.idemp and
dp.idprod=pr.idprod
go
-----------------------
create table T_user(
idT_user	int not null primary key,
codT_user	varchar(20) unique,
)
go
----------------------
create table usuario(
coduser varchar(5) not null primary key,
usu varchar(15) not null unique,
nombres varchar(30) not null,
contra varchar(20) null,
idT_user	int not null references T_user(idT_user)
)

go
----------------------
insert into T_user values (1,'admin'),(2,'user')
---------------------------------------------
insert into usuario
values('U0001','Gerente','Juan Requelme','11111',2)
insert into usuario
values('U0002','Dueño','Julio Manrique','22222',1)
go

create trigger tr_002
on detafact
for insert
as
update facturas set subtotal=
(select sum(detafact.subtotal) from detafact where
facturas.idfact=detafact.idfact)
go
-------------------
create trigger tr_003
on detafact
for insert
as
update facturas 
set facturas.igv =facturas.subtotal * 0.18
go
------------------
create trigger tr_004
on detafact
for insert
as
update facturas 
set facturas.total = facturas.subtotal + facturas.igv
go


create procedure filtra_factura
@id varchar(8)
as
begin
select f.idfact,f.fecha_fact,f.idped,c.razon,e.apeemp,
df.idprod,pr.descrip,df.precio,df.cantidad,
df.subtotal,f.subtotal,f.igv,f.total from
facturas f inner join pedidos p on f.idped=p.idped
inner join clientes c on p.idcli=c.idcli
inner join empleados e on p.idemp =e.idemp 
inner join detafact df on f.idfact=df.idfact
inner join productos pr on df.idprod=pr.idprod
where f.idfact=@id
end


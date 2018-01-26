create view v_listuser
as
select  u.usu,u.nombres,u.contra,tu.codT_user from usuario u inner join T_user tu
ON u.idT_user=tu.idT_user
go
------------------
create procedure sp_insuser(@cod varchar(5),@user varchar(15),@nom varchar(30),@pass varchar(20),@codTU int)
as
insert into usuario values (@cod, @user,@nom,@pass,@codTU)
GO
------------------------------
create procedure sp_moduser(@cod varchar(5),@user varchar(15),@nom varchar(30),@pass varchar(20),@codTU int)
as
update usuario set usu=@user,nombres=@nom,contra=@pass,idT_user=@codTU
WHERE coduser=@cod
go
----------------------
create procedure sp_bus_user(@par varchar(5))
as
select  u.usu,u.nombres,u.contra,tu.codT_user from usuario u inner join T_user tu
ON u.idT_user=tu.idT_user
WHERE u.coduser=@par
go
-----------------------------

--------------------------------------------
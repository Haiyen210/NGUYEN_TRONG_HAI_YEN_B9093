
create database  Webservice 
go
use  Webservice 

create table  TblCountries(
	CountryId int primary key identity ,
	CountryName nvarchar(255),
	Position nvarchar(250),
	Area nvarchar(250),
	Population int,
)

insert into TblCountries (CountryName, Position,Area,Population) values
( 'Viet Nam', 'Hai Duong', 'Chi linh', 1000000 )

select * from TblCountries
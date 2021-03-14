/*
Se requiere tener un listado de los clientes que corresponden a empresas de 
responsabilidad limitada (Ltd), con sus l�mites de cr�dito ordenados de mayor a menor
*/

select CUSTOMERNUMBER, CUSTOMERNAME, CREDITLIMIT from CUSTOMERS C
WHERE c.CUSTOMERNAME LIKE '%Ltd%'
order by c.creditlimit desc;
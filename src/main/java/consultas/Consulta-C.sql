/*
Se requiere tener un listado con los representantes de venta (Sales Rep) y su cartera de 
clientes (cantidad de empresas que atienden), ordenado de forma descendente desde la 
cartera más grande.*/

select e.employeenumber, e.firstname, e.lastname, count(c.salesrepemployeenumber) as CarteraClientes from employees E 
left join customers C
ON e.employeeNumber = c.salesRepEmployeeNumber
group by e.employeenumber, e.firstname, e.lastname
order by CarteraClientes desc;
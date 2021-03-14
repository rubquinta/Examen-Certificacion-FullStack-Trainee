/*
Se requiere un ranking de ventas por oficina. Esto es, la cantidad de órdenes que han sido 
cursadas por los clientes, asociados a los representantes de venta de cada oficina. El listado 
debe estar ordenado por cantidad de ventas de mayor a menor.
*/

select o.country, o.city, COUNT(ord.customernumber) AS cantidadVentas from OFFICES O
LEFT JOIN EMPLOYEES E
ON O.OFFICECODE = E.OFFICECODE
LEFT JOIN CUSTOMERS C
ON E.EMPLOYEENUMBER = C.SALESREPEMPLOYEENUMBER
LEFT JOIN ORDERS ORD
ON C.CUSTOMERNUMBER = ORD.CUSTOMERNUMBER
GROUP BY  o.country, o.city
ORDER BY cantidadVentas desc;
/*
Se requiere un ranking de los clientes que más compraron (monto de la orden, es decir, 
precio por cantidad pedida de cada producto de la orden) durante el año 2004, ordenado 
de mayor a menor suma de monto.
*/

SELECT C.CUSTOMERNAME, SUM(OD.QUANTITYORDERED*od.priceeach) AS SUMAMONTOORDENES  FROM CUSTOMERS C 
LEFT JOIN ORDERS O
ON C.CUSTOMERNUMBER = O.CUSTOMERNUMBER
LEFT JOIN ORDERDETAILS OD
ON O.ORDERNUMBER = OD.ORDERNUMBER 
WHERE  OD.QUANTITYORDERED  IS NOT NULL
GROUP BY C.CUSTOMERNAME
ORDER BY SUMAMONTOORDENES DESC;

 
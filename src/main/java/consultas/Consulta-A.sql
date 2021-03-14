/*
Se requiere una nómina con los datos de los representantes de venta (Sales Rep) junto al 
país y oficina al cual pertenece. Ordene alfabéticamente por país, ciudad y primer nombre.
*/

select O.COUNTRY, O.CITY, E.FIRSTNAME, E.LASTNAME, E.EMAIL from offices O
LEFT JOIN employees E
ON O.OFFICECODE = E.OFFICECODE
ORDER BY O.COUNTRY asc, O.CITY asc, E.FIRSTNAME ASC;


/*traer por oficina*/
SELECT e.employeenumber AS NUMEMPLEADO, 
e.firstname || ' ' || e.lastname as NOMBRE,
e.email AS MAIL,
o.state as OFICINA,
e.reportsto AS MANAGER
FROM EMPLOYEES E
left join OFFICES O
ON e.officecode = o.officecode
where e.officecode = 1;

/*traer por manager*/
SELECT e.employeenumber AS NUMEMPLEADO, 
e.firstname || ' ' || e.lastname as NOMBRE,
e.email AS MAIL,
o.state as OFICINA,
e.reportsto AS MANAGER
FROM EMPLOYEES E
left join OFFICES O
ON e.officecode = o.officecode
where e.reportsto = 1143;



/*
oficina
*/
SELECT o.officecode as numOficina, o.state as oficina
FROM OFFICES O 
group by o.officecode, o.state
order by o.officecode asc
;

/*
managers
*/

SELECT e.employeenumber as numManager,
e.firstname || ' ' || e.lastname as Managers,
e.reportsto
from employees e ;
 

 

 
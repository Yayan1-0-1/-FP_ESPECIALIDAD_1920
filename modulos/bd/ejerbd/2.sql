select  comision, nombre,salario 
from empleados 
where num_hijos >3 
order by COMISION;

select * from departamentos 
where depto_jefe is not null;

select nombre, salario from empleados 
where salario >1250 and salario <1300 and NUM_HIJOS>1;

select trunc(months_between(sysdate,fecha_ingreso)),nombre
from empleados;

select * from empleados 
where trunc(months_between(sysdate , fecha_ingreso)/12)>35;
select nombre from empleados
where salario>(10salario)select nombre ,(num_hijos)from empleados;

select * from empleados E ,departamentos D ,centros C 
where E.departamento = D.numero and 
D.centro= C.numero and 
C.direccion like '%ATOCHA%' AND 
num_hijos=2;

select numero from departamentos 
intersect 
select depto_jefe from departamentos;

select d.numero, d.nombre, c.numero, c.nombre from departamentos d, centros c  
where d.centro= c.numero; 

select nombre, salario from empleados
where salario between 1250 and 1300
intersect
select nombre, salario from empleados
where num_hijos>=1;

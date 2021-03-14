package cl.PruebaTD.classicmodelsf.dao;

import java.util.List;

import cl.PruebaTD.classicmodelsf.model.Empleado;

public interface IEmpleadoDao {
	
	public List<Empleado> obtenerEmpleadoPorOficina(int oficina);

	public List<Empleado> todosEmpleados();
	
	public List<Empleado> obtenerEmpleadoPorManager(int manager);
}

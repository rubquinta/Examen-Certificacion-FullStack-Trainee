package cl.PruebaTD.classicmodelsf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cl.PruebaTD.classicmodelsf.dao.IEmpleadoDao;
import cl.PruebaTD.classicmodelsf.model.Empleado;

@RestController
public class RestControlador {
	
	@Autowired
	IEmpleadoDao emp;
	
	@RequestMapping(value="/veroficina/{ofi}", method=RequestMethod.GET, headers = "Accept=application/json")
	public List<Empleado> obtenerEmpleados(@PathVariable("ofi") int ofi){
		
		List<Empleado> listaEmp = emp.obtenerEmpleadoPorOficina(ofi);
		
		return listaEmp;
	}
	
	@RequestMapping(value="/veroficinam/{man}", method=RequestMethod.GET, headers = "Accept=application/json")
	public List<Empleado> obtenerEmpleados2(@PathVariable("man") int man){
		
		List<Empleado> listaEmp = emp.obtenerEmpleadoPorManager(man);
		
		return listaEmp;
	}

}

package cl.PruebaTD.classicmodelsf;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cl.PruebaTD.classicmodelsf.dao.IEmpleadoDao;
import cl.PruebaTD.classicmodelsf.dao.IManagerDao;
import cl.PruebaTD.classicmodelsf.dao.IOficinasDao;
import cl.PruebaTD.classicmodelsf.model.Empleado;
import cl.PruebaTD.classicmodelsf.model.Manager;
import cl.PruebaTD.classicmodelsf.model.Oficinas;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	IEmpleadoDao emp;
	
	@Autowired
	IOficinasDao ofi;
	
	@Autowired
	IManagerDao man;
	
	 
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String home(Model model ) {
		
		List<Empleado> lempleados = emp.todosEmpleados();
		List<Oficinas> oficinas = ofi.allOficinas();
		List<Manager> manager = man.allManagers();
		
		model.addAttribute("empleados",lempleados);
		model.addAttribute("oficinas", oficinas);
		model.addAttribute("manager", manager);
		
		
		return "principal";
	}
	

	@RequestMapping(value="/veroficina", method = RequestMethod.POST)
	public String verOficina(Model model, @RequestParam("oficina") int oficina 
			 ) {
		
		List<Empleado> lempleados = emp.obtenerEmpleadoPorOficina(oficina); 
		List<Oficinas> oficinas = ofi.allOficinas();
		List<Manager> manager = man.allManagers();
		
		model.addAttribute("empleados",lempleados);
		model.addAttribute("oficinas", oficinas);
		model.addAttribute("manager", manager); 
		
		
		return "principal2";
	}
	
}

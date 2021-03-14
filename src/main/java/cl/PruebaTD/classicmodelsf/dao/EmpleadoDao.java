package cl.PruebaTD.classicmodelsf.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import cl.PruebaTD.classicmodelsf.model.Empleado; 

public class EmpleadoDao implements IEmpleadoDao {
	
JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	@Override
	public List<Empleado> todosEmpleados() {

		String query = "SELECT e.employeenumber AS NUMEMPLEADO, \r\n"
				+ "e.firstname || ' ' || e.lastname as NOMBRE,\r\n"
				+ "e.email AS MAIL,\r\n"
				+ "o.state as OFICINA,\r\n"
				+ "e.reportsto AS MANAGER\r\n"
				+ "FROM EMPLOYEES E\r\n"
				+ "left join OFFICES O\r\n"
				+ "ON e.officecode = o.officecode\r\n"
				 ;
		
		return template.query(query, new RowMapper<Empleado>() {
			public Empleado mapRow(ResultSet rs, int row) throws SQLException{
				Empleado df = new Empleado();
				df.setNumEmpleado(rs.getInt(1));
				df.setNombre(rs.getString(2));
				df.setMail(rs.getString(3));
				df.setOficina(rs.getString(4));
				df.setManager(rs.getString(5)); 
				return df;	
			}
			});
	}
	
	

	@Override
	public List<Empleado> obtenerEmpleadoPorOficina(int oficina) {

		String query = "SELECT e.employeenumber AS NUMEMPLEADO, \r\n"
				+ "e.firstname || ' ' || e.lastname as NOMBRE,\r\n"
				+ "e.email AS MAIL,\r\n"
				+ "o.state as OFICINA,\r\n"
				+ "e.reportsto AS MANAGER\r\n"
				+ "FROM EMPLOYEES E\r\n"
				+ "left join OFFICES O\r\n"
				+ "ON e.officecode = o.officecode\r\n"
				+ "where e.officecode = " + oficina + "";
		
		return template.query(query, new RowMapper<Empleado>() {
			public Empleado mapRow(ResultSet rs, int row) throws SQLException{
				Empleado df = new Empleado();
				df.setNumEmpleado(rs.getInt(1));
				df.setNombre(rs.getString(2));
				df.setMail(rs.getString(3));
				df.setOficina(rs.getString(4));
				df.setManager(rs.getString(5)); 
				return df;	
			}
			});
		
	}

	@Override
	public List<Empleado> obtenerEmpleadoPorManager(int manager) {
		String query = "SELECT e.employeenumber AS NUMEMPLEADO, \r\n"
				+ "e.firstname || ' ' || e.lastname as NOMBRE,\r\n"
				+ "e.email AS MAIL,\r\n"
				+ "o.state as OFICINA,\r\n"
				+ "e.reportsto AS MANAGER\r\n"
				+ "FROM EMPLOYEES E\r\n"
				+ "left join OFFICES O\r\n"
				+ "ON e.officecode = o.officecode\r\n"
				+ "where e.reportsto = " + manager + "";
		
		return template.query(query, new RowMapper<Empleado>() {
			public Empleado mapRow(ResultSet rs, int row) throws SQLException{
				Empleado df = new Empleado();
				df.setNumEmpleado(rs.getInt(1));
				df.setNombre(rs.getString(2));
				df.setMail(rs.getString(3));
				df.setOficina(rs.getString(4));
				df.setManager(rs.getString(5)); 
				return df;	
			}
			});
		 
		
		
	}
	
	

}

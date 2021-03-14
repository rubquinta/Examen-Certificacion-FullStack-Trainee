package cl.PruebaTD.classicmodelsf.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import cl.PruebaTD.classicmodelsf.model.Manager; 

public class ManagerDao implements IManagerDao{
	
	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	} 

	@Override
	public List<Manager> allManagers() {
		String query = "SELECT e.employeenumber as numManager,\r\n"
				+ "e.firstname || ' ' || e.lastname as Managers,\r\n"
				+ "e.reportsto\r\n"
				+ "from employees e"
				 ;
		return template.query(query, new RowMapper<Manager>() {
			public Manager mapRow(ResultSet rs, int row) throws SQLException{
				Manager df = new Manager();
				df.setNumManager(rs.getInt(1));
				df.setManagers(rs.getString(2));  
				return df;	
			}
			});
	}
}
	 
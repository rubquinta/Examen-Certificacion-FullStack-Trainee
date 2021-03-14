package cl.PruebaTD.classicmodelsf.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
 
import cl.PruebaTD.classicmodelsf.model.Oficinas;

public class OficinasDao implements IOficinasDao{
	
JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	} 

	@Override
	public List<Oficinas> allOficinas() {
		String query = "SELECT o.officecode as numOficina, o.state as oficina\r\n"
				+ "FROM OFFICES O \r\n"
				+ "group by o.officecode, o.state\r\n"
				+ "order by o.officecode asc"
				 ;
		
		return template.query(query, new RowMapper<Oficinas>() {
			public Oficinas mapRow(ResultSet rs, int row) throws SQLException{
				Oficinas df = new Oficinas();
				df.setNumOficina(rs.getInt(1));
				df.setOficinas(rs.getString(2));  
				return df;	
			}
			});
	}

}

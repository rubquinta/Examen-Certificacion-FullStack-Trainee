package cl.PruebaTD.classicmodelsf.model;

public class Empleado {
	
	private int numEmpleado;
	
	private String nombre;
	
	private String mail;
	
	private String oficina;
	
	private String manager;
	
	

	public Empleado() {
		super();
	}

	public Empleado(int numEmpleado, String nombre, String mail, String oficina, String manager) {
		super();
		this.numEmpleado = numEmpleado;
		this.nombre = nombre;
		this.mail = mail;
		this.oficina = oficina;
		this.manager = manager;
	}

	public int getNumEmpleado() {
		return numEmpleado;
	}

	public void setNumEmpleado(int numEmpleado) {
		this.numEmpleado = numEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getOficina() {
		return oficina;
	}

	public void setOficina(String oficina) {
		this.oficina = oficina;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	@Override
	public String toString() {
		return "Empleado [numEmpleado=" + numEmpleado + ", nombre=" + nombre + ", mail=" + mail + ", oficina=" + oficina
				+ ", manager=" + manager + "]";
	}
	
	

}

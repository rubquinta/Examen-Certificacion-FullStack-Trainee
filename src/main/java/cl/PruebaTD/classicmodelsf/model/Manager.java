package cl.PruebaTD.classicmodelsf.model;

public class Manager {
	
	private int numManager;
	
	private String Managers;

	public Manager() {
		super();
	}

	public Manager(int numManager, String managers) {
		super();
		this.numManager = numManager;
		Managers = managers;
	}

	public int getNumManager() {
		return numManager;
	}

	public void setNumManager(int numManager) {
		this.numManager = numManager;
	}

	public String getManagers() {
		return Managers;
	}

	public void setManagers(String managers) {
		Managers = managers;
	}

	@Override
	public String toString() {
		return "Manager [numManager=" + numManager + ", Managers=" + Managers + "]";
	}
	
	

}

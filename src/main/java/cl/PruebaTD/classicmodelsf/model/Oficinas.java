package cl.PruebaTD.classicmodelsf.model;

public class Oficinas {
	
	private int numOficina;

	private String oficinas;

	
	public Oficinas() {
		super();
	}

	 

	public Oficinas(int numOficina, String oficinas) {
		super();
		this.numOficina = numOficina;
		this.oficinas = oficinas;
	}



	public int getNumOficina() {
		return numOficina;
	}



	public void setNumOficina(int numOficina) {
		this.numOficina = numOficina;
	}



	public String getOficinas() {
		return oficinas;
	}

	public void setOficinas(String oficinas) {
		this.oficinas = oficinas;
	}

	@Override
	public String toString() {
		return "Oficinas [oficinas=" + oficinas + "]";
	}
	
	
	
	
	
	

}

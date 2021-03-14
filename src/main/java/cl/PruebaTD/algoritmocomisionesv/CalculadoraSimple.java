package cl.PruebaTD.algoritmocomisionesv;

import java.util.List;

public class CalculadoraSimple implements CalculadoraComisiones {

 
	
	private int totalVenta;
	
		
	public CalculadoraSimple() {
		super();
	}
		 
	
	public CalculadoraSimple(int totalVenta) {
		super(); 
		this.totalVenta = totalVenta;
	}


	public int getTotalVenta() {
		return totalVenta;
	}

	public void setTotalVenta(int totalVenta) {
		this.totalVenta = totalVenta;
	}
	 

	 
	@Override
	public Integer calcula(List<Integer> listaVentas) {
		
		int comitotalVentaFinal= 0;
		int comiVenta= 0;
		
		for(int venta : listaVentas) {
			if(venta > 10000) {
				comiVenta  = (int) (venta*0.1);
			
			}else {
				comiVenta  = (int) (venta*0.05);
			}
			
			comitotalVentaFinal += comiVenta;
	}
		return comitotalVentaFinal;
	
}
}

package cl.PruebaTD.algoritmocomisionesv;

import java.util.List;

public class CalculadoraCompleja implements CalculadoraComisiones{

	private int totalVenta;
		
	public CalculadoraCompleja() {
		super();
	}

	public CalculadoraCompleja(int totalVenta) {
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
				
		int comiVentaCompleja =0;
		
		int comiTotalVentaFull = 0;
		
		int comiVenta = 0;
		
		int finalVenta = 0;
		
		for(int venta : listaVentas) {
			
			int comiVentaCon5 = (int) (venta*0.05);
			
			if(venta > 5000 && venta < 10000) {
				
				comiVentaCompleja  = (int) (comiVentaCon5*1.02);
			
			}else if(venta > 10000) {
				
				comiVentaCompleja  = (int) (comiVentaCon5*1.03);
				
			}else if(venta <= 0) {
				
				comiVentaCompleja = 0;
				
			} else {
				comiVentaCompleja = comiVentaCon5;
			}
		 comiVenta += comiVentaCompleja;	
			
		 finalVenta += venta;
	}
		
		if(finalVenta > 50000) {		
			
			 comiTotalVentaFull = (int) (Math.round((finalVenta)*0.01));
		}  
		
		return comiTotalVentaFull + comiVenta  ;
	}

}

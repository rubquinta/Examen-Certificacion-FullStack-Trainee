package cl.PruebaTD.classicmodelsf;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import cl.PruebaTD.algoritmocomisionesv.CalculadoraCompleja;

public class TestCalcComplejo {

	@Test
	public void test3() {		
		
		List<Integer> lista = new ArrayList<Integer>();
		 			 
			lista.add(50001);
			lista.add(0);
			lista.add(0);
			lista.add(0);
			lista.add(0);
		
		CalculadoraCompleja comiCompleja = new CalculadoraCompleja();
		
		Integer esperado = 3075; 
			assertEquals(esperado, comiCompleja.calcula(lista));
		 
				
	}
	
	@Test
	public void test2() {		
		
		List<Integer> lista = new ArrayList<Integer>();
		 			 
			lista.add(11123);
			lista.add(6092);
			lista.add(9637);
			lista.add(1283);
			lista.add(8684);
		
		CalculadoraCompleja comiCompleja = new CalculadoraCompleja();
		
		Integer esperado = 1878; 
			assertEquals(esperado, comiCompleja.calcula(lista));
		 
				
	}
	
	@Test
	public void test() {		
		
		List<Integer> lista = new ArrayList<Integer>();
		 			 
			lista.add(0);
			lista.add(-1000);
			lista.add(0);
			lista.add(0);
			lista.add(1000);
		
		CalculadoraCompleja comiCompleja = new CalculadoraCompleja();
		
		Integer esperado = 50; 
			assertEquals(esperado, comiCompleja.calcula(lista));
		 
				
	}

}

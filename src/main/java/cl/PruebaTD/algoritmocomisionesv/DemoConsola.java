package cl.PruebaTD.algoritmocomisionesv;

import java.util.ArrayList;
import java.util.List;

public class DemoConsola {

	public static void main(String[] args) {
		
		List<Integer> ventaslista = new ArrayList<Integer>();
		
		for(int i = 0; i<5; i++) {
			ventaslista.add((int) Math.round(Math.random()*(20000-1000)+1000));
		}

		System.out.println("----------------------------------------------");
		System.out.println("Demotración Calculadora de Comisiones de Venta");
		System.out.println("----------------------------------------------");
		
		System.out.println("Tomando 5 montos de venta aleatorios...\n");
		
		for(int i = 0; i<5; i++) {
			System.out.print(ventaslista.get(i) + " ");
		}
		
		CalculadoraSimple comiSimple = new CalculadoraSimple();
		
		CalculadoraCompleja comiCompleja = new CalculadoraCompleja();
		
		System.out.println("\nDescuento con Algoritmo Simple: " + comiSimple.calcula(ventaslista));
		
		System.out.println("Descuento con Algoritmo Complejo: " + comiCompleja.calcula(ventaslista));
		
		
	}
}

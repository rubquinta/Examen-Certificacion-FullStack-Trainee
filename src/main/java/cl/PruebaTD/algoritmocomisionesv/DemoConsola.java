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

	import java.util.Scanner;

public class NumeroCuenta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intentos = 0;

        while (intentos < 5) {
            System.out.print("Ingrese un número de cuenta de 9 dígitos: ");
            String input = scanner.nextLine();

            if (input.isEmpty() || input.length() < 5 || input.length() > 9) {
                System.out.println("Error RB: Número inválido. Intente de nuevo.");
                intentos++;
                continue;
            }

            try {
                long numeroCuenta = Long.parseLong(input);
                if (numeroCuenta < 0 || (numeroCuenta % 1 != 0)) {
                    System.out.println("Error RB: Número inválido. Intente de nuevo.");
                    intentos++;
                    continue;
                }

                int digitoCalculado = calcularDigito(numeroCuenta);

                if (input.charAt(0) == '9' && digitoCalculado > 9) {
                    digitoCalculado -= 3;
                    if (digitoCalculado > 9) {
                        System.out.println("Error: No es posible, intente de nuevo.");
                        intentos++;
                        continue;
                    }
                }

                String nuevoNumeroCuenta = input.substring(0, 9) + digitoCalculado;
                System.out.println("Nuevo número de cuenta: " + nuevoNumeroCuenta);
                System.out.println("Ingrese otro número de cuenta.");
            } catch (NumberFormatException e) {
                System.out.println("Error RB: Número inválido. Intente de nuevo.");
                intentos++;
            }
        }

        System.out.println("Máximo de intentos alcanzado. Programa terminado.");
    }

    public static int calcularDigito(long numeroCuenta) {
        String numeroCuentaStr = Long.toString(numeroCuenta);
        long suma = ((Long.parseLong(numeroCuentaStr.substring(8)) + Long.parseLong(numeroCuentaStr.substring(2, 3)))*2 +
                     (Long.parseLong(numeroCuentaStr.substring(7)) + Long.parseLong(numeroCuentaStr.substring(1)))*3 +
                     Long.parseLong(numeroCuentaStr.substring(6))*4 + Long.parseLong(numeroCuentaStr.substring(5))*5 +
                     Long.parseLong(numeroCuentaStr.substring(4))*6 + Long.parseLong(numeroCuentaStr.substring(3))*7) % 11;
        return 11 - (int) suma;
    }
}

}

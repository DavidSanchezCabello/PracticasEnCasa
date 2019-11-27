package es.studium.repaso;

import java.util.Scanner;

public class Intercambio {

	public static void main(String[] args) {
	
	int a,b;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un número entero para el valor de A");
		a= teclado.nextInt();

		
		System.out.println("Introduzca otro número entero para el valor de B");
		b= teclado.nextInt();
		
		if (a <= b) {
		
		System.out.println("El el valor de B es: " + a + " y el valor de A es: "+b );
		}else {
			System.out.println("El valor de B es: " + a + " y el valor de A es: "+ b);
		}
		
	}

}

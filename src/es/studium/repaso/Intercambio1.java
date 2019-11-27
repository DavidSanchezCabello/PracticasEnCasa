package es.studium.repaso;

import java.util.Scanner;

public class Intercambio1 {

	public static void main(String[] args) {
		int a,b, comodin;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un número entero para el valor de A");
		a= teclado.nextInt();

		
		System.out.println("Introduzca otro número entero para el valor de B");
		b= teclado.nextInt();
		
		comodin = b;
		b=a;
		a=comodin;
		
		System.out.println("El valor de A es: "+ a + " y el valor de B es: " +b);
	}

}

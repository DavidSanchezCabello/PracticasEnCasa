package es.studium.repaso;

import java.util.Scanner;

public class Intercambio2 {

	public static void main(String[] args) {
		int a,b,comodin1, comodin2;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un número entero para el valor de A");
		a= teclado.nextInt();


		System.out.println("Introduzca otro número entero para el valor de B");
		b= teclado.nextInt();

		comodin1 = a;
		comodin2 = b;
		b=comodin1;
		a=comodin2;
		System.out.println("El valor de A es: "+ a + " y el valor de B es: " +b);
	}

}

package es.studium.repaso;

import java.util.Scanner;

public class SumaFuncion {

	public static void main(String[] args) {

		int a, b;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un número entero");
		a = teclado.nextInt();

		System.out.println("Introduzca otro número entero");
		b = teclado.nextInt();

		System.out.println("La suma de los números es: " + funSuma(a, b));
	}

	public static int funSuma(int a, int b) {
		int r;
		return r = a + b;
	}
}

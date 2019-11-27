package es.studium.repaso;

import java.util.Scanner;

public class Suma {

	public static void main(String[] args) {

		int a, b;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca un número");
		a = teclado.nextInt();
		System.out.println("Introduzca otro número");
		b = teclado.nextInt();

		System.out.println("La suma de ambos es: " + (a + b));
		
		teclado.close();

	}

}

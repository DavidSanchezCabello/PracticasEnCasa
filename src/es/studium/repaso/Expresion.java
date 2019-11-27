package es.studium.repaso;

import java.util.Scanner;

public class Expresion {

	public static void main(String[] args) {
		int a, b, c;
		double resultado;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el valor de a");
		a = teclado.nextInt();

		System.out.println("Introduzca el valor de b");
		b = teclado.nextInt();

		System.out.println("Introduzca el valor de c");
		c = teclado.nextInt();

		resultado = funExp(a, b, c);
		teclado.close();
		System.out.println("El resultado es " + resultado);

	}

	public static double funExp(int a, int b, int c) {

		double r;

		r = ((b * b) - (4 * a * c)) / 2 * a;

		return r;
	}

}

package es.studium.repaso;

import java.util.Scanner;

public class Polinomio2 {

	public static void main(String[] args) {
		int a, b, c, d, e, f, g, h, i, j, k, x;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un valor entero para x elevado a 10");
		a = teclado.nextInt();
		System.out.println("Introduzca un valor entero para x elevado a 9");
		b = teclado.nextInt();
		System.out.println("Introduzca un valor entero para x elevado a 8");
		c = teclado.nextInt();
		System.out.println("Introduzca un valor entero para x elevado a 7");
		d = teclado.nextInt();
		System.out.println("Introduzca un valor entero para x elevado a 6");
		e = teclado.nextInt();
		System.out.println("Introduzca un valor entero para x elevado a 5");
		f = teclado.nextInt();
		System.out.println("Introduzca un valor entero para x elevado a 4");
		g = teclado.nextInt();
		System.out.println("Introduzca un valor entero para x elevado a 3");
		h = teclado.nextInt();
		System.out.println("Introduzca un valor entero para x elevado a 2");
		i = teclado.nextInt();
		System.out.println("Introduzca un valor entero para x elevado a 1");
		j = teclado.nextInt();
		System.out.println("Introduzca un valor entero para el termino independiente");
		k = teclado.nextInt();
		System.out.println("Introduzca un valor entero para x");
		x = teclado.nextInt();
		teclado.close();

		System.out.println(
				"El resultado del polinomio es: " + ((a * Math.pow(x, 10)) - (b * Math.pow(x, 9)) + (c * Math.pow(x, 8))
						- (d * Math.pow(x, 7)) + (e * Math.pow(x, 6)) - (f * Math.pow(x, 5)) - (g * Math.pow(x, 4))
						+ -(h * Math.pow(x, 3)) + -(i * Math.pow(x, 2)) - (j * Math.pow(x, 1)) + (k * Math.pow(x, 0))));

	}

}

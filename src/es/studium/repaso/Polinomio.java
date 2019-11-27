package es.studium.repaso;

import java.util.Scanner;

public class Polinomio {

	public static void main(String[] args) {
		int x;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un valor para x");
		x = teclado.nextInt();
		teclado.close();
		System.out.println("El resultado del polinomio es: "
				+ ((3 * Math.pow(x, 5)) - (5 * Math.pow(x, 3)) + (2 * Math.pow(x, 1)) - 7));

	}
}

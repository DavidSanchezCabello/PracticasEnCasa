package es.studium.repaso;

import java.util.Scanner;

public class Multiplo5 {

	public static void main(String[] args) {
		int a, b, i;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un número entero");
		a = teclado.nextInt();

		System.out.println("Introduzca otro número entero");
		b = teclado.nextInt();

		if (a < b) {
			for (i = a; i <= b; i++) {

				if (i % 5 == 0) {

					System.out.print(i+ "||");
				}

			}
		}else {
			System.out.println("ERROR");
		}

	}

}

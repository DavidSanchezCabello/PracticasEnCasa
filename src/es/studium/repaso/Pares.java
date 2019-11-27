package es.studium.repaso;

import java.util.Scanner;

public class Pares {

	public static void main(String[] args) {

		int a, b;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un número");
		a = teclado.nextInt();
		System.out.println("Introduzca otro número");
		b = teclado.nextInt();
		

		for (a = a; a <= b; a++) { // Preguntar a Jorge

			if (a % 2 == 0) {
				System.out.println(a + " ");

			}

		}teclado.close();

	}
}
/* package es.studium.repaso;

import java.util.Scanner;

public class Pares {

	public static void main(String[] args) {

		int a, b , i;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un número");
		a = teclado.nextInt();
		System.out.println("Introduzca otro número");
		b = teclado.nextInt();
		

		for (i = a; i <= b; i++) { // Preguntar a Jorge

			if (i % 2 == 0) {
				System.out.println(i + " ");

			}

		}teclado.close();

	}
}*/

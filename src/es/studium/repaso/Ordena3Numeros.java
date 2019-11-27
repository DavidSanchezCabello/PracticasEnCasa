package es.studium.repaso;

import java.util.Scanner;

public class Ordena3Numeros {

	public static void main(String[] args) {

		int a, b, c;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un número entero");
		a = teclado.nextInt();

		System.out.println("Introduzca otro número entero");
		b = teclado.nextInt();

		System.out.println("Introduzca el último número entero");
		c = teclado.nextInt();

		if ((a >= b) && (b >= c))
		{
			System.out.println("El orden indicado es: " + a + " ," + b + " ," + c);
		} else if ((a >= b) && (b <= c)) {
			System.out.println("El orden indicado es: " + a + " ," + c + " ," + b);
		} else if ((b >= c) && (c >= a)) {
			System.out.println("El orden indicado es: " + b + " ," + a + " ," + c);
		} else if ((b >= a) && (a >= c)) {
			System.out.println("El orden indicado es: " + b + " ," + c + " ," + a);
		} else if ((b >= c) && (c >= a)) {
			System.out.println("El orden indicado es: " + c + " ," + a + " ," + b);
		} else if ((c >= a) && (a >= b)) {
			System.out.println("El orden indicado es: " + c + " ," + a + " ," + b);
		} else if ((c >= b) && (b >= a)) {
			System.out.println("El orden indicado es: " + c + " ," + b + " ," + a);
		} else {
			System.out.println("Los numeros introducidos no son correctos");
		}

	}

}

package es.studium.repaso;

import java.util.Scanner;

public class Operaciones2 {

	public static void main(String[] args) {
		int a, b, suma, resta, producto;
		float cociente;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un número entero");
		a = teclado.nextInt();

		System.out.println("Introduzca otro número entero");
		b = teclado.nextInt();

		suma = funSuma(a, b);
		System.out.println("El resultado de la division es: " + suma);
		resta = funResta(a, b);
		System.out.println("El resultado de la division es: " + resta);
		producto = funProducto(a, b);
		System.out.println("El resultado de la division es: " + producto);

		if (b != 0) {
			cociente = funDiv(a, b);
			System.out.println("El resultado de la division es: " + cociente);
		}else {
			System.out.println("La division no es posible el segundo numero no puede valer 0");
		}

	}

	public static int funSuma(int x, int y) {
		int r;
		return r = x + y;
	}

	public static int funResta(int x, int y) {
		int r;
		return r = x - y;
	}

	public static int funProducto(int x, int y) {
		int r;
		return r = x * y;
	}

	public static float funDiv(int x, int y) {
		int r;
		return r = x / y;
	}

}

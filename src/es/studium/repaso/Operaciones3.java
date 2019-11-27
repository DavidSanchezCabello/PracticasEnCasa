package es.studium.repaso;

import java.util.Scanner;

public class Operaciones3 {

	public static void main(String[] args) {

		int a, b, c;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un número entero");
		a = teclado.nextInt();

		System.out.println("Introduzca otro número entero");
		b = teclado.nextInt();
		System.out.println("Introduzca un tercer numero entero");
		c = teclado.nextInt();

		System.out.println("La suma de los tres valores es: " + funSuma(a, b, c));
		System.out.println("El producto de los tres valores es: " + funProducto(a, b, c));
		System.out.println("La media de los tres valores es: " + funMedia(a, b, c));
	}

	public static int funSuma(int x, int y, int z) {
		int r;
		return r = x + y + z;
	}

	public static int funProducto(int x, int y, int z) {
		int r;
		return r = x * y * z;
	}

	public static int funMedia(int x, int y, int z) {
		int r;
		return r = (x + y + z) / 3;
	}
}

package es.studium.repaso;

import java.util.Scanner;

public class TiposTriangulos {

	public static void main(String[] args) {

		int a, b, c;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un valor para el lado a");
		a = teclado.nextInt();
		System.out.println("Introduzca un valor para el lado b");
		b = teclado.nextInt();
		System.out.println("Introduzca un valor para el lado c");
		c = teclado.nextInt();

		if ((a == b) && (a == c)) {

			System.out.println("El triagulo es de tipo Equilatero");
		} else if ((a != b) && (a != c) && (b != c)) {
			System.out.println("El triangulo es de tipo Isosceles");
		} else {
			System.out.println("El triangulo es de tipo Escaleno");

		}
	}
}

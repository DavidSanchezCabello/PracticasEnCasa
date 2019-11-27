package es.studium.repaso;

import java.util.Scanner;

public class Pendiente {

	public static void main(String[] args) {
		double x1, x2, y1, y2;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca el valor de x1");
		x1 = teclado.nextInt();
		System.out.println("Introduzca el valor de x2");
		x2 = teclado.nextInt();
		System.out.println("Introduzca el valor de y1");
		y1 = teclado.nextInt();
		System.out.println("Introduzca el valor de y2");
		y2 = teclado.nextInt();
		teclado.close();
		funPendiente(x1, x2, y1, y2);

	}

	public static void funPendiente(double x1, double x2, double y1, double y2) {

		double m;

		m = ((y2 - y1) / (x2 - x1));

		System.out.println("La pendiente resultante entre los puntos indicados es: "+ m);

	}
}

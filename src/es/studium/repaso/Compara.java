package es.studium.repaso;

import java.util.Scanner;

public class Compara {

	public static void main(String[] args) {

		int a, b;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un número");
		a = teclado.nextInt();
		System.out.println("Introduzca otro número");
		b = teclado.nextInt();
		teclado.close();

		if (a == b) {

			System.out.println("los números son iguales");
		} 
		else if (a < b) {
			System.out.println("el número mayor es: " + b);
		} 
		else
			System.out.println("el número mayor es: " + a);
	}

}

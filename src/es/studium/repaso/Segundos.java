package es.studium.repaso;

import java.util.Scanner;

public class Segundos {

	public static void main(String[] args) {

		int edad;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca su edad");
		edad = teclado.nextInt();
		teclado.close();

		if (edad < 40) {
			System.out.println("Su edad equivale en segundos a: " + funEdad(edad)+" seg");
		} else {
			proEdad(edad);
		}
	}

	public static long funEdad(int x) {
		int r;
		r = x * 31536000;
		return r;

	}

	public static void proEdad(int x) {
		long r;
		r = x * 31536000;
		System.out.println("Su edad en segundos es: " + r);
	}
}

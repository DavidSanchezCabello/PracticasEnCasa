package es.studium.repaso;

import java.util.Scanner;

public class DosMillTreinta {

	public static void main(String[] args) {

		String nombre;
		int edad;
		int nuevaEdad;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca su nombre");
		nombre = teclado.next();
		System.out.println("Introduzca su a�o de nacimiento");
		edad = teclado.nextInt();
		nuevaEdad = (2030 - edad);
		teclado.close();
		System.out.println("Hola " + nombre + " en el a�o 2030 tendr�s " + nuevaEdad + " a�os");

	}

}

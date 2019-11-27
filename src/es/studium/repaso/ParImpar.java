package es.studium.repaso;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {

		int numero;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca un número");
		numero = teclado.nextInt();
		teclado.close();
		if (numero % 2 == 0) {
			System.out.println("El número es par");
		} else {
			System.out.println("El número introducido es Impar");
		}

	}

}

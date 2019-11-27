package es.studium.repaso;

import java.util.Scanner;

public class Dividir {

	public static void main(String[] args) {

		int a, b;
		double resultado;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca el dividendo, por favor ");
		a = teclado.nextInt();
		System.out.println("Introduzca el divisor, por favor ");
		b = teclado.nextInt();
		resultado = dividir(a,b);
		teclado.close();

		//System.out.println("El resultado de la división es: " + dividir(a, b));
		System.out.println("El resultado de la división es; " + resultado);
	

	}

	public static double dividir(double a, double b) {

		/*double r;

		r = (a / b);

		return r;*/
		return (a/b);
	}

}

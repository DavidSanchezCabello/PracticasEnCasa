package es.studium.repaso;

import java.util.Scanner;

public class Concatenar {

	public static void main(String[] args) {
		char a,b;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca una letra");
		a= teclado.next().charAt(0);

		
		
		System.out.println("Introduzca un número entero");
		b= teclado.next().charAt(0);


		System.out.println("La primera letra introducida a sido: "+ a +" y la segunda "+ b);
	}

}

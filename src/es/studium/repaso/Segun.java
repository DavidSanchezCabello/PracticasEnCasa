package es.studium.repaso;

import java.util.Scanner;

public class Segun {

	public static void main(String[] args) {
		
		int a,b;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un n�mero entero");
		a= teclado.nextInt();

		
		System.out.println("Introduzca otro n�mero entero");
		b= teclado.nextInt();
		
		if (a<b) {
			
			System.out.println("La suma de los dos es igual a: "+ (a+b));
		}else 
			System.out.println("El producto de los dos es: "+(a*b));
	}

}

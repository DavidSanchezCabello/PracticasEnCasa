package es.studium.repaso;

import java.util.Scanner;

public class Potencia2 {

	public static void main(String[] args) {
		int a,b;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un número para la base");
		a= teclado.nextInt();

		
		System.out.println("Introduzca otro número para el exponente");
		b= teclado.nextInt();
		
		System.out.println("El resultado de "+a + " elevado a "+ b + " es igual a: "+ funPot(a,b));
	}
public static int funPot(int base, int exponente) {
	
	int resultado=1;
	
	for (int i = 1; i<=exponente; i++) {
		
		resultado= (resultado*base);
		
	}
	return resultado;
}
}

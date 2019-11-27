package es.studium.repaso;

import java.util.Scanner;

public class Veces {

	public static void main(String[] args) {
		
		int a,b;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un número entero");
		a= teclado.nextInt();

		
		System.out.println("Introduzca otro número entero");
		b= teclado.nextInt();
	
		for (int i=1 ; i<=a ; i++) {
			
			System.out.println("Repeticion número: "+i +" " +b);
		}
	}

}

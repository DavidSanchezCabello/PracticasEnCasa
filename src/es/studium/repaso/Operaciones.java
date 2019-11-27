package es.studium.repaso;

import java.util.Scanner;

public class Operaciones {

	public static void main(String[] args) {
		int a,b;
		int suma,resta,producto;
		double division;
	
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un número entero");
		a= teclado.nextInt();

		
		System.out.println("Introduzca otro número entero");
		b= teclado.nextInt();
		
		suma= a+b;
		resta=a-b;
		producto=a*b;
		
		
		
		
		System.out.println("La suma de los dos numeros es ugual a: "+suma);
		System.out.println("La suma de los dos numeros es ugual a: "+resta);
		System.out.println("La suma de los dos numeros es ugual a: "+producto);
		
		if (b!=0) {
			division= a/b;
			System.out.println("La suma de los dos numeros es ugual a: "+division);
		}else {
			System.out.println("La division no es posible porque el divisor no puede ser 0");
		}
		
		

	}

}

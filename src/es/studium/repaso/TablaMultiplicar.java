package es.studium.repaso;

import java.util.Scanner;

public class TablaMultiplicar {

	public static void main(String[] args) {
int a;
int resultado=1;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un número entero");
		a= teclado.nextInt();
		
		for (int i =0;i<=10;i++) {
		
			resultado=  (i*a);
			
		System.out.println(	a + " x "+ i +" = " + 	resultado  );
		}
	}
	
	
}

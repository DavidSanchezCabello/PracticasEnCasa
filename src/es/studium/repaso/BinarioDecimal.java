package es.studium.repaso;

import java.util.Scanner;

public class BinarioDecimal {

	public static void main(String[] args) {
		
		int a,b,c,d,e,resultado;
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un número entero");
		a= teclado.nextInt();
		System.out.println("Introduzca un número entero");
		b= teclado.nextInt();
		System.out.println("Introduzca un número entero");
		c= teclado.nextInt();
		System.out.println("Introduzca un número entero");
		d= teclado.nextInt();
		System.out.println("Introduzca un número entero");
		e= teclado.nextInt();
		resultado= funDec(a,b,c,d,e);
		System.out.println("El equivalente en decimal es: "+ resultado);
	
		

	}
	public static int funDec(int a,int b, int c,int d,int e) {
		
		int r;
		return r= (a*16)+(b*8)+(c*4)+(b*2)+(a*1);
	}

}

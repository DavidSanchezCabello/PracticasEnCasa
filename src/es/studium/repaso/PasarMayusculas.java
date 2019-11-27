package es.studium.repaso;

import java.util.Scanner;

public class PasarMayusculas {

	public static void main(String[] args) {
		
		char letra='a';
		int x,y;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca una letra minúscula");
		letra = teclado.next().charAt(0);
		teclado.close();
		x=(int)letra;
		y=x-32;
		
		System.out.println("La letra introducia es equivalente en mayúscula a: "+ (char)y);
		
	}

}

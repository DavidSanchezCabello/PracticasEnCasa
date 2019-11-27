package es.studium.repaso;

import java.util.Scanner;

public class PasarLetraNumeros {

	public static void main(String[] args) {
		
		char letra;
		int numero=0;
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un número entero");
		letra= teclado.next().charAt(0);
		if (letra!='*') {
			
			switch (letra) {
			case 'a':
				numero=1;
			break;
			case 'b':
				numero=2;
			break;
			case 'c':
				numero=3;
			break;
			case 'd':
				numero=4;
			break;
			default:
				System.out.println("El caracter intiroducido no es correcto");
			}
			
		}
	
		System.out.println("La letra indicada corresponde al número " + numero);
	}

}

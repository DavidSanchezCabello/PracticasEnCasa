package es.studium.repaso;

import java.util.Scanner;

public class Meses {

	public static void main(String[] args) {
		
		
		int mes=0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un número entero entre 1 y 12");
		mes= teclado.nextInt();

		switch (mes) {
		case 1:
			System.out.println("El número introducido pertenece al mes " + mes+ " es "+ " Enero");
			break;
		case 2:
			System.out.println("El número introducido pertenece al mes " + mes+ " es "+ " Febrero");
			break;
		case 3:
			System.out.println("El número introducido pertenece al mes " + mes+ " es "+ " Marzo");
			break;
		case 4:
			System.out.println("El número introducido pertenece al mes " + mes+ " es "+ " Abril");
			break;
		case 5:
			System.out.println("El número introducido pertenece al mes " + mes+ " es "+ " Mayo");
			break;
		case 6:
			System.out.println("El número introducido pertenece al mes " + mes+ " es "+ " Junio");
			break;
		case 7:
			System.out.println("El número introducido pertenece al mes " + mes+ " es "+ " Julio");
			break;
		case 8:
			System.out.println("El número introducido pertenece al mes " + mes+ " es "+ " Agosto");
			break;
		case 9:
			System.out.println("El número introducido pertenece al mes " + mes+ " es "+ " Septiembre");
			break;
		case 10:
			System.out.println("El número introducido pertenece al mes " + mes+ " es "+ " Octubre");
			break;
		case 11:
			System.out.println("El número introducido pertenece al mes " + mes+ " es "+ " Noviembre");
			break;
		case 12:
			System.out.println("El número introducido pertenece al mes " + mes+ " es "+ " Diciembre");
			break;
		default:
				System.out.println("El número introducido no es correcto");
				break;
		
		}
	}

}

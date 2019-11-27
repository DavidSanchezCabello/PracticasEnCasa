package es.studium.repaso;

import java.util.Scanner;

public class Cuadrante {

	public static void main(String[] args) {

		double x = 0, y = 0;

		Scanner teclado = new Scanner(System.in);
		
	do {
		System.out.println("Introduzca un valor para x");
		x = teclado.nextInt();

		System.out.println("Introduzca un valor para y");
		y = teclado.nextInt();

		System.out.println("Las coordenadas pertenecen al cuadrante número:" + funCuadrante(x, y));
	}while ((x!=0)&&(y!=0)); 
	teclado.close();
	}

	public static int funCuadrante(double x, double y) {
		int r = 0;

		if ((x >= 0) && (y >= 0)) {

			r = 1;

		} else if ((x <= 0) && (y >= 0)) {
			r = 2;
		} else if ((x <= 0) && (y <= 0)) {
			r = 3;

		} else if ((x >= 0) && (y <= 0)) {
			r = 4;
		}
		return r;
	}
}

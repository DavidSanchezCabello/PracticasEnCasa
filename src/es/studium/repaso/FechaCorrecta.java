package es.studium.repaso;

import java.util.Scanner;

public class FechaCorrecta {

	public static void main(String[] args) {

		int dia, mes, anyo;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un número entero");
		dia = teclado.nextInt();
		System.out.println("Introduzca otro número entero");
		mes = teclado.nextInt();
		System.out.println("Introduzca otro número entero");
		anyo = teclado.nextInt();

		if ((dia < 1) || (mes < 1) || (anyo < 1)) {

			System.out.println("La fecha introducida no es correcta");

		} else {
			switch (mes) {
			case 1:
				System.out.println("La fecha es correcta");
			case 2:
				if (dia > 29) {
					System.out.println("La fecha no es correcta");
				}
				if (dia == 29) {
					if ((anyo % 4 == 0) && (anyo % 100 != 0) || (anyo % 400 == 0))
						;
					System.out.println("La fecha es correcta");
				} else {
					System.out.println("La fecha no es correcta");
				}
			case 3:
				System.out.println("La fecha es correcta");
			case 4:
				System.out.println("La fecha es correcta");
			case 5:
				System.out.println("La fecha es correcta");
			case 6:
				System.out.println("La fecha es correcta");
			case 7:
				System.out.println("La fecha es correcta");
			case 8:
				System.out.println("La fecha es correcta");
			case 9:
				System.out.println("La fecha es correcta");
			case 10:
				System.out.println("La fecha es correcta");
			case 11:

			case 12:
				if (dia <= 31) {
					System.out.println("La fecha es correcta");
				} else {
					System.out.println("La fecha no es correcta");
				}

			}
		}
	}

}

package es.studium.repaso;

import java.util.Scanner;

public class Meses2 {

	public static void main(String[] args) {
		int mes, anyo;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca un número perteneiente al mes");
		mes = teclado.nextInt();
		System.out.println("Introduzca un número perteneiente al año");
		anyo = teclado.nextInt();

		if ((mes > 0) && (mes < 13)) {

			switch (mes) {
			case 1:
				System.out.println("El mes tiene 31 dias");
				break;

			case 2:
				if (mes > 29) {
					System.out.println("La fecha no es correcta");
				} else if (mes == 29) {
					if ((anyo % 4 == 0) && (anyo % 100 != 0) || (anyo % 400 == 0))
						;
					System.out.println("El mes tiene 29 mess");
				} else {
					System.out.println("La mes tiene 28");
				}
				break;
			case 3:
				System.out.println("El mes tiene 31 dias");
				break;
			case 4:
				System.out.println("El mes tiene 31 dias");
				break;
			case 5:
				System.out.println("El mes tiene 31 dias");
				break;
			case 6:
				System.out.println("El mes tiene 31 dias");
				break;
			case 7:
				System.out.println("El mes tiene 31 dias");
				break;
			case 8:
				System.out.println("El mes tiene 31 dias");
				break;
			case 9:
				System.out.println("El mes tiene 31 dias");
				break;
			case 10:
				System.out.println("El mes tiene 31 dias");
				break;
			case 11:
				System.out.println("EL mes indicado tiene 30 mess");
				break;
			default:
				if (mes <= 31) {
					System.out.println("El mes tiene 31 dias");
				} else {
					System.out.println("La fecha no es correcta");
				}
				break;

			}
		}
	}

}

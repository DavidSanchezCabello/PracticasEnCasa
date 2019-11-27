package es.studium.repaso;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		int menu=0;
		Scanner teclado= new Scanner(System.in);
		

		do {
			System.out.println("Indique el número corespondiente a una opción del siguiente menú \n\n ############## (  MENU  ) ############## \n\n          1 - Abrir \n      "
							+ "    2 - Cerrar \n          3 - Modificar \n          4 - Salir");
			menu = teclado.nextInt();
			switch (menu) {
			case 1:
				System.out.println("A seleccionado la opción ABRIR");
				menu = teclado.nextInt();
				break;
			case 2:
				System.out.println("A seleccionado la opción CERRAR");
				menu = teclado.nextInt();
				break;
			case 3:
				System.out.println("A seleccionado la opción MODIFICAR");
				menu = teclado.nextInt();
				break;
			case 4:
				System.out.println("A seleccionado la opción SALIR");
				menu = teclado.nextInt();
				break;
			default:
				System.out.println("La opcion seleccionada no es válida");
				break;


			}
		
		}while (menu!=4);	
		teclado.close();
	}

}

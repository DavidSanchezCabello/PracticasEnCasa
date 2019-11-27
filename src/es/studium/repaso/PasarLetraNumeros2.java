package es.studium.repaso;

import java.util.Scanner;

public class PasarLetraNumeros2 {

	public static void main(String[] args) {

		char letra;
		int x, y;

		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.println("Indique una letra");
			letra=teclado.next().charAt(0);
			if (letra=='*') {
				System.out.println("Adiós");
			}else
			{
				x=(int)letra;
				y=x-96;
				System.out.println("La letra indicada corresponde al número: "+ y);
			}
		}while (letra !='*');
		
	}
}

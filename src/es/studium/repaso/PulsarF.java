package es.studium.repaso;

import java.util.Scanner;

public class PulsarF {

	public static void main(String[] args) {
		char letra;
		letra='a';
		Scanner teclado=new Scanner(System.in);
		do {
			
			System.out.println("Introduzca una letra");
			letra = teclado.next().charAt(0);
			if(letra != 'f') {
			System.out.println("La letra introducida es la "+ letra);
			}


		}while (letra !='f');{
			
			
			
			System.out.println("fin");
			teclado.close();
		}

	}

}

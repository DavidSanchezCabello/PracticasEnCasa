package es.studium.repaso;

import java.util.Scanner;

public class Descuentos {

	public static void main(String[] args) {
		int codigoArticulo,unidades;
		double precio,subtotal,descuento,total;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el codigo del articulo");
		codigoArticulo = teclado.nextInt();
		System.out.println("Introduzca el precio");
		precio = teclado.nextDouble();
		System.out.println("Introduzca numero de unidades");
		unidades = teclado.nextInt();
		subtotal=precio*unidades;
		descuento=0;
		total=0.;

		if (unidades>100) {
			descuento= 40;
			total = unidades*0.60*precio;

		}else if ((unidades>=25)&&(unidades <=100)) {
			descuento=20;
			total = unidades*0.80*precio;
		}else if ((unidades>=10)&&(unidades <=24)) {
			descuento=10;
			total = unidades*0.90*precio;
		}else if (unidades<10) {
			descuento=0;
			total = unidades*precio;
		}System.out.println("*******************RESUMEN DE COMPRA***********************"
				+ " \n     Codigo de Articulo "+ codigoArticulo +"\n     Subtotal a pagar: "+ subtotal 
				+  " € \n     Descuento de: " +descuento+ " % \n     Total a pagar: "+ total + " €");
	}

}

package es.studium.repaso;

public class Cuadrados {

	public static void main(String[] args) {
		
		System.out.println("La suma de los cuadrados de los 100 primeros numeros naturales es: "+ funCuadrado());
	}
	public static int funCuadrado() {
		int i, resultado;
		resultado=0;
		
		for (i=0;i<=99;i++) {
			resultado+=(i*i);
		}
		return resultado;
	}
}
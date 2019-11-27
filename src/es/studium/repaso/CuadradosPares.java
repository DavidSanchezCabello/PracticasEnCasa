package es.studium.repaso;

public class CuadradosPares {

	public static void main(String[] args) {
		int i, resultado;
			for (i=0;i<=100;i++) {
				if(i%2==0) {
					resultado= funPar(i);
					System.out.print(resultado+"||");
				}
				}
			}
			public static int funPar(int i) {
			
				
				return i*i;
			}
}

package Clases;

public class Minimos {

	/**
	 * 
	 * @param numero1
	 * @param numero2
	 * @param numero3
	 * @return devuelve el numero menor
	 * @throws IllegalAccessException
	 */
	public static int MinimoDeEnterosPositivos(int numero1, int numero2,int numero3) throws IllegalAccessException{
		int numeroMinimo=0;
		
		
		
		
		if (numero1<0 || numero2<0 || numero3<0) {
			throw new IllegalAccessException("Fuera de rango");
			
		}
		if (numero1>=numero2 & numero1>=numero3) {
			numeroMinimo=numero2;
		} else if (numero1>=numero2 &numero2>=numero3) {
			numeroMinimo=numero1;
		}else {
			numeroMinimo=numero3;
		}
		return numeroMinimo;
		
		
	}
}

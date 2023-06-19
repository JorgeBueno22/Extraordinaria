package ElMensajeEncriptado;

import java.util.ArrayList;

public class Desencriptador {

	private String palabra;

	public Desencriptador(String string) {

	}

	public void desencriptar() {

		FicheroReader fr = new FicheroReader();

		ArrayList<Integer> numeros = new ArrayList<Integer>(fr.getNumeros());

//		int contador1 = 0;
//		int contador2 = 0;
//		int contador3 = 0;
//
//		for (int i = 0; i < numeros.size(); i++) {
//			if (i == 1 || i == 9 || i == 17) {
//				contador1 += i;
//			}
//			if (i == 2 || i == 10 || i == 18) {
//				contador2 += i;
//			}
//			if (i == 3 || i == 11 || i == 19) {
//				contador3 += i;
//			}
//
//			char letra1 = (char) contador1;
//			char letra2 = (char) contador2;
//			char letra3 = (char) contador3;

		int filas = 3;
		int columnas = 8;
		
		int[][] matriz = new int [filas][columnas];
		int [] suma;
		
		
		 for (int i = 0; i < filas; i++) {
	          for(int j = 0; j < columnas; j++) {
	        	  
	          }
	        
		System.out.println();
		}
		

	}

	@Override
	public String toString() {
		return "Desencriptador [" + palabra + "]";
	}

}

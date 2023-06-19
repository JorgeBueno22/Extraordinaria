package ElMensajeEncriptado;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FicheroReader {

	private static final String fichero = "C:\\Users\\Mañana\\Desktop\\fichero.txt";

	public ArrayList<Integer> getNumeros() {

		ArrayList<Integer> numeros = new ArrayList<Integer>();
		BufferedReader bf;

		try {

			bf = new BufferedReader(new FileReader(fichero));
			String fila = bf.readLine();
			
			while(fila!=null) {
				
				numeros.add(Integer.parseInt(fila));
				fila = bf.readLine();
				
			}
			bf.close();
		}

		catch (IOException e) {
			System.out.println("Problemas: " + e.getMessage());
		} catch (Exception e) {
			// Otro fallos
			e.printStackTrace();
		}

		return numeros;

	}

}

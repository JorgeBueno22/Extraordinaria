package LosLibros;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

public class Write {

	private final static String FICHERO_SALIDA1= "C:\\Users\\Marcos\\Desktop\\repetidos.txt";
	private final static String FICHERO_SALIDA2 = "C:\\Users\\Marcos\\Desktop\\repetidos.txt";
	private final static String FICHERO_SALIDA3 = "C:\\Users\\Marcos\\Desktop\\repetidos.txt";

	public static void escribirRepetidos(Iterator<Libro> libros) {

		try {

			FileWriter file = new FileWriter(FICHERO_SALIDA1);
			while (libros.hasNext()) {
				Libro libro = libros.next();
				file.write(libro.toString() + "\n");
			}
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void escribirMedia(Iterator<Libro> libros) {

		try {

			FileWriter file = new FileWriter(FICHERO_SALIDA2);
			while (libros.hasNext()) {
				Libro libro = libros.next();
				file.write(libro.toString() + "\n");
			}
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void librosNoRepetidos(Iterator<Libro> libros) {

		try {

			FileWriter file = new FileWriter(FICHERO_SALIDA3);
			while (libros.hasNext()) {
				Libro libro = libros.next();
				file.write(libro.toString() + "\n");
			}
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

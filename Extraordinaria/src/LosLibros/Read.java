package LosLibros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Read {

	private final static String FICHERO = "C:\\Users\\Mañana\\Deskstop\\libros.txt";

	public static Iterator<Libro> getDatos() {
		// creo una variable que permite conectar con un fichero para poder leer sus
		// líneas
		BufferedReader ficheroEntrada;
		ArrayList<Libro> libros = new ArrayList<Libro>();
		try {
			// BufferedReader enlaza con un fichero; para ello en java hay que crear un
			// FileReader
			ficheroEntrada = new BufferedReader(new FileReader(FICHERO));

			// leo LA PRIMERA linea del fichero
			String fila = ficheroEntrada.readLine();

			// mientras que las lineas existan y no leamos null
			while (fila != null) {
				// creamos un nuevo objeto
				Libro libro = new Libro();

				// le seteamos lo que leimos, el título del libro
				libro.setTitulo(fila);

				// vuelvo a leer otra linea, la segunda, la del ISBN
				fila = ficheroEntrada.readLine();
				libro.setIsbn(fila);

				// vuelvo a leer otra linea, la tercera, las páginas
				fila = ficheroEntrada.readLine();
				libro.setPaginas(Integer.parseInt(fila));

				// añado a la colección
				libros.add(libro);
				// VUELVO A LEER UNA POSIBLE PRIMERA LINEA
				fila = ficheroEntrada.readLine();
			}
			ficheroEntrada.close();
		} catch (IOException e) {
			System.out.println("Problemas: " + e.getMessage());
		} catch (Exception e) {
			// Otro fallos
			e.printStackTrace();
		}

		return libros.iterator();
	}

}

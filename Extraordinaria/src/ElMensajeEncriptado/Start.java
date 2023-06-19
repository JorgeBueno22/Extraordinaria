package ElMensajeEncriptado;

public class Start {

	public static void main(String[] args) {

		Desencriptador desencriptador = new Desencriptador("fichero.txt");
		
		desencriptador.desencriptar();

		System.out.println(desencriptador);

		
	}

}

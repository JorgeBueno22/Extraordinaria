package LosLibros;

public class Start {

	public static void main(String[] args) {
		
		Read r = new Read();
		Write w = new Write();
		
		w.escribirMedia(r.getDatos());
		w.escribirRepetidos(r.getDatos());
		w.librosNoRepetidos(r.getDatos());

	}

}

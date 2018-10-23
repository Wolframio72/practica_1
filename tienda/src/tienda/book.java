package tienda;

public class book extends product {

	static String genero = "terror";
	static String tiempo = "si lo compra en menos de 12h el envio sera gratuito";
	
	
	

	public book(String nombre_producto, String localizacion, int unidades, String genero, String tiempo) {
		super(nombre_producto, localizacion, unidades);
		book.genero=genero;
		book.tiempo=tiempo;
		
	}

	
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		book.genero = genero;
	}

	public static void main(String[] args) {
		

	}


public static String getTiempo() {
	return tiempo;
}


public static void setTiempo(String tiempo) {
	book.tiempo = tiempo;
}
}

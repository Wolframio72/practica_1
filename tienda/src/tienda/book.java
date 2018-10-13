package tienda;

public class book extends product {

	static String genero = "terror";
	static int precio = 6;
	
	
	public book(String nombre_producto, String localizacion, int unidades, String genero, int precio) {
		super(nombre_producto, localizacion, unidades);
		book.genero=genero;
		book.precio=precio;
	}

	
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		book.genero = genero;
	}


	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		book.precio = precio;
	}


	public static void main(String[] args) {
		

	}

}

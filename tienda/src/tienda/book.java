package tienda;

public class book extends product {

	private String genero;
	private String precio;
	
	
	public book(String nombre_producto, String localizacion, int unidades, String genero, String precio) {
		super(nombre_producto, localizacion, unidades);
		this.genero=genero;
		this.precio=precio;
	}

	
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}


	public static void main(String[] args) {
		

	}

}

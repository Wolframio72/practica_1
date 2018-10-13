package tienda;

public class UserProduct {
	String genero;
	double precio=0;
	String editorial;
	String autor;

	public UserProduct(String genero, double precio, String editorial, String autor) {
		super();
		this.genero = genero;
		this.precio = precio;
		this.editorial = editorial;
		this.autor = autor;
	}

	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}

	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public static void main(String[] args) {
	

	}

}

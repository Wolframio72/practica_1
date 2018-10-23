package tienda;

public class UserProduct {
	
	static double precio=20;
	static String editorial=("editoriales Velazquez");
	static String autor = ("Pepe Villuela");

	public UserProduct( double precio, String editorial, String autor) {
		
		UserProduct.precio = precio;
		UserProduct.editorial = editorial;
		UserProduct.autor = autor;
	}

	

	public static double getPrecio(int precio2) {
		return precio;
	}
	public static void setPrecio(double precio) {
		UserProduct.precio = precio;
	}
	
	public static String getEditorial(String editorial2) {
		return editorial;
	}
	public static void setEditorial(String editorial) {
		UserProduct.editorial = editorial;
	}
	
	public static String getAutor(String autor2) {
		return autor;
	}
	public static void setAutor(String autor) {
		UserProduct.autor = autor;
	}
	
	public static void main(String[] args) {
	

	}

}

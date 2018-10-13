package tienda;

public class product {
	
	
	private static String nombre_producto;
	static String localizacion=	"Madrid";
	
	static int unidades=6;

	public product(String nombre_producto, String localizacion, int unidades) {
		product.nombre_producto=nombre_producto;
		product.localizacion= "Madrid";
		product.unidades=6;
	}
	
	
	public static  String getNombre_producto() {
		return nombre_producto;
	}
	public static void setNombre_producto(String nombre_producto) {
		product.nombre_producto = nombre_producto;
	}

	public String getLocalizacion() {
		return localizacion;
	}
	public static void setLocalizacion(String localizacion) {
		product.localizacion = localizacion;
	}

	
	public int getUnidades() {
		return unidades;
	}
	public void setUnidades(int unidades) {
		product.unidades = unidades;
	}

	
	public static void main(String[] args) {
		
	}

}
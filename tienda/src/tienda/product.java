package tienda;

public class product {
	
	private String nombre_producto;
	private String localizacion;
	private int unidades;

	public product(String nombre_producto, String localizacion, int unidades) {
		this.nombre_producto=nombre_producto;
		this.localizacion=localizacion;
		this.unidades=unidades;
	}
	
	
	public String getNombre_producto() {
		return nombre_producto;
	}
	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}

	
	public String getLocalizacion() {
		return localizacion;
	}
	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}

	
	public int getUnidades() {
		return unidades;
	}
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	
	public static void main(String[] args) {
		
	}

}

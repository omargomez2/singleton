package net.osgg.singleton;

public class Institucion {
	
	private static Institucion INSTANCIA;
	
	private String nombre;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private Institucion() {
		
	}
	
	public static Institucion getInstancia() {
		if (INSTANCIA == null)
			INSTANCIA = new Institucion();
		return INSTANCIA;
	}
}

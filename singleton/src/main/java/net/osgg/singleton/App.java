package net.osgg.singleton;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Institucion i = Institucion.getInstancia();
		Institucion i2 = Institucion.getInstancia();
		
		i.setNombre("ESPOCH");
		
		System.out.println("El nombre de la institución es: " + i.getNombre());
		
		i2.setNombre("UNACH");
		
		System.out.println("El nombre de la institución 2 es: " + i2.getNombre());
		
		System.out.println("El nombre de la institución es: " + i.getNombre());
    }
}

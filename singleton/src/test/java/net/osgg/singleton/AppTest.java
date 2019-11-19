package net.osgg.singleton;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import net.osgg.singleton.Institucion;;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testOne()
    {
    	Institucion i = Institucion.getInstancia();
		
		i.setNombre("ESPOCH");
		assertEquals("ESPOCH", i.getNombre() );
		
    }
    
    public void testTwo()
    {
    	Institucion i = Institucion.getInstancia();
		Institucion i2 = Institucion.getInstancia();
		
		i.setNombre("ESPOCH");
		assertEquals("ESPOCH", i.getNombre() );
		
		i2.setNombre("UNACH");
        assertEquals("ESPOCH", i.getNombre() );
    }
}

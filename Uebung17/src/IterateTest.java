import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * TestKlasse: IterateTest
 *
 * @author  Nico Spanier, Matthias Tritt
 * @version 08.05.18
 */
public class IterateTest
{
    
    Iterate iterate;
    private final double FEHLER_TOLERANZ = 0.001;

    /**
     * Wird vor jeder Test-Methode aufgerufen.
     */
     @Before
    public void setUp() {
	 iterate = new Iterate();
    }

    /**
     * Testet die den Lambda-Ausdruck der Funktion apply, mit der Methode functionI()
     * Getestet wird hierbei die Funktion f(x) = 2x
     */
    @Test
    public void functionITest() {
	
	double wert = iterate.functionI(2.0, 4);
	
	double testWert = 2.0*2*2*2*2;
	
	String fehler = "Die functionI-Methode funktioniert nicht richtig!";
	
	assertEquals(fehler, testWert, wert,  FEHLER_TOLERANZ);
    }
    
    /**
     * Testet die den Lambda-Ausdruck der Funktion apply, mit der Methode functionII()
     * Getestet wird hierbei die Funktion f(x) = 0.5x
     */
    @Test
    public void functionIITest() {
	
	double wert = iterate.functionII(4.2, 3);
	
	double testWert = 4.2*0.5*0.5*0.5;
	
	String fehler = "Die functionII-Methode funktioniert nicht richtig!";
	
	assertEquals(fehler, testWert, wert,  FEHLER_TOLERANZ);
    }
    
    /**
     * Testet die den Lambda-Ausdruck der Funktion apply, mit der Methode functionI()
     * Getestet wird hierbei die Funktion f(x) = a*x*(x-1) mit a>0 und a<1
     */
    @Test
    public void functionIIITest() {
	
	double wert = iterate.functionIII(12.0,5,0.5);
	
	double testWert = 0.1; //Erfundener Wert, muss noch geändert werden!!!!!!!
	
	String fehler = "Die functionIII-Methode funktioniert nicht richtig!";
	
	assertEquals(fehler, testWert, wert,  FEHLER_TOLERANZ);
    }
    
    
    
    

}

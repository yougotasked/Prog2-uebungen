import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
import java.util.function.Predicate;

/**
 * TestKlasse: LagerTest
 *
 * @author Nico Spanier, Matthias Tritt
 * @version 08.05.18
 */
public class LagerTest {

    Lager lager;

    /**
     * Wird vor jeder Test-Methode aufgerufen.
     */
    @Before
    public void setUp() {
	lager = new Lager(10);
    }

    /**
     * Testet die filter-Methode Filtert alle Artikel, die teuer als 200€ sind.
     */
    @Test
    public void filterNachPreisTest() {
	Artikel buch = new Artikel(1111, "Buch", 10, 5.0);
	Artikel tisch = new Artikel(2222, "Tisch", 90, 30.0);
	Artikel fernseher = new Artikel(3333, "Fernseher", 42, 799.99);
	Artikel handy = new Artikel(4444, "Handy", 120, 250.0);
	lager.anlegen(buch);
	lager.anlegen(tisch);
	lager.anlegen(fernseher);
	lager.anlegen(handy);

	Predicate<Artikel> teuerAls200 = (Artikel a) -> a.getPreis() > 200.0;

	ArrayList<Artikel> testListe = lager.filter(teuerAls200);

	assertEquals("Die Filter-Methode funktioniert nicht richtig!", testListe.get(0), fernseher);
	assertEquals("Die Filter-Methode funktioniert nicht richtig!", testListe.get(1), handy);

    }

    /**
     * Testet die filter-Methode Filtert alle Artikel, von denen es weniger als 50
     * gibt.
     */
    @Test
    public void filterNachBestandTest() {
	Artikel buch = new Artikel(1111, "Buch", 10, 5.0);
	Artikel tisch = new Artikel(2222, "Tisch", 90, 30.0);
	Artikel fernseher = new Artikel(3333, "Fernseher", 42, 799.99);
	Artikel handy = new Artikel(4444, "Handy", 120, 250.0);
	lager.anlegen(buch);
	lager.anlegen(tisch);
	lager.anlegen(fernseher);
	lager.anlegen(handy);

	Predicate<Artikel> bestandKleinerAls50 = (Artikel a) -> a.getBestand() < 50;

	ArrayList<Artikel> testListe = lager.filter(bestandKleinerAls50);

	String fehler = "Die Filter-Methode funktioniert nicht richtig!";
	assertEquals(fehler, testListe.get(0), buch);
	assertEquals(fehler, testListe.get(1), fernseher);

    }

    /**
     * Testet die sortByAlphabet-Methode
     */
    @Test
    public void sortiereLexikalischTest() {
	// Artikel anlegen
	Artikel buch = new Artikel(1111, "Buch", 10, 5.0);
	Artikel tisch = new Artikel(2222, "Tisch", 90, 30.0);
	Artikel fernseher = new Artikel(3333, "Fernseher", 42, 799.99);
	Artikel handy = new Artikel(4444, "Handy", 120, 250.0);
	lager.anlegen(buch);
	lager.anlegen(tisch);
	lager.anlegen(fernseher);
	lager.anlegen(handy);

	ArrayList<Artikel> sortierteListe = lager.sortByAlphabet();

	String fehler = "Die sortByAlphabet-Methode funktioniert nicht richtig!";
	assertEquals(fehler, sortierteListe.get(0), buch);
	assertEquals(fehler, sortierteListe.get(1), fernseher);
	assertEquals(fehler, sortierteListe.get(2), handy);
	assertEquals(fehler, sortierteListe.get(3), tisch);

    }
    
    /**
     * Testet die sortByBestand-Methode
     */
    @Test
    public void sortiereNachBestandTest() {
	// Artikel anlegen
	Artikel buch = new Artikel(1111, "Buch", 10, 5.0);
	Artikel tisch = new Artikel(2222, "Tisch", 90, 30.0);
	Artikel fernseher = new Artikel(3333, "Fernseher", 42, 799.99);
	Artikel handy = new Artikel(4444, "Handy", 120, 250.0);
	lager.anlegen(buch);
	lager.anlegen(tisch);
	lager.anlegen(fernseher);
	lager.anlegen(handy);

	ArrayList<Artikel> sortierteListe = lager.sortByBestand();

	String fehler = "Die sortByBestand-Methode funktioniert nicht richtig!";
	assertEquals(fehler, sortierteListe.get(0), buch);
	assertEquals(fehler, sortierteListe.get(1), fernseher);
	assertEquals(fehler, sortierteListe.get(2), tisch);
	assertEquals(fehler, sortierteListe.get(3), handy);

    }
    
    /**
     * Testet die sortByBestand-Methode
     */
    @Test
    public void sortiereNachPreisTest() {
	// Artikel anlegen
	Artikel buch = new Artikel(1111, "Buch", 10, 5.0);
	Artikel tisch = new Artikel(2222, "Tisch", 90, 30.0);
	Artikel fernseher = new Artikel(3333, "Fernseher", 42, 799.99);
	Artikel handy = new Artikel(4444, "Handy", 120, 250.0);
	lager.anlegen(buch);
	lager.anlegen(tisch);
	lager.anlegen(fernseher);
	lager.anlegen(handy);

	ArrayList<Artikel> sortierteListe = lager.sortByPreis();

	String fehler = "Die sortByPreis-Methode funktioniert nicht richtig!";
	assertEquals(fehler, sortierteListe.get(0), buch);
	assertEquals(fehler, sortierteListe.get(1), tisch);
	assertEquals(fehler, sortierteListe.get(2), handy);
	assertEquals(fehler, sortierteListe.get(3), fernseher);

    }
    
    /**
     * Testet die applyToArticles-Methode, indem alle Artikel um 10% reduziert werden.
     */
    @Test
    public void reduziereAlleUm10Test() {
	// Artikel anlegen
	Artikel buch = new Artikel(1111, "Buch", 10, 50.0);
	Artikel handy = new Artikel(4444, "Handy", 120, 100.0);
	lager.anlegen(buch);
	lager.anlegen(handy);
	double testPreisFuerBuch = 45.0;
	double testPreisFuerHandy = 90.0;
	double fehlerToleranz = 0.001;
	
	lager.reduziereAlleUm10Prozent();
	
	String fehler = "Die reduziereAlleUm10-Methode funktioniert nicht richtig!";
	
	assertEquals(fehler, buch.getPreis(), testPreisFuerBuch, fehlerToleranz);
	assertEquals(fehler, handy.getPreis(), testPreisFuerHandy, fehlerToleranz);
	
    }
    
    /**
     * Testet die applyToArticles-Methode, indem bei allen Artikeln das Suffix 
     * " - Sonderangebot!" hinzugefügt wird.
     */
    @Test
    public void addSonderangebotSuffix() {
	// Artikel anlegen
	Artikel buch = new Artikel(1111, "Buch", 10, 50.0);
	Artikel handy = new Artikel(4444, "Handy", 120, 100.0);
	lager.anlegen(buch);
	lager.anlegen(handy);
	
	lager.addSonderangebotSuffix();
	
	String testBuchBezeichnung = "Buch - Sonderangebot!";
	String testHandyBezeichnung = "Handy - Sonderangebot!";
	
	String fehler = "die addSonderangebotSuffix-Methode funktioniert nicht richtig!";
	
	assertEquals(fehler, buch.getBezeichnung(), testBuchBezeichnung);
	assertEquals(fehler, handy.getBezeichnung(), testHandyBezeichnung);
	   
	
    }

}

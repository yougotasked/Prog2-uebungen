
/**
 * Klasse: ApplyFak, implementiert das Interface MyFunction
 * 
 * 
 * @author Nico Spanier, Matthias Tritt
 *
 */
public class ApplyFakTopLevel implements MyFunction {

    /**
     * Überschreibt die Methode apply des Interfaces MyFunction mit der Funktion:
     * f(x) = x!
     * 
     * @param Zahl
     *            die Fakultät, die berechnet werden soll
     * @return Zahl das Ergebnis von i!
     */
    @Override
    public int apply(int i) {
	return MyMathFunctions.fak(i);
    }

    /*
     * Innere Klasse: ApplyFakStaticNested, implementiert das Interface MyFunction
     */
    public static class ApplyFakStaticNested implements MyFunction {

	/**
	 * Überschreibt die Methode apply des Interfaces MyFunction mit der Funktion:
	 * f(x) = x!
	 * 
	 * @param Zahl
	 *            die Fakultät, die berechnet werden soll
	 * @return Zahl das Ergebnis von i!
	 */
	@Override
	public int apply(int i) {
	    // TODO Auto-generated method stub
	    return MyMathFunctions.fak(i);
	}

    }

}

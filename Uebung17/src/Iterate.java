/**
 * Klasse: Iterate
 * 
 * @author Nico Spanier, Matthias Tritt
 *
 */
public class Iterate {

    /**
     * Wendet eine Fuktion f mit dem x-Wert x n-mal auf sich selbst an.
     * 
     * @param x
     *            der x-Wert
     * @param n
     *            Zahl, wie oft sich die Funktion auf sich selbst anwenden soll
     * @param f
     *            die Funktion
     * @return das Ergebnis des Iterierens
     */
    public double iterate(double x, int n, DoubleFunction f) {
	for (int i = 0; i < n; i++) {
	    x = f.apply(x);
	}
	return x;
    }

    /**
     * Anwendung der iterate Methode mit f(x) = 2x
     * 
     * @param x
     *            der x-Wert
     * @param n
     *            Zahl, wie oft sich die Funktion auf sich selbst anwenden soll
     * @return das Ergebnis des Iterierens
     */
    public double functionI(double x, int n) {
	return iterate(x, n, (double d) -> 2 * d);
    }

    /**
     * Anwendung der iterate Methode mit f(x) = 0.5x
     * 
     * @param x
     *            der x-Wert
     * @param n
     *            Zahl, wie oft sich die Funktion auf sich selbst anwenden soll
     * @return das Ergebnis des Iterierens
     */
    public double functionII(double x, int n) {
	return iterate(x, n, (double d) -> 0.5 * d);
    }

    /**
     * Anwendung der iterate Methode mit f(x) = a*x*(x-1) mit a>0 und a<1
     * 
     * @param x
     *            der x-Wert
     * @param n
     *            Zahl, wie oft sich die Funktion auf sich selbst anwenden soll
     * @return das Ergebnis des Iterierens
     */
    public double functionIII(double x, int n, double a) {
	if (a > 0 && a < 1)
	    return iterate(x, n, (double d) -> a * d * (d - 1));
	else
	    throw new RuntimeException("a muss zwischen 0 und 1 liegen.");
    }

}

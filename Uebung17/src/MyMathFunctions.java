/**
 * Klasse: MyMathFunctions
 * 
 * Utility-Klasse
 * 
 * Beinhaltet statische Methoden für einfache Berechnugen
 * @author Nico Spanier, Matthias Tritt
 *
 */
public class MyMathFunctions {

    /**
     * Berechnet zu einem Wert i die i-te Fibonacci-Zahl
     * 
     * @param i
     *            die wie vielte Fibonacci-Zahl berechnet werden soll
     * @return zahl die Fibonacci-Zahl
     */
    public static int fib(int i) {
	if (i == 1 || i == 2)
	    return 1;
	else {
	    return fib(i - 1) + fib(i - 2);
	}
    }

    /**
     * Berechnet zu einer Zahl x die Fakultät x!
     * 
     * @param x		die Zahl x
     * @return Zahl	die Fakultät x!
     */
    public static int fak(int x) {
	if (x == 1)
	    return 1;
	else
	    return fak(x - 1);
    }
}
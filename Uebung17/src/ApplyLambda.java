import java.util.function.IntPredicate;

/**
 * Klasse: ApplyLambda
 * 
 * @author Nico Spanier, Matthias Tritt
 *
 */
public class ApplyLambda {

    private IntPredicate even = (int i) -> i % 2 == 0;
    
    private MyFunctionExtended square = (int i) -> i*i;
    
    
    public void printAllSquaresOfEvenNumbers(int a, int b) {
	applyAndPrint(a, b, square.conditionateInput(even));
    }
    


    /**
     * Berechnet die Funktionswerte einer Funktion von allen natürlichen Zahlen
     * zwischen zwei übergebenen Zahlen und gibt sie auf der Standardausgabe aus.
     * 
     * @param a
     *            die erste Zahl
     * @param b
     *            die zweite Zahl
     * @param f
     *            die Funktion
     */
    public void applyAndPrint(int a, int b, MyFunction f) {
	if (a <= 0 || b <= 0)
	    throw new RuntimeException("Die übergebenen Zahlen müssen natürlich sein!");

	for (int i = a; i <= b; i++) {
	    System.out.println(f.apply(i));
	}
    }

    /**
     * Realisiert die applyAndPrint Methode mit f(x) = x^2
     */
    public void functionI(int a, int b) {
	applyAndPrint(a, b, (int i) -> (int) Math.pow(i, 2.0));
    }

    /**
     * Realisiert die applyAndPrint Methode mit f(x) = x!
     */
    public void functionII(int a, int b) {
	applyAndPrint(a, b, (int i) -> MyMathFunctions.fak(i));
    }

    /**
     * Realisiert die applyAndPrint Methode mit f(x) = x^(x+1)
     */
    public void functionIII(int a, int b) {
	applyAndPrint(a, b, (int i) -> (int) Math.pow(i, i + 1));
    }

    /**
     * Realisiert die applyAndPrint Methode mit f(x) = fib(x)
     */
    public void functionIV(int a, int b) {
	applyAndPrint(a, b, (int i) -> MyMathFunctions.fib(i));

    }
    
    public void printGeradeQuadratzahlen(int a, int b) {
	
    }
}

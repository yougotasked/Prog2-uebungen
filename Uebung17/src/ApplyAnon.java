import java.util.function.IntPredicate;

/**
 * Klasse: ApplyAnon
 * 
 * @author Nico Spanier, Matthias Tritt
 *
 */
public class ApplyAnon {
    

    private IntPredicate odd = new IntPredicate() {

	@Override
	public boolean test(int i) {
	    return i % 2 != 0;
	}
    };
    
    private MyFunctionExtended fak = (int i) -> MyMathFunctions.fak(i);

    
    public void printAllOddFakNumbers(int a, int b) {
	applyAndPrint(a, b, fak.conditionateOutput(odd));
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
    public void funktionI(int a, int b, MyFunction f) {
	applyAndPrint(a, b, new MyFunction() {

	    @Override
	    public int apply(int i) {
		return (int) Math.pow(i, 2.0);
	    }

	});

    }

    /**
     * Realisiert die applyAndPrint Methode mit f(x) = x!
     */
    public void functionII(int a, int b) {
	applyAndPrint(a, b, new MyFunction() {

	    @Override
	    public int apply(int i) {
		return MyMathFunctions.fak(i);
	    }
	});
    }

    /**
     * Realisiert die applyAndPrint Methode mit f(x) = x^(x+1)
     */
    public void functionIII(int a, int b) {
	applyAndPrint(a, b, new MyFunction() {

	    @Override
	    public int apply(int i) {
		return (int) Math.pow(i, i + 1);
	    }

	});
    }

    /**
     * Realisiert die applyAndPrint Methode mit f(x) = fib(x)
     */
    public void functionIV(int a, int b) {
	applyAndPrint(a, b, (int i) -> MyMathFunctions.fib(i));

    }

}

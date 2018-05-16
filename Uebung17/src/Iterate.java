
public class Iterate {
    

    public double iterate(double x, int n, DoubleFunction f) {
	for (int i = 0; i < n; i++) {
	    x = f.apply(x);
	}
	return x;
    }

    public double functionI(double x, int n) {
	return iterate(x, n, d -> 2 * x);
    }
    
    public double functionII(double x, int n) {
	return iterate(x, n, (double d) -> 0.5 * x);
    }

    public double functionIII(double x, int n, double a) {
	if (a > 0 && a < 1)
	    return iterate(x, n, (double d) -> a * x * (x - 1));
	else
	    throw new RuntimeException("a muss zwischen 0 und 1 liegen.");
    }

}

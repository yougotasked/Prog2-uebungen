import java.util.function.IntPredicate;

/**
 * Interface: MyFunction
 * 
 * @author Nico
 *
 */
@FunctionalInterface
public interface MyFunction {

    /**
     * Ordnet einer Zahl i mittels einer Funktion eine Zahl zu.
     * 
     * @param i
     *            die Zahl i
     * @return Zahl die zugeordnete Zahl
     */
    public int apply(int i);

    /**
     * Default-Methode
     * 
     * @param predicate
     * @return
     */
    public default int conditionateInput(IntPredicate predicate) {
	return (int i) -> {
	    if (predicate.test(Integer.valueOf(i))) {
		return apply(i);
	    }
	    else {
		return 0;
	    }

	};

    }

}
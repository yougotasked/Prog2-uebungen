import java.util.function.IntPredicate;

@FunctionalInterface
public interface MyFunctionExtended extends MyFunction {

    /**
     * Default-Methode conditionateInput Prüft, ob ein Integer ein Prädikat erfüllt
     * Wenn ja, gibt die Methode apply(i) zurück Wenn nein, gibt die Methode 0
     * zurück
     * 
     * @param predicate
     *            die Bedingung für die Integer
     * @return MyFunction ein Objekt des Interfaces MyFunction
     */
    public default MyFunction conditionateInput(IntPredicate predicate) {
	return (int i) -> {
	    if (predicate.test(i))
		return apply(i);
	    else
		return 0;
	};

    }

    /**
     * Default-Methode conditionateOutput Prüft, ob apply(i) ein Prädikat erfüllt
     * Wenn ja, gibt die Methode apply(i) zurück Wenn nein, gibt die Methode 0
     * zurück
     * 
     * @param predicate
     *            die Bedingung für die Integer
     * @return MyFunction ein Objekt des Interfaces MyFunction
     */
    public default MyFunction conditionateOutput(IntPredicate predicate) {
	return (int i) -> {
	    int value = apply(i);
	    if (predicate.test(value))
		return value;
	    else
		return 0;
	};

    }

}

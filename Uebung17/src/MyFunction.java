/**
 * Interface: MyFunction
 * @author Nico
 *
 */
@FunctionalInterface
public interface MyFunction {
    
    
    /**
     * Ordnet einer Zahl i mittels einer Funktion eine Zahl zu.
     * 
     * @param i		die Zahl i
     * @return Zahl	die zugeordnete Zahl
     */
    public int apply(int i);
    
    /**
     * Default-Methode
     * 
     * @param predicate
     * @return
     */
    public default boolean conditionateInput(boolean predicate) {
	
    }
    
}
/**
 * Funktionales Interface: DoubleFunction
 * 
 * Behinhaltet die abstrakte Methode apply
 * 
 * @author Nico Spanier, Matthias Tritt
 * @version 21.05.18
 *
 */
@FunctionalInterface
public interface DoubleFunction {

    /**
     * Ordnet einer double Zahl x mittels einer Funktion eine double Zahl zu.
     * 
     * @param x
     *            die Zahl x
     * @return Zahl die zugeordnete Zahl
     */
    public double apply(double x);

}

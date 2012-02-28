/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cashregister;

/**
 *
 * @author Neal
 */
public interface DiscStrategy {
    public double getDiscount(double qty, double price);
}

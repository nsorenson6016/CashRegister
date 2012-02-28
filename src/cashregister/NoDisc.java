/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cashregister;

/**
 *
 * @author Neal
 */
public class NoDisc implements DiscStrategy {
    double discount = 0.0;
    
    public NoDisc(){}
    
    public double getDiscount (double qty, double price){
        return discount;
    }
}

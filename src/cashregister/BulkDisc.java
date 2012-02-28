/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cashregister;

/**
 *
 * @author Neal
 */
public class BulkDisc implements DiscStrategy {
    private double discRate = 0.10;
    private double minQty = 5;
    
    public BulkDisc(){}
    
    public final double getDiscount (double qty, double price){
        if(qty >= minQty) {
            return qty * price * getDiscRate();
        } else {
            return qty * price;
        }
    }

    public final double getDiscRate() {
        return discRate;
    }

    public void setDiscRate(double discRate) {
        this.discRate = discRate;
    }

    public final double getMinQty() {
        return minQty;
    }

    public void setMinQty(double minQty) {
        this.minQty = minQty;
    }
    
}

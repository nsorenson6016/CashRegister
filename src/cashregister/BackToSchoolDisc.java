/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cashregister;

/**
 *
 * @author Neal
 */
public class BackToSchoolDisc implements DiscStrategy {  
    private double discRate = 0.10;
    
    public BackToSchoolDisc(){}
       
    public final double getDiscount (double qty, double price){
        return qty * price * getDiscRate();
    }

    /**
     * @return the discRate
     */
    public final double getDiscRate() {
        return discRate;
    }

    /**
     * @param discRate the discRate to set
     */
    public void setDiscRate(double discRate) {
        this.discRate = discRate;
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cashregister;

/**
 *
 * @author nsorenson
 */
public class StartUp {

    /**
     * One thing I wish I knew how to do better is produce the data in nicely
     * organized columns.  All of the data works.  The columns are just not 
     * well-aligned.
     */
    public static void main(String[] args) {
        CashRegister cr = new CashRegister();
        
        cr.startNewSale("B111");
        cr.addProduct("S229", 5);
        cr.addProduct("T848", 1);
        cr.addProduct("S336", 15);
        cr.finalizeSale();
    }
}

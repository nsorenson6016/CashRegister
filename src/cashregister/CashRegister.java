/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cashregister;

/**
 *
 * @author Neal
 */
public class CashRegister {
    Invoice inv;
    
    public void startNewSale(String custNo){
        inv = new Invoice (custNo);
    }
    
    public void addProduct(String prodID, double qty){
        inv.addItem(prodID, qty);
    }
    
    public void finalizeSale(){
        inv.getReceipt();
    }
    
}

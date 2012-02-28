/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cashregister;

import java.text.NumberFormat;

/**
 *
 * @author Neal_2
 */
public class Invoice {
    private Customer c;
    private LineItem [] boughtArray;
    private final double SALES_TAX_RATE = 0.056;
    private double grandSubTotal=0.0;
    
    public Invoice (String custID) 
//        String prodID, double qty)
            {
        c = new Customer(custID);
//        LineItem [] buyArray = {new LineItem (prodID, qty)};
//        this.boughtArray = buyArray;
    }
      
    public void getReceipt(){
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        System.out.println("Name: " + c.getCustName());
        System.out.println("  ID: " + c.getCustID());
        System.out.println();
        System.out.println("Product ID\tDescription\t\tPrice\t  Qty.\tDiscount"
                + "\tSubTotal");
        System.out.println("----------\t-----------\t\t-----\t  ----\t--------"
                + "\t--------");
        
        for (int i = 0; i < boughtArray.length; i++){
        System.out.println("    " + boughtArray[i].getProductID() + "\t" +
                boughtArray[i].getDesc() + "\t\t" +
                nf.format(boughtArray[i].getUnitCost()) + "\t  " +
                boughtArray[i].getQty() + "\t" + 
                nf.format(boughtArray[i].getDiscount()) + "\t\t" +
                nf.format(boughtArray[i].getsubTotal()));
        grandSubTotal = grandSubTotal + boughtArray[i].getsubTotal();
    }   
        System.out.println();
        System.out.println("   Subtotal:  " + nf.format(grandSubTotal));
        System.out.println("        Tax:  " + nf.format(getTax()));
        System.out.println("Grand Total:  " + nf.format(getGrandTotal()));
    }
        
    
    public final double getGrandTotal(){
            return (grandSubTotal * (1+ SALES_TAX_RATE));
        }
    
    public final double getTax(){
        return (grandSubTotal * SALES_TAX_RATE);
    }
    
    public void addItem(String prodID, double qty){
        LineItemData lid = new LineItemData(boughtArray);
        if (boughtArray == null){
            LineItem [] items = {new LineItem(prodID, qty)};
            boughtArray = items;
        }
        else{
            lid.addItem(boughtArray, prodID,qty);
            boughtArray = lid.getItems();
        }
    }
       
}

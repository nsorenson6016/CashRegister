/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cashregister;

/**
 *
 * @author nsorenson
 */
public class ProductData {
    
    public static BackToSchoolDisc bsd = new BackToSchoolDisc();
    public static BackToSchoolDisc noteDisc = new BackToSchoolDisc();
    public static BulkDisc bd = new BulkDisc();
    
    static {
        bsd.setDiscRate(.10);
        noteDisc.setDiscRate(.15);
    }
    
    Product [] prod = {
        new Product ("P224","Box of pencils",1.29, bsd),
        new Product ("S336","Spriral notebook",1.79, noteDisc),
        new Product ("S229","Shirt",9.99, bd),
        new Product ("T848","Television",299.99, new NoDisc())
    };    
    
    public final Product findItem(String prodID){
        Product p = new Product("XXXX","PRODUCT NOT FOUND",0.00,new NoDisc());
        for (int i = 0;i < prod.length;i++){
            if (prodID.equals(prod[i].getProductID())) p = prod[i];
        }
        return p;
    }
}
